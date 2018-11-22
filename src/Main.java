import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        //Reading the DSL script
        InputStream is =
                ClassLoader.getSystemResourceAsStream("resources/schedule.txt");

        //Loading the DSL script into the ANTLR stream.
        CharStream cs = new ANTLRInputStream(is);

        //Passing the input to the lexer to create tokens
        ScheduleLexer lexer = new ScheduleLexer(cs);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //Passing the tokens to the parser to create the parse trea.
        ScheduleParser parser = new ScheduleParser(tokens);

        //Semantic model to be populated
        Schedule s = new Schedule();

        //Adding the listener to facilitate walking through parse tree.
        parser.addParseListener(new MyScheduleBaseListener(s));

        //invoking the parser.
        parser.schedule();

        ///////////////////// NGETES AJA
        System.out.println(s.getCourse());
        System.out.println(s.getClassrooms());

        // Schedule.printSchedule(s); // TO-DO

    }
}

/**
 * Listener used for walking through the parse tree.
 */
class MyScheduleBaseListener extends ScheduleBaseListener {

    Schedule s;

    public MyScheduleBaseListener(Schedule s) {
        this.s = s;
    }

    @Override
    public void exitClassroom(ScheduleParser.ClassroomContext ctx) {
        String name = ctx.classroom_name().getText();
        int capacity = Integer.parseInt(ctx.capacity().getText());
        Classroom cr = new Classroom(name, capacity);
        for (ScheduleParser.FacilityContext f : ctx.facility()) {
            String facilityName = (f.facility_name().getText());
            int quantity = Integer.parseInt(f.quantity().getText());
            Facility facility = new Facility(facilityName, quantity);
            cr.addFacility(facility);
        }
        s.addClassroom(cr);
    }

    @Override
    public void exitLecturer(ScheduleParser.LecturerContext ctx) {
        String name = ctx.lecturer_name().getText();

        Lecturer l = new Lecturer(name);

        for (ScheduleParser.DatetimeContext d : ctx.datetime()) {
            String day = d.day().getText();

            for (ScheduleParser.TimeContext t : d.time()) {
                String completeTime = t.getText();
                String[] startEndTime = completeTime.split("-");

                String[] startTime = startEndTime[0].split(".");
                int startHour = Integer.parseInt(startTime[0]);
                int startMinute = Integer.parseInt(startTime[1]);
                int startSecond = 0;

                Time start = new Time(day, startHour, startMinute, startSecond);

                String[] endTime = startEndTime[1].split(".");
                int endHour = Integer.parseInt(endTime[0]);
                int endMinute = Integer.parseInt(endTime[1]);
                int endSecond = 0;

                Time end = new Time(day, endHour, endMinute, endSecond);

                TimeSlot ts = new TimeSlot(start, end);
                l.addTimeSlot(ts);
            }
        }

        s.addLecturer(l);
    }

    @Override
    public void exitCourse(ScheduleParser.CourseContext ctx) {
        String name = (ctx.course_name().getText());
        int capacity = Integer.parseInt(ctx.capacity().getText());
        String lecturerName = (ctx.lecturer_name().getText());
        int credits = Integer.parseInt(ctx.credits().getText());
        Course c = new Course(name, capacity, lecturerName, credits);
        for (ScheduleParser.FacilityContext f : ctx.facility()){
            String facilityName = (f.facility_name().getText());
            int quantity = Integer.parseInt(f.quantity().getText());
            Facility facility = new Facility(facilityName, quantity);
            c.addFacility(facility);
        }
        s.addCourse(c);
    }

    @Override
    public void exitPreferences(ScheduleParser.PreferencesContext ctx) {
        if (!ctx.preference().isEmpty()) {
            for (ScheduleParser.PreferenceContext p : ctx.preference()){
                String courseName = (p.course_name().getText());
                try {
                    Course course = s.findCourse(courseName);
                    for (ScheduleParser.FacilityContext f : p.facility()){
                        String facilityName = (f.facility_name().getText());
                        int quantity = Integer.parseInt(f.quantity().getText());
                        Facility facility = new Facility(facilityName, quantity);
                        course.addPreferredFacility(facility);
                    }
                    for (ScheduleParser.DatetimeContext dt : p.datetime()) {
                        String day = (dt.day().getText());
                        for (ScheduleParser.TimeContext t : dt.time()) {
                            int startHour = Integer.parseInt(t.start().NUM(0).getText());
                            int startMinute = Integer.parseInt(t.start().NUM(1).getText());
                            int endHour = Integer.parseInt(t.end().NUM(0).getText());
                            int endMinute = Integer.parseInt(t.end().NUM(1).getText());
                            TimeSlot ts = new TimeSlot(new Time(day, startHour, startMinute, 0), new Time(day, endHour,endMinute,0));
                            course.addPreferredTime(ts);
                        }
                    }
                } catch (NullPointerException e){
                    System.out.println("Preference error: no course found "+courseName);
                }
            }
        }
    }

    @Override
    public void exitConstraints(ScheduleParser.ConstraintsContext ctx) {
        for (ScheduleParser.ConstraintContext c : ctx.constraint()){
            String courseName = (c.course_name().getText());
            try {
                Course course = s.findCourse(courseName);
                for (ScheduleParser.DatetimeContext dt : c.datetime()) {
                    String day = (dt.day().getText());
                    for (ScheduleParser.TimeContext t : dt.time()) {
                        int startHour = Integer.parseInt(t.start().NUM(0).getText());
                        int startMinute = Integer.parseInt(t.start().NUM(1).getText());
                        int endHour = Integer.parseInt(t.end().NUM(0).getText());
                        int endMinute = Integer.parseInt(t.end().NUM(1).getText());
                        TimeSlot ts = new TimeSlot(new Time(day, startHour, startMinute, 0), new Time(day, endHour,endMinute,0));
                        course.addConstraintTime(ts);
                    }
                }
            } catch (NullPointerException e){
                System.out.println("Constraint error: no course found "+courseName);
            }
        }
    }
}
