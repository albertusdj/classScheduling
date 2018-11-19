// Generated from C:/Users/User/ClassScheduling/src\Classroom.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ClassroomParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ClassroomVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ClassroomParser#classroom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassroom(ClassroomParser.ClassroomContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassroomParser#facility}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFacility(ClassroomParser.FacilityContext ctx);
}