import java.text.SimpleDateFormat;

public class Time {
    private String day;
    private int hour;
    private int minute;
    private int second;

    public Time(String day, int hour, int minute, int second) {
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String getDay(){
        return this.day;
    }

    public int getHour(){
        return this.hour;
    }

    public int getMinute(){
        return this.minute;
    }

    public int getSecond(){
        return this.second;
    }

    @Override
    public String toString() {
        return day + " " + hour + ":" + minute + ":" + second;
    }
}
