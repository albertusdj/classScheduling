// Generated from C:/Users/User/ClassScheduling/src\Schedule.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ScheduleParser}.
 */
public interface ScheduleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#schedule}.
	 * @param ctx the parse tree
	 */
	void enterSchedule(ScheduleParser.ScheduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#schedule}.
	 * @param ctx the parse tree
	 */
	void exitSchedule(ScheduleParser.ScheduleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#classrooms}.
	 * @param ctx the parse tree
	 */
	void enterClassrooms(ScheduleParser.ClassroomsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#classrooms}.
	 * @param ctx the parse tree
	 */
	void exitClassrooms(ScheduleParser.ClassroomsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#classroom}.
	 * @param ctx the parse tree
	 */
	void enterClassroom(ScheduleParser.ClassroomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#classroom}.
	 * @param ctx the parse tree
	 */
	void exitClassroom(ScheduleParser.ClassroomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#classroom_name}.
	 * @param ctx the parse tree
	 */
	void enterClassroom_name(ScheduleParser.Classroom_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#classroom_name}.
	 * @param ctx the parse tree
	 */
	void exitClassroom_name(ScheduleParser.Classroom_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#capacity}.
	 * @param ctx the parse tree
	 */
	void enterCapacity(ScheduleParser.CapacityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#capacity}.
	 * @param ctx the parse tree
	 */
	void exitCapacity(ScheduleParser.CapacityContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#facility}.
	 * @param ctx the parse tree
	 */
	void enterFacility(ScheduleParser.FacilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#facility}.
	 * @param ctx the parse tree
	 */
	void exitFacility(ScheduleParser.FacilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#facility_name}.
	 * @param ctx the parse tree
	 */
	void enterFacility_name(ScheduleParser.Facility_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#facility_name}.
	 * @param ctx the parse tree
	 */
	void exitFacility_name(ScheduleParser.Facility_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#quantity}.
	 * @param ctx the parse tree
	 */
	void enterQuantity(ScheduleParser.QuantityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#quantity}.
	 * @param ctx the parse tree
	 */
	void exitQuantity(ScheduleParser.QuantityContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#lecturers}.
	 * @param ctx the parse tree
	 */
	void enterLecturers(ScheduleParser.LecturersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#lecturers}.
	 * @param ctx the parse tree
	 */
	void exitLecturers(ScheduleParser.LecturersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#lecturer}.
	 * @param ctx the parse tree
	 */
	void enterLecturer(ScheduleParser.LecturerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#lecturer}.
	 * @param ctx the parse tree
	 */
	void exitLecturer(ScheduleParser.LecturerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#lecturer_name}.
	 * @param ctx the parse tree
	 */
	void enterLecturer_name(ScheduleParser.Lecturer_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#lecturer_name}.
	 * @param ctx the parse tree
	 */
	void exitLecturer_name(ScheduleParser.Lecturer_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#datetime}.
	 * @param ctx the parse tree
	 */
	void enterDatetime(ScheduleParser.DatetimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#datetime}.
	 * @param ctx the parse tree
	 */
	void exitDatetime(ScheduleParser.DatetimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#day}.
	 * @param ctx the parse tree
	 */
	void enterDay(ScheduleParser.DayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#day}.
	 * @param ctx the parse tree
	 */
	void exitDay(ScheduleParser.DayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(ScheduleParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(ScheduleParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ScheduleParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ScheduleParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(ScheduleParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(ScheduleParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#courses}.
	 * @param ctx the parse tree
	 */
	void enterCourses(ScheduleParser.CoursesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#courses}.
	 * @param ctx the parse tree
	 */
	void exitCourses(ScheduleParser.CoursesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#course}.
	 * @param ctx the parse tree
	 */
	void enterCourse(ScheduleParser.CourseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#course}.
	 * @param ctx the parse tree
	 */
	void exitCourse(ScheduleParser.CourseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#course_name}.
	 * @param ctx the parse tree
	 */
	void enterCourse_name(ScheduleParser.Course_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#course_name}.
	 * @param ctx the parse tree
	 */
	void exitCourse_name(ScheduleParser.Course_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#credits}.
	 * @param ctx the parse tree
	 */
	void enterCredits(ScheduleParser.CreditsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#credits}.
	 * @param ctx the parse tree
	 */
	void exitCredits(ScheduleParser.CreditsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#preferences}.
	 * @param ctx the parse tree
	 */
	void enterPreferences(ScheduleParser.PreferencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#preferences}.
	 * @param ctx the parse tree
	 */
	void exitPreferences(ScheduleParser.PreferencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#preference}.
	 * @param ctx the parse tree
	 */
	void enterPreference(ScheduleParser.PreferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#preference}.
	 * @param ctx the parse tree
	 */
	void exitPreference(ScheduleParser.PreferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#constraints}.
	 * @param ctx the parse tree
	 */
	void enterConstraints(ScheduleParser.ConstraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#constraints}.
	 * @param ctx the parse tree
	 */
	void exitConstraints(ScheduleParser.ConstraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(ScheduleParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(ScheduleParser.ConstraintContext ctx);
}