import java.util.ArrayList;

public class Lecturer {
    private String name;
    private ArrayList<TimeSlot> availability;

    public Lecturer(String name) {
        this.name = name;
        availability = new ArrayList<TimeSlot>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<TimeSlot> getAvailability(){
        return availability;
    }

    public void addTimeSlot(TimeSlot t) {
        availability.add(t);
    }
}
