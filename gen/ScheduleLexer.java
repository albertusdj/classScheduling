// Generated from C:/Users/irfanmim/Desktop/Kuliah Semester 7/Tugas-tugas/RPLSD Tubes 1/classScheduling/src\Schedule.g4 by ANTLR 4.7
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
		NUM=25, ALPHABET=26, ALPHANUMERIC=27, WS=28;
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
		"ALPHABET", "ALPHANUMERIC", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Schedule {'", "'}'", "'Classroom {'", "'['", "'] {'", "'('", "')'", 
		"'Lecturer {'", "'{'", "','", "'-'", "'.'", "'Course {'", "'{ capacity ('", 
		"') facility { '", "' } lecturerName ('", "') credits ('", "')}'", "'Preferences {'", 
		"'{ facility {'", "'} time {'", "'} }'", "'Constraints {'", "'{ time {'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "NUM", "ALPHABET", "ALPHANUMERIC", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u010b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\6\32\u00f7\n\32\r\32\16\32\u00f8\3\33\6\33\u00fc"+
		"\n\33\r\33\16\33\u00fd\3\34\6\34\u0101\n\34\r\34\16\34\u0102\3\35\6\35"+
		"\u0106\n\35\r\35\16\35\u0107\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36\3\2\6\3\2\62;\4\2C\\c|\5\2\62"+
		";C\\c|\5\2\13\f\17\17\"\"\2\u010e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5F\3\2\2\2\7H\3\2\2\2\tT\3\2\2"+
		"\2\13V\3\2\2\2\rZ\3\2\2\2\17\\\3\2\2\2\21^\3\2\2\2\23i\3\2\2\2\25k\3\2"+
		"\2\2\27m\3\2\2\2\31o\3\2\2\2\33q\3\2\2\2\35z\3\2\2\2\37\u0087\3\2\2\2"+
		"!\u0095\3\2\2\2#\u00a7\3\2\2\2%\u00b3\3\2\2\2\'\u00b6\3\2\2\2)\u00c4\3"+
		"\2\2\2+\u00d1\3\2\2\2-\u00da\3\2\2\2/\u00de\3\2\2\2\61\u00ec\3\2\2\2\63"+
		"\u00f6\3\2\2\2\65\u00fb\3\2\2\2\67\u0100\3\2\2\29\u0105\3\2\2\2;<\7U\2"+
		"\2<=\7e\2\2=>\7j\2\2>?\7g\2\2?@\7f\2\2@A\7w\2\2AB\7n\2\2BC\7g\2\2CD\7"+
		"\"\2\2DE\7}\2\2E\4\3\2\2\2FG\7\177\2\2G\6\3\2\2\2HI\7E\2\2IJ\7n\2\2JK"+
		"\7c\2\2KL\7u\2\2LM\7u\2\2MN\7t\2\2NO\7q\2\2OP\7q\2\2PQ\7o\2\2QR\7\"\2"+
		"\2RS\7}\2\2S\b\3\2\2\2TU\7]\2\2U\n\3\2\2\2VW\7_\2\2WX\7\"\2\2XY\7}\2\2"+
		"Y\f\3\2\2\2Z[\7*\2\2[\16\3\2\2\2\\]\7+\2\2]\20\3\2\2\2^_\7N\2\2_`\7g\2"+
		"\2`a\7e\2\2ab\7v\2\2bc\7w\2\2cd\7t\2\2de\7g\2\2ef\7t\2\2fg\7\"\2\2gh\7"+
		"}\2\2h\22\3\2\2\2ij\7}\2\2j\24\3\2\2\2kl\7.\2\2l\26\3\2\2\2mn\7/\2\2n"+
		"\30\3\2\2\2op\7\60\2\2p\32\3\2\2\2qr\7E\2\2rs\7q\2\2st\7w\2\2tu\7t\2\2"+
		"uv\7u\2\2vw\7g\2\2wx\7\"\2\2xy\7}\2\2y\34\3\2\2\2z{\7}\2\2{|\7\"\2\2|"+
		"}\7e\2\2}~\7c\2\2~\177\7r\2\2\177\u0080\7c\2\2\u0080\u0081\7e\2\2\u0081"+
		"\u0082\7k\2\2\u0082\u0083\7v\2\2\u0083\u0084\7{\2\2\u0084\u0085\7\"\2"+
		"\2\u0085\u0086\7*\2\2\u0086\36\3\2\2\2\u0087\u0088\7+\2\2\u0088\u0089"+
		"\7\"\2\2\u0089\u008a\7h\2\2\u008a\u008b\7c\2\2\u008b\u008c\7e\2\2\u008c"+
		"\u008d\7k\2\2\u008d\u008e\7n\2\2\u008e\u008f\7k\2\2\u008f\u0090\7v\2\2"+
		"\u0090\u0091\7{\2\2\u0091\u0092\7\"\2\2\u0092\u0093\7}\2\2\u0093\u0094"+
		"\7\"\2\2\u0094 \3\2\2\2\u0095\u0096\7\"\2\2\u0096\u0097\7\177\2\2\u0097"+
		"\u0098\7\"\2\2\u0098\u0099\7n\2\2\u0099\u009a\7g\2\2\u009a\u009b\7e\2"+
		"\2\u009b\u009c\7v\2\2\u009c\u009d\7w\2\2\u009d\u009e\7t\2\2\u009e\u009f"+
		"\7g\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7P\2\2\u00a1\u00a2\7c\2\2\u00a2"+
		"\u00a3\7o\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7\"\2\2\u00a5\u00a6\7*\2"+
		"\2\u00a6\"\3\2\2\2\u00a7\u00a8\7+\2\2\u00a8\u00a9\7\"\2\2\u00a9\u00aa"+
		"\7e\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7f\2\2\u00ad"+
		"\u00ae\7k\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7\"\2"+
		"\2\u00b1\u00b2\7*\2\2\u00b2$\3\2\2\2\u00b3\u00b4\7+\2\2\u00b4\u00b5\7"+
		"\177\2\2\u00b5&\3\2\2\2\u00b6\u00b7\7R\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9"+
		"\7g\2\2\u00b9\u00ba\7h\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7t\2\2\u00bc"+
		"\u00bd\7g\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7e\2\2\u00bf\u00c0\7g\2\2"+
		"\u00c0\u00c1\7u\2\2\u00c1\u00c2\7\"\2\2\u00c2\u00c3\7}\2\2\u00c3(\3\2"+
		"\2\2\u00c4\u00c5\7}\2\2\u00c5\u00c6\7\"\2\2\u00c6\u00c7\7h\2\2\u00c7\u00c8"+
		"\7c\2\2\u00c8\u00c9\7e\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7n\2\2\u00cb"+
		"\u00cc\7k\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7{\2\2\u00ce\u00cf\7\"\2"+
		"\2\u00cf\u00d0\7}\2\2\u00d0*\3\2\2\2\u00d1\u00d2\7\177\2\2\u00d2\u00d3"+
		"\7\"\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7o\2\2\u00d6"+
		"\u00d7\7g\2\2\u00d7\u00d8\7\"\2\2\u00d8\u00d9\7}\2\2\u00d9,\3\2\2\2\u00da"+
		"\u00db\7\177\2\2\u00db\u00dc\7\"\2\2\u00dc\u00dd\7\177\2\2\u00dd.\3\2"+
		"\2\2\u00de\u00df\7E\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2"+
		"\7u\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7c\2\2\u00e5"+
		"\u00e6\7k\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9\7u\2\2"+
		"\u00e9\u00ea\7\"\2\2\u00ea\u00eb\7}\2\2\u00eb\60\3\2\2\2\u00ec\u00ed\7"+
		"}\2\2\u00ed\u00ee\7\"\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7k\2\2\u00f0"+
		"\u00f1\7o\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7\"\2\2\u00f3\u00f4\7}\2"+
		"\2\u00f4\62\3\2\2\2\u00f5\u00f7\t\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8"+
		"\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\64\3\2\2\2\u00fa"+
		"\u00fc\t\3\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2"+
		"\2\2\u00fd\u00fe\3\2\2\2\u00fe\66\3\2\2\2\u00ff\u0101\t\4\2\2\u0100\u00ff"+
		"\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"8\3\2\2\2\u0104\u0106\t\5\2\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2"+
		"\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a"+
		"\b\35\2\2\u010a:\3\2\2\2\7\2\u00f8\u00fd\u0102\u0107\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}