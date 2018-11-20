import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.io.InputStream;

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
    public void exitClassrooms(ScheduleParser.ClassroomsContext ctx) {
        String name = (ctx.classroom(0).classroom_name().getText());
        System.out.println("test_name : " + name);
//        Facility f = new Facility(name, quantity);
//        s.addFacility(f);
    }

    @Override
    public void exitLecturer(ScheduleParser.LecturerContext ctx) {
//        String name = (ctx.NAME().getText());
//        int quantity = Integer.parseInt(ctx.NUM().getText());
//        Facility f = new Facility(name, quantity);
//        s.addFacility(f);
    }

    @Override
    public void exitCourse(ScheduleParser.CourseContext ctx) {
//        String name = (ctx.NAME().getText());
//        int quantity = Integer.parseInt(ctx.NUM().getText());
//        Facility f = new Facility(name, quantity);
//        s.addFacility(f);
    }

    @Override
    public void exitPreference(ScheduleParser.PreferenceContext ctx) {
//        String name = (ctx.NAME().getText());
//        int quantity = Integer.parseInt(ctx.NUM().getText());
//        Facility f = new Facility(name, quantity);
//        s.addFacility(f);
    }

    @Override
    public void exitConstraint(ScheduleParser.ConstraintContext ctx) {
//        String name = (ctx.NAME().getText());
//        int quantity = Integer.parseInt(ctx.NUM().getText());
//        Facility f = new Facility(name, quantity);
//        s.addFacility(f);
    }
}
