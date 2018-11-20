// Generated from C:/Users/User/ClassScheduling/src\Schedule.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScheduleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		NUM=25, ALPHABET=26, ALPHANUMERIC=27;
	public static final int
		RULE_schedule = 0, RULE_classrooms = 1, RULE_classroom = 2, RULE_classroom_name = 3, 
		RULE_capacity = 4, RULE_facility = 5, RULE_facility_name = 6, RULE_quantity = 7, 
		RULE_lecturers = 8, RULE_lecturer = 9, RULE_lecturer_name = 10, RULE_datetime = 11, 
		RULE_day = 12, RULE_time = 13, RULE_start = 14, RULE_end = 15, RULE_courses = 16, 
		RULE_course = 17, RULE_course_name = 18, RULE_credits = 19, RULE_preferences = 20, 
		RULE_preference = 21, RULE_constraints = 22, RULE_constraint = 23;
	public static final String[] ruleNames = {
		"schedule", "classrooms", "classroom", "classroom_name", "capacity", "facility", 
		"facility_name", "quantity", "lecturers", "lecturer", "lecturer_name", 
		"datetime", "day", "time", "start", "end", "courses", "course", "course_name", 
		"credits", "preferences", "preference", "constraints", "constraint"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Schedule {'", "'}'", "'Classroom {'", "'['", "']{'", "'('", "')'", 
		"'Lecturer {'", "'{'", "','", "'-'", "'.'", "'Course {'", "'{ capacity ('", 
		"') facility { '", "' } lecturer_name ('", "') credits ('", "')}'", "'Preferences {'", 
		"'{ facility {'", "'} time {'", "'} }'", "'Constraints {'", "'{ time {'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "NUM", "ALPHABET", "ALPHANUMERIC"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Schedule.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ScheduleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ScheduleContext extends ParserRuleContext {
		public ClassroomsContext classrooms() {
			return getRuleContext(ClassroomsContext.class,0);
		}
		public LecturersContext lecturers() {
			return getRuleContext(LecturersContext.class,0);
		}
		public CoursesContext courses() {
			return getRuleContext(CoursesContext.class,0);
		}
		public PreferencesContext preferences() {
			return getRuleContext(PreferencesContext.class,0);
		}
		public ConstraintsContext constraints() {
			return getRuleContext(ConstraintsContext.class,0);
		}
		public ScheduleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schedule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).enterSchedule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).exitSchedule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScheduleVisitor ) return ((ScheduleVisitor<? extends T>)visitor).visitSchedule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScheduleContext schedule() throws RecognitionException {
		ScheduleContext _localctx = new ScheduleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_schedule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__0);
			setState(49);
			classrooms();
			setState(50);
			lecturers();
			setState(51);
			courses();
			setState(52);
			preferences();
			setState(53);
			constraints();
			setState(54);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassroomsContext extends ParserRuleContext {
		public List<ClassroomContext> classroom() {
			return getRuleContexts(ClassroomContext.class);
		}
		public ClassroomContext classroom(int i) {
			return getRuleContext(ClassroomContext.class,i);
		}
		public ClassroomsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classrooms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).enterClassrooms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).exitClassrooms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScheduleVisitor ) return ((ScheduleVisitor<? extends T>)visitor).visitClassrooms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassroomsContext classrooms() throws RecognitionException {
		ClassroomsContext _localctx = new ClassroomsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classrooms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__2);
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				classroom();
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ALPHANUMERIC );
			setState(62);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassroomContext extends ParserRuleContext {
		public Classroom_nameContext classroom_name() {
			return getRuleContext(Classroom_nameContext.class,0);
		}
		public CapacityContext capacity() {
			return getRuleContext(CapacityContext.class,0);
		}
		public List<FacilityContext> facility() {
			return getRuleContexts(FacilityContext.class);
		}
		public FacilityContext facility(int i) {
			return getRuleContext(FacilityContext.class,i);
		}
		public ClassroomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classroom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).enterClassroom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).exitClassroom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScheduleVisitor ) return ((ScheduleVisitor<? extends T>)visitor).visitClassroom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassroomContext classroom() throws RecognitionException {
		ClassroomContext _localctx = new ClassroomContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classroom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			classroom_name();
			setState(65);
			match(T__3);
			setState(66);
			capacity();
			setState(67);
			match(T__4);
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				facility();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ALPHABET );
			setState(73);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Classroom_nameContext extends ParserRuleContext {
		public TerminalNode ALPHANUMERIC() { return getToken(ScheduleParser.ALPHANUMERIC, 0); }
		public Classroom_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classroom_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).enterClassroom_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).exitClassroom_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScheduleVisitor ) return ((ScheduleVisitor<? extends T>)visitor).visitClassroom_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Classroom_nameContext classroom_name() throws RecognitionException {
		Classroom_nameContext _localctx = new Classroom_nameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classroom_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(ALPHANUMERIC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CapacityContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(ScheduleParser.NUM, 0); }
		public CapacityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capacity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).enterCapacity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).exitCapacity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScheduleVisitor ) return ((ScheduleVisitor<? extends T>)visitor).visitCapacity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CapacityContext capacity() throws RecognitionException {
		CapacityContext _localctx = new CapacityContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_capacity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FacilityContext extends ParserRuleContext {
		public Facility_nameContext facility_name() {
			return getRuleContext(Facility_nameContext.class,0);
		}
		public QuantityContext quantity() {
			return getRuleContext(QuantityContext.class,0);
		}
		public FacilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_facility; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).enterFacility(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).exitFacility(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScheduleVisitor ) return ((ScheduleVisitor<? extends T>)visitor).visitFacility(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FacilityContext facility() throws RecognitionException {
		FacilityContext _localctx = new FacilityContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_facility);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			facility_name();
			setState(80);
			match(T__5);
			setState(81);
			quantity();
			setState(82);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Facility_nameContext extends ParserRuleContext {
		public TerminalNode ALPHABET() { return getToken(ScheduleParser.ALPHABET, 0); }
		public Facility_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_facility_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).enterFacility_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).exitFacility_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScheduleVisitor ) return ((ScheduleVisitor<? extends T>)visitor).visitFacility_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Facility_nameContext facility_name() throws RecognitionException {
		Facility_nameContext _localctx = new Facility_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_facility_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(ALPHABET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantityContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(ScheduleParser.NUM, 0); }
		public QuantityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).enterQuantity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).exitQuantity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScheduleVisitor ) return ((ScheduleVisitor<? extends T>)visitor).visitQuantity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantityContext quantity() throws RecognitionException {
		QuantityContext _localctx = new QuantityContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_quantity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LecturersContext extends ParserRuleContext {
		public List<LecturerContext> lecturer() {
			return getRuleContexts(LecturerContext.class);
		}
		public LecturerContext lecturer(int i) {
			return getRuleContext(LecturerContext.class,i);
		}
		public LecturersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lecturers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).enterLecturers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).exitLecturers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScheduleVisitor ) return ((ScheduleVisitor<? extends T>)visitor).visitLecturers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LecturersContext lecturers() throws RecognitionException {
		LecturersContext _localctx = new LecturersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lecturers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__7);
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(89);
				lecturer();
				}
				}
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ALPHABET );
			setState(94);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LecturerContext extends ParserRuleContext {
		public Lecturer_nameContext lecturer_name() {
			return getRuleContext(Lecturer_nameContext.class,0);
		}
		public List<DatetimeContext> datetime() {
			return getRuleContexts(DatetimeContext.class);
		}
		public DatetimeContext datetime(int i) {
			return getRuleContext(DatetimeContext.class,i);
		}
		public LecturerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lecturer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).enterLecturer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).exitLecturer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScheduleVisitor ) return ((ScheduleVisitor<? extends T>)visitor).visitLecturer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LecturerContext lecturer() throws RecognitionException {
		LecturerContext _localctx = new LecturerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lecturer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			lecturer_name();
			setState(97);
			match(T__8);
			setState(99); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(98);
				datetime();
				}
				}
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ALPHABET );
			setState(103);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lecturer_nameContext extends ParserRuleContext {
		public TerminalNode ALPHABET() { return getToken(ScheduleParser.ALPHABET, 0); }
		public Lecturer_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lecturer_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).enterLecturer_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).exitLecturer_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScheduleVisitor ) return ((ScheduleVisitor<? extends T>)visitor).visitLecturer_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lecturer_nameContext lecturer_name() throws RecognitionException {
		Lecturer_nameContext _localctx = new Lecturer_nameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lecturer_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(ALPHABET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatetimeContext extends ParserRuleContext {
		public DayContext day() {
			return getRuleContext(DayContext.class,0);
		}
		public List<TimeContext> time() {
			return getRuleContexts(TimeContext.class);
		}
		public TimeContext time(int i) {
			return getRuleContext(TimeContext.class,i);
		}
		public DatetimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).enterDatetime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).exitDatetime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScheduleVisitor ) return ((ScheduleVisitor<? extends T>)visitor).visitDatetime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatetimeContext datetime() throws RecognitionException {
		DatetimeContext _localctx = new DatetimeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_datetime);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			day();
			setState(108);
			match(T__5);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(109);
					time();
					setState(110);
					match(T__9);
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(117);
			time();
			setState(118);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DayContext extends ParserRuleContext {
		public TerminalNode ALPHABET() { return getToken(ScheduleParser.ALPHABET, 0); }
		public DayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_day; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).enterDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).exitDay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScheduleVisitor ) return ((ScheduleVisitor<? extends T>)visitor).visitDay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DayContext day() throws RecognitionException {
		DayContext _localctx = new DayContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_day);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(ALPHABET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeContext extends ParserRuleContext {
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScheduleVisitor ) return ((ScheduleVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			start();
			setState(123);
			match(T__10);
			setState(124);
			end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(ScheduleParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ScheduleParser.NUM, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScheduleVisitor ) return ((ScheduleVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(NUM);
			setState(127);
			match(T__11);
			setState(128);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(ScheduleParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ScheduleParser.NUM, i);
		}
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).exitEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScheduleVisitor ) return ((ScheduleVisitor<? extends T>)visitor).visitEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(NUM);
			setState(131);
			match(T__11);
			setState(132);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CoursesContext extends ParserRuleContext {
		public List<CourseContext> course() {
			return getRuleContexts(CourseContext.class);
		}
		public CourseContext course(int i) {
			return getRuleContext(CourseContext.class,i);
		}
		public CoursesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_courses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).enterCourses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).exitCourses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScheduleVisitor ) return ((ScheduleVisitor<? extends T>)visitor).visitCourses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoursesContext courses() throws RecognitionException {
		CoursesContext _localctx = new CoursesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_courses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__12);
			setState(136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(135);
				course();
				}
				}
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ALPHANUMERIC );
			setState(140);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CourseContext extends ParserRuleContext {
		public Course_nameContext course_name() {
			return getRuleContext(Course_nameContext.class,0);
		}
		public CapacityContext capacity() {
			return getRuleContext(CapacityContext.class,0);
		}
		public Lecturer_nameContext lecturer_name() {
			return getRuleContext(Lecturer_nameContext.class,0);
		}
		public CreditsContext credits() {
			return getRuleContext(CreditsContext.class,0);
		}
		public List<FacilityContext> facility() {
			return getRuleContexts(FacilityContext.class);
		}
		public FacilityContext facility(int i) {
			return getRuleContext(FacilityContext.class,i);
		}
		public CourseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_course; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).enterCourse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).exitCourse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScheduleVisitor ) return ((ScheduleVisitor<? extends T>)visitor).visitCourse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CourseContext course() throws RecognitionException {
		CourseContext _localctx = new CourseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_course);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			course_name();
			setState(143);
			match(T__13);
			setState(144);
			capacity();
			setState(145);
			match(T__14);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALPHABET) {
				{
				{
				setState(146);
				facility();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(T__15);
			setState(153);
			lecturer_name();
			setState(154);
			match(T__16);
			setState(155);
			credits();
			setState(156);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Course_nameContext extends ParserRuleContext {
		public List<TerminalNode> ALPHANUMERIC() { return getTokens(ScheduleParser.ALPHANUMERIC); }
		public TerminalNode ALPHANUMERIC(int i) {
			return getToken(ScheduleParser.ALPHANUMERIC, i);
		}
		public Course_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_course_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).enterCourse_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).exitCourse_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScheduleVisitor ) return ((ScheduleVisitor<? extends T>)visitor).visitCourse_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Course_nameContext course_name() throws RecognitionException {
		Course_nameContext _localctx = new Course_nameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_course_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(ALPHANUMERIC);
			setState(159);
			match(T__10);
			setState(160);
			match(ALPHANUMERIC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreditsContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(ScheduleParser.NUM, 0); }
		public CreditsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_credits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).enterCredits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).exitCredits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScheduleVisitor ) return ((ScheduleVisitor<? extends T>)visitor).visitCredits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreditsContext credits() throws RecognitionException {
		CreditsContext _localctx = new CreditsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_credits);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreferencesContext extends ParserRuleContext {
		public List<PreferenceContext> preference() {
			return getRuleContexts(PreferenceContext.class);
		}
		public PreferenceContext preference(int i) {
			return getRuleContext(PreferenceContext.class,i);
		}
		public PreferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preferences; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).enterPreferences(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).exitPreferences(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScheduleVisitor ) return ((ScheduleVisitor<? extends T>)visitor).visitPreferences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreferencesContext preferences() throws RecognitionException {
		PreferencesContext _localctx = new PreferencesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_preferences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__18);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALPHANUMERIC) {
				{
				{
				setState(165);
				preference();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreferenceContext extends ParserRuleContext {
		public Course_nameContext course_name() {
			return getRuleContext(Course_nameContext.class,0);
		}
		public List<FacilityContext> facility() {
			return getRuleContexts(FacilityContext.class);
		}
		public FacilityContext facility(int i) {
			return getRuleContext(FacilityContext.class,i);
		}
		public List<DatetimeContext> datetime() {
			return getRuleContexts(DatetimeContext.class);
		}
		public DatetimeContext datetime(int i) {
			return getRuleContext(DatetimeContext.class,i);
		}
		public PreferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).enterPreference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).exitPreference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScheduleVisitor ) return ((ScheduleVisitor<? extends T>)visitor).visitPreference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreferenceContext preference() throws RecognitionException {
		PreferenceContext _localctx = new PreferenceContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_preference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			course_name();
			setState(174);
			match(T__19);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALPHABET) {
				{
				{
				setState(175);
				facility();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			match(T__20);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALPHABET) {
				{
				{
				setState(182);
				datetime();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintsContext extends ParserRuleContext {
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public ConstraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).enterConstraints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).exitConstraints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScheduleVisitor ) return ((ScheduleVisitor<? extends T>)visitor).visitConstraints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintsContext constraints() throws RecognitionException {
		ConstraintsContext _localctx = new ConstraintsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_constraints);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__22);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALPHANUMERIC) {
				{
				{
				setState(191);
				constraint();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintContext extends ParserRuleContext {
		public Course_nameContext course_name() {
			return getRuleContext(Course_nameContext.class,0);
		}
		public List<DatetimeContext> datetime() {
			return getRuleContexts(DatetimeContext.class);
		}
		public DatetimeContext datetime(int i) {
			return getRuleContext(DatetimeContext.class,i);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).exitConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScheduleVisitor ) return ((ScheduleVisitor<? extends T>)visitor).visitConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			course_name();
			setState(200);
			match(T__23);
			setState(202); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(201);
				datetime();
				}
				}
				setState(204); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ALPHABET );
			setState(206);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00d3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\6\3=\n\3\r\3\16\3>\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\6\4H\n\4\r\4\16\4I\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\6\n]\n\n\r\n\16\n^\3\n\3\n\3\13\3"+
		"\13\3\13\6\13f\n\13\r\13\16\13g\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\7\rs\n\r\f\r\16\rv\13\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\6\22\u008b\n\22\r\22\16"+
		"\22\u008c\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u0096\n\23\f\23\16\23"+
		"\u0099\13\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\7\26\u00a9\n\26\f\26\16\26\u00ac\13\26\3\26\3\26\3\27\3"+
		"\27\3\27\7\27\u00b3\n\27\f\27\16\27\u00b6\13\27\3\27\3\27\7\27\u00ba\n"+
		"\27\f\27\16\27\u00bd\13\27\3\27\3\27\3\30\3\30\7\30\u00c3\n\30\f\30\16"+
		"\30\u00c6\13\30\3\30\3\30\3\31\3\31\3\31\6\31\u00cd\n\31\r\31\16\31\u00ce"+
		"\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\2\2\2\u00c6\2\62\3\2\2\2\4:\3\2\2\2\6B\3\2\2\2\bM\3\2\2\2\nO\3\2"+
		"\2\2\fQ\3\2\2\2\16V\3\2\2\2\20X\3\2\2\2\22Z\3\2\2\2\24b\3\2\2\2\26k\3"+
		"\2\2\2\30m\3\2\2\2\32z\3\2\2\2\34|\3\2\2\2\36\u0080\3\2\2\2 \u0084\3\2"+
		"\2\2\"\u0088\3\2\2\2$\u0090\3\2\2\2&\u00a0\3\2\2\2(\u00a4\3\2\2\2*\u00a6"+
		"\3\2\2\2,\u00af\3\2\2\2.\u00c0\3\2\2\2\60\u00c9\3\2\2\2\62\63\7\3\2\2"+
		"\63\64\5\4\3\2\64\65\5\22\n\2\65\66\5\"\22\2\66\67\5*\26\2\678\5.\30\2"+
		"89\7\4\2\29\3\3\2\2\2:<\7\5\2\2;=\5\6\4\2<;\3\2\2\2=>\3\2\2\2><\3\2\2"+
		"\2>?\3\2\2\2?@\3\2\2\2@A\7\4\2\2A\5\3\2\2\2BC\5\b\5\2CD\7\6\2\2DE\5\n"+
		"\6\2EG\7\7\2\2FH\5\f\7\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JK\3\2"+
		"\2\2KL\7\4\2\2L\7\3\2\2\2MN\7\35\2\2N\t\3\2\2\2OP\7\33\2\2P\13\3\2\2\2"+
		"QR\5\16\b\2RS\7\b\2\2ST\5\20\t\2TU\7\t\2\2U\r\3\2\2\2VW\7\34\2\2W\17\3"+
		"\2\2\2XY\7\33\2\2Y\21\3\2\2\2Z\\\7\n\2\2[]\5\24\13\2\\[\3\2\2\2]^\3\2"+
		"\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\4\2\2a\23\3\2\2\2bc\5\26\f\2c"+
		"e\7\13\2\2df\5\30\r\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2"+
		"\2ij\7\4\2\2j\25\3\2\2\2kl\7\34\2\2l\27\3\2\2\2mn\5\32\16\2nt\7\b\2\2"+
		"op\5\34\17\2pq\7\f\2\2qs\3\2\2\2ro\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2"+
		"\2uw\3\2\2\2vt\3\2\2\2wx\5\34\17\2xy\7\t\2\2y\31\3\2\2\2z{\7\34\2\2{\33"+
		"\3\2\2\2|}\5\36\20\2}~\7\r\2\2~\177\5 \21\2\177\35\3\2\2\2\u0080\u0081"+
		"\7\33\2\2\u0081\u0082\7\16\2\2\u0082\u0083\7\33\2\2\u0083\37\3\2\2\2\u0084"+
		"\u0085\7\33\2\2\u0085\u0086\7\16\2\2\u0086\u0087\7\33\2\2\u0087!\3\2\2"+
		"\2\u0088\u008a\7\17\2\2\u0089\u008b\5$\23\2\u008a\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u008f\7\4\2\2\u008f#\3\2\2\2\u0090\u0091\5&\24\2\u0091\u0092"+
		"\7\20\2\2\u0092\u0093\5\n\6\2\u0093\u0097\7\21\2\2\u0094\u0096\5\f\7\2"+
		"\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7\22\2\2"+
		"\u009b\u009c\5\26\f\2\u009c\u009d\7\23\2\2\u009d\u009e\5(\25\2\u009e\u009f"+
		"\7\24\2\2\u009f%\3\2\2\2\u00a0\u00a1\7\35\2\2\u00a1\u00a2\7\r\2\2\u00a2"+
		"\u00a3\7\35\2\2\u00a3\'\3\2\2\2\u00a4\u00a5\7\33\2\2\u00a5)\3\2\2\2\u00a6"+
		"\u00aa\7\25\2\2\u00a7\u00a9\5,\27\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3"+
		"\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ad\u00ae\7\4\2\2\u00ae+\3\2\2\2\u00af\u00b0\5&\24\2"+
		"\u00b0\u00b4\7\26\2\2\u00b1\u00b3\5\f\7\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b7\u00bb\7\27\2\2\u00b8\u00ba\5\30\r\2\u00b9\u00b8\3"+
		"\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7\30\2\2\u00bf-\3\2\2\2"+
		"\u00c0\u00c4\7\31\2\2\u00c1\u00c3\5\60\31\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2"+
		"\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7\4\2\2\u00c8/\3\2\2\2\u00c9\u00ca"+
		"\5&\24\2\u00ca\u00cc\7\32\2\2\u00cb\u00cd\5\30\r\2\u00cc\u00cb\3\2\2\2"+
		"\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\u00d1\7\30\2\2\u00d1\61\3\2\2\2\16>I^gt\u008c\u0097\u00aa"+
		"\u00b4\u00bb\u00c4\u00ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}