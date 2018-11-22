import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private String name;
    private int capacity;
    private List<Facility> facilities;
    private boolean[][] taken;

    public Classroom(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;

        facilities = new ArrayList<>();

        taken = new boolean[5][11];

        for(int i=0; i<5; i++) {
            for(int j=0; j<11; j++) {
                taken[i][j] = false;
            }
        }
    }

    public boolean isTaken(int day, int hour) {
        return taken[day][hour];
    }

    public void reverseTaken(int day, int hour) {
        taken[day][hour] = !taken[day][hour];
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

