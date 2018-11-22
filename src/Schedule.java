import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private List<Classroom> classroom;
    private List<Course> course;
    private List<Lecturer> lecturer;

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

    private isFacili

    public void generate(){
        System.out.println(this.classroom);
        System.out.println(this.course);
        System.out.println(this.lecturer);

        ArrayList<ArrayList<Pair<Classroom,Course>>> timetable = new ArrayList<ArrayList<Pair<Classroom,Course>>>(5);
        for (ArrayList<Pair<Classroom, Course>> t : timetable) {
            t = new ArrayList<Pair<Classroom, Course>>(11);
        }

        for (Course c : this.course){
            String name = c.getLecturerName();

            Lecturer l = findLecturer(name);

            if (l != null) {
                ArrayList<TimeSlot> lecTs = l.getAvailability();

                for (TimeSlot currentTs : lecTs) {
                    for (Classroom cl : this.classroom) {
                        if (!cl.isTaken( convertDayToInt(currentTs.getStart().getDay()), currentTs.getStart().getHour())) {

                        }
                    }
                }
            }
        }
    }

    public class Timetable{

    }
}
