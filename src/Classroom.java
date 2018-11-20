import java.util.ArrayList;
import java.util.List;

public class Classroom {
    // PIC : Sylvia

    private List<Facility> facilities;

    public Classroom() {
        facilities = new ArrayList<>();
    }

    public void addFacility(Facility facility){
        getFacility().add(facility);
    }

    public List<Facility> getFacility() {
        return facilities;
    }

    public static void printClassroom(Classroom c){
        System.out.println("Facilities...");
        for (Facility f : c.getFacility()) {
            System.out.println(f);
        }
    }

}

