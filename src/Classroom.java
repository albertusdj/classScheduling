import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private String name;
    private int capacity;
    private List<Facility> facilities;

    public Classroom(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;

        facilities = new ArrayList<>();
    }

    @Override
    public String toString() {
        return name + " with capacity " + getCapacity() + " and facilities " + facilities.toString();
    }

    public void addFacility(Facility f){
        facilities.add(f);
    }

    public List<Facility> getFacility() {
        return facilities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}

