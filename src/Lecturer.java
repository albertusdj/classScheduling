import javafx.util.Pair;

import java.util.ArrayList;

public class Lecturer {
    private String name;
    private ArrayList<Pair<TimeSlot, Boolean>> availability;

    public Lecturer(String name) {
        this.name = name;
        availability = new ArrayList<Pair<TimeSlot, Boolean>>();
    }

    @Override
    public String toString() {
        String tsString = "";

        for (Pair<TimeSlot, Boolean> ts : availability) {
            tsString += ts.getKey().toString();
        }

        return this.name + " with timeslot " + tsString;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Pair<TimeSlot, Boolean>> getAvailability(){
        return availability;
    }

    public void addTimeSlot(TimeSlot t) {
        Time start = t.getStart();
        Time end = t.getEnd();

        long secondStart = 3600 * start.getHour() + 60 * start.getMinute() + start.getSecond();
        long secondEnd = 3600 * end.getHour() + 60 * end.getMinute() + end.getSecond();

        if (secondStart < secondEnd) {
            for (int i=start.getHour(); i<end.getHour(); i++) {
                Time startTemp = new Time(start.getDay(), i, 0, 0);
                Time endTemp = new Time(start.getDay(), i+1, 0, 0);

                availability.add(new Pair<>(new TimeSlot(startTemp, endTemp), new Boolean(true)));
            }
        }
        else {
            System.out.println("Timeslot error : " + t + " ignored");
        }
    }

    public void setTimeSlot(TimeSlot t, Boolean status) {
        for(int i=0; i<availability.size(); i++) {
            if(availability.get(i).getKey().equals(t)) {
                availability.set(i, new Pair<>(availability.get(i).getKey(), status));
            }
        }
    }
}
