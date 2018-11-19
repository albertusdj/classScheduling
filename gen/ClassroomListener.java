// Generated from C:/Users/User/ClassScheduling/src\Classroom.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ClassroomParser}.
 */
public interface ClassroomListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ClassroomParser#classroom}.
	 * @param ctx the parse tree
	 */
	void enterClassroom(ClassroomParser.ClassroomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassroomParser#classroom}.
	 * @param ctx the parse tree
	 */
	void exitClassroom(ClassroomParser.ClassroomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassroomParser#facility}.
	 * @param ctx the parse tree
	 */
	void enterFacility(ClassroomParser.FacilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassroomParser#facility}.
	 * @param ctx the parse tree
	 */
	void exitFacility(ClassroomParser.FacilityContext ctx);
}