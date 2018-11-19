// Generated from C:/Users/User/ClassScheduling/src\Classroom.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ClassroomParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, NUM=5, NAME=6, WS=7;
	public static final int
		RULE_classroom = 0, RULE_facility = 1;
	public static final String[] ruleNames = {
		"classroom", "facility"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Classroom {'", "'}'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "NUM", "NAME", "WS"
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
	public String getGrammarFileName() { return "Classroom.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ClassroomParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ClassroomContext extends ParserRuleContext {
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
			if ( listener instanceof ClassroomListener ) ((ClassroomListener)listener).enterClassroom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassroomListener ) ((ClassroomListener)listener).exitClassroom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassroomVisitor ) return ((ClassroomVisitor<? extends T>)visitor).visitClassroom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassroomContext classroom() throws RecognitionException {
		ClassroomContext _localctx = new ClassroomContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_classroom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			match(T__0);
			setState(6); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(5);
				facility();
				}
				}
				setState(8); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
			setState(10);
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

	public static class FacilityContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ClassroomParser.NAME, 0); }
		public TerminalNode NUM() { return getToken(ClassroomParser.NUM, 0); }
		public FacilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_facility; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassroomListener ) ((ClassroomListener)listener).enterFacility(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassroomListener ) ((ClassroomListener)listener).exitFacility(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassroomVisitor ) return ((ClassroomVisitor<? extends T>)visitor).visitFacility(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FacilityContext facility() throws RecognitionException {
		FacilityContext _localctx = new FacilityContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_facility);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(NAME);
			setState(13);
			match(T__2);
			setState(14);
			match(NUM);
			setState(15);
			match(T__3);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t\24\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\6\2\t\n\2\r\2\16\2\n\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\2\2"+
		"\4\2\4\2\2\2\22\2\6\3\2\2\2\4\16\3\2\2\2\6\b\7\3\2\2\7\t\5\4\3\2\b\7\3"+
		"\2\2\2\t\n\3\2\2\2\n\b\3\2\2\2\n\13\3\2\2\2\13\f\3\2\2\2\f\r\7\4\2\2\r"+
		"\3\3\2\2\2\16\17\7\b\2\2\17\20\7\5\2\2\20\21\7\7\2\2\21\22\7\6\2\2\22"+
		"\5\3\2\2\2\3\n";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}