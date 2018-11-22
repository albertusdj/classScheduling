import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private List<Classroom> classrooms;
    // lecturer[] lecturers
    private List<Course> course;
    private List<Lecturer> lecturer;

    public Schedule(){
        classrooms = new ArrayList<>();
        course = new ArrayList<>();
        lecturer = new ArrayList<>();
    }

    public List<Classroom> getClassrooms() {
        return classrooms;
    }

    public void addClassroom(Classroom cr) {
        classrooms.add(cr);
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
}
