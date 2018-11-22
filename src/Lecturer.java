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
        Time start = t.getStart();
        Time end = t.getEnd();

        long secondStart = 3600 * start.getHour() + 60 * start.getMinute() + start.getSecond();
        long secondEnd = 3600 * end.getHour() + 60 * end.getMinute() + end.getSecond();

        if (secondStart < secondEnd) {
            availability.add(t);
        }
        else {
            System.out.println("Timeslot error : " + t + " ignored");
        }
    }
}
