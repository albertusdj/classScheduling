// Generated from C:/Users/irfanmim/Desktop/Kuliah Semester 7/Tugas-tugas/RPLSD Tubes 1/classScheduling/src\Schedule.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ScheduleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ScheduleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#schedule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchedule(ScheduleParser.ScheduleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#classrooms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassrooms(ScheduleParser.ClassroomsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#classroom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassroom(ScheduleParser.ClassroomContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#classroom_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassroom_name(ScheduleParser.Classroom_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#capacity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapacity(ScheduleParser.CapacityContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#facility}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFacility(ScheduleParser.FacilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#facility_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFacility_name(ScheduleParser.Facility_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#quantity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantity(ScheduleParser.QuantityContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#lecturers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLecturers(ScheduleParser.LecturersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#lecturer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLecturer(ScheduleParser.LecturerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#lecturer_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLecturer_name(ScheduleParser.Lecturer_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#datetime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetime(ScheduleParser.DatetimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay(ScheduleParser.DayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(ScheduleParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ScheduleParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(ScheduleParser.EndContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#courses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCourses(ScheduleParser.CoursesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#course}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCourse(ScheduleParser.CourseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#course_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCourse_name(ScheduleParser.Course_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#credits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCredits(ScheduleParser.CreditsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#preferences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreferences(ScheduleParser.PreferencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#preference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreference(ScheduleParser.PreferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#constraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraints(ScheduleParser.ConstraintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScheduleParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(ScheduleParser.ConstraintContext ctx);
}