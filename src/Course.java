import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Course {
    // PIC : Audry
    private String name;
    private int capacity;
    private String lecturerName;
    private int credits;
    private List<Facility> facility;
    private List<Facility> preferredFacility;
    private List<TimeSlot> preferredTime;
    private List<TimeSlot> constraintTime;

    public Course(String name, int capacity, String lecturerName, int credits){
        this.name = name;
        this.capacity = capacity;
        this.lecturerName = lecturerName;
        this.credits = credits;

        facility = new ArrayList<>();
        preferredFacility = new ArrayList<>();
        preferredTime = new ArrayList<>();
        constraintTime = new ArrayList<>();
    }

    @Override
    public String toString() {
        return name + " req. facility: " + facility.toString() + " preferred facility: " + preferredFacility.toString() +" preferred time:"+ preferredTime.toString() +" constraint:"+ constraintTime.toString();
    }

    public void addFacility(Facility f){
        facility.add(f);
    }

    public List<Facility> getFacility() {
        return facility;
    }

    public void addPreferredFacility(Facility f){
        preferredFacility.add(f);
    }

    public List<Facility> getPreferredFacility() {
        return preferredFacility;
    }

    public void addPreferredTime(TimeSlot t){
        preferredTime.add(t);
    }

    public List<TimeSlot> getPreferredTime() {
        return preferredTime;
    }

    public void addConstraintTime(TimeSlot t){
        Time start = t.getStart();
        Time end = t.getEnd();

        long secondStart = 3600 * start.getHour() + 60 * start.getMinute() + start.getSecond();
        long secondEnd = 3600 * end.getHour() + 60 * end.getMinute() + end.getSecond();

        if (secondStart < secondEnd) {
            for (int i=start.getHour(); i<end.getHour(); i++) {
                Time startTemp = new Time(start.getDay(), i, 0, 0);
                Time endTemp = new Time(start.getDay(), i+1, 0, 0);

                constraintTime.add(new TimeSlot(startTemp, endTemp));
            }
        }
        else {
            System.out.println("Constraint error : " + t + " ignored");
        }
    }

    public List<TimeSlot> getConstraintTime() {
        return constraintTime;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getName (){
        return name;
    }

    public void setCapacity (int capacity){
        this.capacity = capacity;
    }

    public int getCapacity (){
        return capacity;
    }

    public void setLecturerName (String lecturer_name){
        this.lecturerName = lecturer_name;
    }

    public String getLecturerName (){
        return lecturerName;
    }

    public void setCredits (int credits){
        this.credits = credits;
    }

    public int getCredits (){
        return credits;
    }

}
