import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private List<Classroom> classroom;
    private List<Course> course;
    private List<Lecturer> lecturer;

    private ArrayList<ArrayList<ArrayList<Pair<String,String>>>> timetable;

    public Schedule(){
        classroom = new ArrayList<>();
        course = new ArrayList<>();
        lecturer = new ArrayList<>();
    }

    public List<Classroom> getClassroom() {
        return classroom;
    }

    public void addClassroom(Classroom cr) {
        classroom.add(cr);
    }

    public List<Course> getCourse(){
        return course;
    }

    public void addCourse(Course c){
        course.add(c);
    }

    public void addLecturer(Lecturer l) {
        lecturer.add(l);
    }

    public Course findCourse(String courseName){
        boolean found = false;
        int i = 0;
        while (i < course.size() && !found){
            if (course.get(i).getName().equals(courseName)){
                found=true;
            } else {
                i++;
            }
        }
        if (found) {
            return course.get(i);
        } else {
            return null;
        }
    }

    public Lecturer findLecturer(String lecturerName) {
        boolean found = false;

        int i = 0;
        while (i < lecturer.size() && !found){
            if (lecturer.get(i).getName().equals(lecturerName)){
                found=true;
            } else {
                i++;
            }
        }
        if (found) {
            return lecturer.get(i);
        } else {
            return null;
        }
    }

    private int convertDayToInt(String day) {
        day = day.toLowerCase();

        String[] days = {"senin", "selasa", "rabu", "kamis", "jumat"};

        for (int i=0; i<days.length; i++) {
            if(day.equals(days[i])){
                return i;
            }
        }

        return -1;
    }

    private String convertIntToDay(int i) {
        String[] days = {"senin", "selasa", "rabu", "kamis", "jumat"};
        return days[i];
    }

    private boolean isFacilityMatch(List<Facility> fClassroom, List<Facility> fCourse) {
        if (fCourse.size() > fClassroom.size()) {
            return false;
        }

        boolean match = true;

        int i = 0;

        while (match && i<fCourse.size()) {
            boolean found = false;
            for(int j=0; j<fClassroom.size(); j++){
                if(fCourse.get(i).getName().equals(fClassroom.get(j).getName()) && fCourse.get(i).getQuantity()==fClassroom.get(i).getQuantity()){
                    found = true;
                    break;
                }
            }
            i++;
            match = found;
        }

        return match;
    }

    private boolean isBreakConstraint(List<TimeSlot> constraint, TimeSlot ts) {
        for (int i=0; i<constraint.size(); i++){
            if(constraint.get(i).getStart().getDay().equals(ts.getStart().getDay()) && constraint.get(i).getStart().getHour() == ts.getStart().getHour()) {
                return true;
            }
        }
        return false;
    }

    private boolean isCourseOngoing(String name, TimeSlot t){
        int day = convertDayToInt(t.getStart().getDay());
        int hour = t.getStart().getHour()-7;

        ArrayList<Pair<String, String>> temp = timetable.get(day).get(hour);

        boolean found = false;

        for (Pair<String, String> item : temp) {
            if (item.getKey().equals(name)) {
                found = true;
                break;
            }
        }

        return found;
    }

    private boolean recursiveScheduler(int i) {
        if (i >= course.size()) {
            return true;
        }

        Course c = course.get(i);

        String name = c.getLecturerName();

        Lecturer l = findLecturer(name);

        if (l != null) {
            ArrayList<Pair<TimeSlot, Boolean>> lecTs = l.getAvailability();

            for (Pair<TimeSlot, Boolean> currentTs : lecTs) {
                for (Classroom cl : this.classroom) {
                    if (!isBreakConstraint(c.getConstraintTime(), currentTs.getKey())) {
                        if (!isCourseOngoing(c.getName(), currentTs.getKey())) {
                            if (!cl.isTaken(convertDayToInt(currentTs.getKey().getStart().getDay()), currentTs.getKey().getStart().getHour() - 7)) {
                                if (isFacilityMatch(cl.getFacility(), c.getFacility()) && cl.getCapacity() >= c.getCapacity()) {
                                    Pair<String, String> temp = new Pair<>(c.getName(), cl.getName());
                                    this.timetable.get(convertDayToInt(currentTs.getKey().getStart().getDay())).get(currentTs.getKey().getStart().getHour() - 7).add(temp);
                                    cl.reverseTaken(convertDayToInt(currentTs.getKey().getStart().getDay()), currentTs.getKey().getStart().getHour() - 7);
                                    l.setTimeSlot(currentTs.getKey(), false);

                                    c.setCredits(c.getCredits() - 1);

                                    if (c.getCredits() > 0) {
                                        if (recursiveScheduler(i)) {
                                            return true;
                                        }
                                    } else {
                                        if (recursiveScheduler(i + 1)) {
                                            return true;
                                        }
                                    }

                                    this.timetable.get(convertDayToInt(currentTs.getKey().getStart().getDay())).get(currentTs.getKey().getStart().getHour() - 7).remove(temp);
                                    cl.reverseTaken(convertDayToInt(currentTs.getKey().getStart().getDay()), currentTs.getKey().getStart().getHour() - 7);
                                    l.setTimeSlot(currentTs.getKey(), true);
                                    c.setCredits(c.getCredits() + 1);
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public boolean generate(){
        System.out.println(this.classroom);
        System.out.println(this.course);
        System.out.println(this.lecturer);
        List<TimeSlot> cccc = this.course.get(0).getConstraintTime();
        for (TimeSlot haha : cccc) {
            System.out.println(haha);
        }

        timetable = new ArrayList<ArrayList<ArrayList<Pair<String,String>>>>();

        for (int i=0; i<5; i++) {
            timetable.add(new ArrayList<ArrayList<Pair<String, String>>>());
            for (int j=0; j<11; j++) {
                timetable.get(i).add(new ArrayList<Pair<String, String>>());
            }
        }

        if (course.isEmpty()) {
            System.out.println("Course is empty");
            return false;
        }

        if (recursiveScheduler(0) == false) {
            System.out.println("Can not be scheduled");
            return false;
        }

        return true;
    }

    public void printSchedule() {
        for (int i=0; i<timetable.size(); i++) {
            System.out.println("-------------------------------");
            System.out.println(convertIntToDay(i));
            System.out.println(" ");
            for (int j=0; j<timetable.get(i).size(); j++) {
                int h1 = j+7;
                int h2 = j+8;
                System.out.println(h1 + ":00 - " + h2 + ":00");
                System.out.println(" ");
                for (int k=0; k<timetable.get(i).get(j).size(); k++) {
                    System.out.println(timetable.get(i).get(j).get(k).getKey() + " " + timetable.get(i).get(j).get(k).getValue());
                }
                System.out.println(" ");
            }
            System.out.println("-------------------------------");
        }
    }
}
