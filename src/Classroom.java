import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Classroom {
    private List<Facility> facilities;

    public Classroom() {
        facilities = new ArrayList<>();
    }

    public void addFacility(Facility facility){
        getFacility().add(facility);
    }

    public List<Facility> getFacility() {
        return facilities;
    }

    public static void printClassroom(Classroom c){
        System.out.println("Facilities...");
        for (Facility f : c.getFacility()) {
            System.out.println(f);
        }
    }

    public static void main(String[] args) throws IOException {
        //Reading the DSL script
        InputStream is =
                ClassLoader.getSystemResourceAsStream("resources/classroom-1.txt");

        //Loading the DSL script into the ANTLR stream.
        CharStream cs = new ANTLRInputStream(is);

        //Passing the input to the lexer to create tokens
        ClassroomLexer lexer = new ClassroomLexer(cs);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //Passing the tokens to the parser to create the parse trea.
        ClassroomParser parser = new ClassroomParser(tokens);

        //Semantic model to be populated
        Classroom c = new Classroom();

        //Adding the listener to facilitate walking through parse tree.
        parser.addParseListener(new MyClassroomBaseListener(c));

        //invoking the parser.
        parser.classroom();

        Classroom.printClassroom(c);

    }
}

/**
 * Listener used for walking through the parse tree.
 */
class MyClassroomBaseListener extends ClassroomBaseListener {

    Classroom c;

    public MyClassroomBaseListener(Classroom c) {
        this.c = c;
    }

    @Override
    public void exitFacility(ClassroomParser.FacilityContext ctx) {
        String name = (ctx.NAME().getText());
        int quantity = Integer.parseInt(ctx.NUM().getText());
        Facility f = new Facility(name, quantity);
        c.addFacility(f);
    }
}