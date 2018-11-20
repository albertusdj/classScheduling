public class TimeSlot {
    private Time start;
    private Time end;

    public TimeSlot(Time start, Time end) {
        this.start = start;
        this.end = end;
    }

    public Time getStart() {
        return this.start;
    }

    public Time getEnd() {
        return this.end;
    }
}
