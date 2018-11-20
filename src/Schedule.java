import java.util.ArrayList;
import java.util.List;

public class Schedule {
    // classroom[] classrooms
    // lecturer[] lecturers
    private List<Course> course;

    public Schedule(){
        course = new ArrayList<>();
    }

    public List<Course> getCourse(){
        return course;
    }

    public void addCourse(Course c){
        course.add(c);
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
