// Generated from C:/Users/User/ClassScheduling/src\Schedule.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScheduleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		NUM=25, ALPHABET=26, ALPHANUMERIC=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "NUM", 
		"ALPHABET", "ALPHANUMERIC"
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


	public ScheduleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Schedule.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u0102\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\6\32\u00f5\n\32\r\32\16\32\u00f6\3\33\6\33\u00fa\n\33\r\33"+
		"\16\33\u00fb\3\34\6\34\u00ff\n\34\r\34\16\34\u0100\2\2\35\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\5\3\2\62;\4\2C\\"+
		"c|\5\2\62;C\\c|\2\u0104\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\39\3\2\2\2\5D\3\2\2\2\7F\3\2\2\2\tR\3\2\2\2\13T\3\2\2\2\rW\3\2"+
		"\2\2\17Y\3\2\2\2\21[\3\2\2\2\23f\3\2\2\2\25h\3\2\2\2\27j\3\2\2\2\31l\3"+
		"\2\2\2\33n\3\2\2\2\35w\3\2\2\2\37\u0084\3\2\2\2!\u0092\3\2\2\2#\u00a5"+
		"\3\2\2\2%\u00b1\3\2\2\2\'\u00b4\3\2\2\2)\u00c2\3\2\2\2+\u00cf\3\2\2\2"+
		"-\u00d8\3\2\2\2/\u00dc\3\2\2\2\61\u00ea\3\2\2\2\63\u00f4\3\2\2\2\65\u00f9"+
		"\3\2\2\2\67\u00fe\3\2\2\29:\7U\2\2:;\7e\2\2;<\7j\2\2<=\7g\2\2=>\7f\2\2"+
		">?\7w\2\2?@\7n\2\2@A\7g\2\2AB\7\"\2\2BC\7}\2\2C\4\3\2\2\2DE\7\177\2\2"+
		"E\6\3\2\2\2FG\7E\2\2GH\7n\2\2HI\7c\2\2IJ\7u\2\2JK\7u\2\2KL\7t\2\2LM\7"+
		"q\2\2MN\7q\2\2NO\7o\2\2OP\7\"\2\2PQ\7}\2\2Q\b\3\2\2\2RS\7]\2\2S\n\3\2"+
		"\2\2TU\7_\2\2UV\7}\2\2V\f\3\2\2\2WX\7*\2\2X\16\3\2\2\2YZ\7+\2\2Z\20\3"+
		"\2\2\2[\\\7N\2\2\\]\7g\2\2]^\7e\2\2^_\7v\2\2_`\7w\2\2`a\7t\2\2ab\7g\2"+
		"\2bc\7t\2\2cd\7\"\2\2de\7}\2\2e\22\3\2\2\2fg\7}\2\2g\24\3\2\2\2hi\7.\2"+
		"\2i\26\3\2\2\2jk\7/\2\2k\30\3\2\2\2lm\7\60\2\2m\32\3\2\2\2no\7E\2\2op"+
		"\7q\2\2pq\7w\2\2qr\7t\2\2rs\7u\2\2st\7g\2\2tu\7\"\2\2uv\7}\2\2v\34\3\2"+
		"\2\2wx\7}\2\2xy\7\"\2\2yz\7e\2\2z{\7c\2\2{|\7r\2\2|}\7c\2\2}~\7e\2\2~"+
		"\177\7k\2\2\177\u0080\7v\2\2\u0080\u0081\7{\2\2\u0081\u0082\7\"\2\2\u0082"+
		"\u0083\7*\2\2\u0083\36\3\2\2\2\u0084\u0085\7+\2\2\u0085\u0086\7\"\2\2"+
		"\u0086\u0087\7h\2\2\u0087\u0088\7c\2\2\u0088\u0089\7e\2\2\u0089\u008a"+
		"\7k\2\2\u008a\u008b\7n\2\2\u008b\u008c\7k\2\2\u008c\u008d\7v\2\2\u008d"+
		"\u008e\7{\2\2\u008e\u008f\7\"\2\2\u008f\u0090\7}\2\2\u0090\u0091\7\"\2"+
		"\2\u0091 \3\2\2\2\u0092\u0093\7\"\2\2\u0093\u0094\7\177\2\2\u0094\u0095"+
		"\7\"\2\2\u0095\u0096\7n\2\2\u0096\u0097\7g\2\2\u0097\u0098\7e\2\2\u0098"+
		"\u0099\7v\2\2\u0099\u009a\7w\2\2\u009a\u009b\7t\2\2\u009b\u009c\7g\2\2"+
		"\u009c\u009d\7t\2\2\u009d\u009e\7a\2\2\u009e\u009f\7p\2\2\u009f\u00a0"+
		"\7c\2\2\u00a0\u00a1\7o\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7\"\2\2\u00a3"+
		"\u00a4\7*\2\2\u00a4\"\3\2\2\2\u00a5\u00a6\7+\2\2\u00a6\u00a7\7\"\2\2\u00a7"+
		"\u00a8\7e\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7f\2\2"+
		"\u00ab\u00ac\7k\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af"+
		"\7\"\2\2\u00af\u00b0\7*\2\2\u00b0$\3\2\2\2\u00b1\u00b2\7+\2\2\u00b2\u00b3"+
		"\7\177\2\2\u00b3&\3\2\2\2\u00b4\u00b5\7R\2\2\u00b5\u00b6\7t\2\2\u00b6"+
		"\u00b7\7g\2\2\u00b7\u00b8\7h\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7t\2\2"+
		"\u00ba\u00bb\7g\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7e\2\2\u00bd\u00be"+
		"\7g\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7\"\2\2\u00c0\u00c1\7}\2\2\u00c1"+
		"(\3\2\2\2\u00c2\u00c3\7}\2\2\u00c3\u00c4\7\"\2\2\u00c4\u00c5\7h\2\2\u00c5"+
		"\u00c6\7c\2\2\u00c6\u00c7\7e\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7n\2\2"+
		"\u00c9\u00ca\7k\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7{\2\2\u00cc\u00cd"+
		"\7\"\2\2\u00cd\u00ce\7}\2\2\u00ce*\3\2\2\2\u00cf\u00d0\7\177\2\2\u00d0"+
		"\u00d1\7\"\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7o\2"+
		"\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7\"\2\2\u00d6\u00d7\7}\2\2\u00d7,\3"+
		"\2\2\2\u00d8\u00d9\7\177\2\2\u00d9\u00da\7\"\2\2\u00da\u00db\7\177\2\2"+
		"\u00db.\3\2\2\2\u00dc\u00dd\7E\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7p\2"+
		"\2\u00df\u00e0\7u\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3"+
		"\7c\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6\7v\2\2\u00e6"+
		"\u00e7\7u\2\2\u00e7\u00e8\7\"\2\2\u00e8\u00e9\7}\2\2\u00e9\60\3\2\2\2"+
		"\u00ea\u00eb\7}\2\2\u00eb\u00ec\7\"\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee"+
		"\7k\2\2\u00ee\u00ef\7o\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7\"\2\2\u00f1"+
		"\u00f2\7}\2\2\u00f2\62\3\2\2\2\u00f3\u00f5\t\2\2\2\u00f4\u00f3\3\2\2\2"+
		"\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\64"+
		"\3\2\2\2\u00f8\u00fa\t\3\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\66\3\2\2\2\u00fd\u00ff\t\4\2"+
		"\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u01018\3\2\2\2\6\2\u00f6\u00fb\u0100\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}