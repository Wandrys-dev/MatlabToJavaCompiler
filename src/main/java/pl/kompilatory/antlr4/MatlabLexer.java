// Generated from E:/Git/MatlabToJavaCompiler/src/main/java/pl/kompilatory/antlr4\Matlab.g4 by ANTLR 4.8
package pl.kompilatory.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MatlabLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NL=1, WS=2, PLUS=3, MINUS=4, DIVIDE=5, MULTIPLY=6, POWER=7, ELEMENT_WISE_MULTIPLY=8, 
		ELEMENT_WISE_DIVIDE=9, ELEMENT_WISE_POWER=10, GLOBAL=11, IF=12, ELSE=13, 
		ELSEIF=14, END=15, WHILE=16, FOR=17, SWITCH=18, OTHERWISE=19, CASE=20, 
		CONTINUE=21, BREAK=22, FUNCTION=23, RETURN=24, SET=25, GET=26, ASSIGN=27, 
		DOT=28, COMMA=29, COLON=30, SEMI_COLON=31, LEFT_PARENTHESIS=32, RIGHT_PARENTHESIS=33, 
		LEFT_BRACE=34, RIGHT_BRACE=35, LEFT_SQUARE_BRACKET=36, RIGHT_SQUARE_BRACKET=37, 
		ID=38, TRUE=39, FALSE=40, AND=41, OR=42, NOT=43, EQUAL=44, NOT_EQUAL=45, 
		GREATER_THAN=46, GREATER_OR_EQUAL=47, LESS_THAN=48, LESS_OR_EQUAL=49, 
		INT=50, FLOAT=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NL", "WS", "PLUS", "MINUS", "DIVIDE", "MULTIPLY", "POWER", "ELEMENT_WISE_MULTIPLY", 
			"ELEMENT_WISE_DIVIDE", "ELEMENT_WISE_POWER", "GLOBAL", "IF", "ELSE", 
			"ELSEIF", "END", "WHILE", "FOR", "SWITCH", "OTHERWISE", "CASE", "CONTINUE", 
			"BREAK", "FUNCTION", "RETURN", "SET", "GET", "ASSIGN", "DOT", "COMMA", 
			"COLON", "SEMI_COLON", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "LEFT_BRACE", 
			"RIGHT_BRACE", "LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", "ID", "TRUE", 
			"FALSE", "AND", "OR", "NOT", "EQUAL", "NOT_EQUAL", "GREATER_THAN", "GREATER_OR_EQUAL", 
			"LESS_THAN", "LESS_OR_EQUAL", "INT", "FLOAT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'+'", "'-'", "'/'", "'*'", "'^'", "'.*'", "'./'", 
			"'.^'", "'global'", "'if'", "'else'", "'elseif'", "'end'", "'while'", 
			"'for'", "'switch'", "'otherwise'", "'case'", "'continue'", "'break'", 
			"'function'", "'return'", "'set'", "'get'", "'='", "'.'", "','", "':'", 
			"';'", "'('", "')'", "'{'", "'}'", "'['", "']'", null, "'true'", "'false'", 
			"'&&'", "'||'", "'~'", "'=='", "'~='", "'>'", "'>='", "'<'", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NL", "WS", "PLUS", "MINUS", "DIVIDE", "MULTIPLY", "POWER", "ELEMENT_WISE_MULTIPLY", 
			"ELEMENT_WISE_DIVIDE", "ELEMENT_WISE_POWER", "GLOBAL", "IF", "ELSE", 
			"ELSEIF", "END", "WHILE", "FOR", "SWITCH", "OTHERWISE", "CASE", "CONTINUE", 
			"BREAK", "FUNCTION", "RETURN", "SET", "GET", "ASSIGN", "DOT", "COMMA", 
			"COLON", "SEMI_COLON", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "LEFT_BRACE", 
			"RIGHT_BRACE", "LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", "ID", "TRUE", 
			"FALSE", "AND", "OR", "NOT", "EQUAL", "NOT_EQUAL", "GREATER_THAN", "GREATER_OR_EQUAL", 
			"LESS_THAN", "LESS_OR_EQUAL", "INT", "FLOAT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public MatlabLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Matlab.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0139\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\5\2m\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\7"+
		"\'\u0101\n\'\f\'\16\'\u0104\13\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3"+
		"*\3*\3+\3+\3+\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3"+
		"\62\3\62\3\62\3\63\6\63\u012a\n\63\r\63\16\63\u012b\3\64\6\64\u012f\n"+
		"\64\r\64\16\64\u0130\3\64\3\64\7\64\u0135\n\64\f\64\16\64\u0138\13\64"+
		"\2\2\65\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65\3\2"+
		"\7\4\2\f\f\17\17\4\2\13\13\"\"\4\2C\\c|\6\2\62;C\\aac|\3\2\62;\2\u013d"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3l\3\2\2\2\5p\3\2\2\2\7t\3\2\2"+
		"\2\tv\3\2\2\2\13x\3\2\2\2\rz\3\2\2\2\17|\3\2\2\2\21~\3\2\2\2\23\u0081"+
		"\3\2\2\2\25\u0084\3\2\2\2\27\u0087\3\2\2\2\31\u008e\3\2\2\2\33\u0091\3"+
		"\2\2\2\35\u0096\3\2\2\2\37\u009d\3\2\2\2!\u00a1\3\2\2\2#\u00a7\3\2\2\2"+
		"%\u00ab\3\2\2\2\'\u00b2\3\2\2\2)\u00bc\3\2\2\2+\u00c1\3\2\2\2-\u00ca\3"+
		"\2\2\2/\u00d0\3\2\2\2\61\u00d9\3\2\2\2\63\u00e0\3\2\2\2\65\u00e4\3\2\2"+
		"\2\67\u00e8\3\2\2\29\u00ea\3\2\2\2;\u00ec\3\2\2\2=\u00ee\3\2\2\2?\u00f0"+
		"\3\2\2\2A\u00f2\3\2\2\2C\u00f4\3\2\2\2E\u00f6\3\2\2\2G\u00f8\3\2\2\2I"+
		"\u00fa\3\2\2\2K\u00fc\3\2\2\2M\u00fe\3\2\2\2O\u0105\3\2\2\2Q\u010a\3\2"+
		"\2\2S\u0110\3\2\2\2U\u0113\3\2\2\2W\u0116\3\2\2\2Y\u0118\3\2\2\2[\u011b"+
		"\3\2\2\2]\u011e\3\2\2\2_\u0120\3\2\2\2a\u0123\3\2\2\2c\u0125\3\2\2\2e"+
		"\u0129\3\2\2\2g\u012e\3\2\2\2ij\7\17\2\2jm\7\f\2\2km\t\2\2\2li\3\2\2\2"+
		"lk\3\2\2\2mn\3\2\2\2no\b\2\2\2o\4\3\2\2\2pq\t\3\2\2qr\3\2\2\2rs\b\3\3"+
		"\2s\6\3\2\2\2tu\7-\2\2u\b\3\2\2\2vw\7/\2\2w\n\3\2\2\2xy\7\61\2\2y\f\3"+
		"\2\2\2z{\7,\2\2{\16\3\2\2\2|}\7`\2\2}\20\3\2\2\2~\177\7\60\2\2\177\u0080"+
		"\7,\2\2\u0080\22\3\2\2\2\u0081\u0082\7\60\2\2\u0082\u0083\7\61\2\2\u0083"+
		"\24\3\2\2\2\u0084\u0085\7\60\2\2\u0085\u0086\7`\2\2\u0086\26\3\2\2\2\u0087"+
		"\u0088\7i\2\2\u0088\u0089\7n\2\2\u0089\u008a\7q\2\2\u008a\u008b\7d\2\2"+
		"\u008b\u008c\7c\2\2\u008c\u008d\7n\2\2\u008d\30\3\2\2\2\u008e\u008f\7"+
		"k\2\2\u008f\u0090\7h\2\2\u0090\32\3\2\2\2\u0091\u0092\7g\2\2\u0092\u0093"+
		"\7n\2\2\u0093\u0094\7u\2\2\u0094\u0095\7g\2\2\u0095\34\3\2\2\2\u0096\u0097"+
		"\7g\2\2\u0097\u0098\7n\2\2\u0098\u0099\7u\2\2\u0099\u009a\7g\2\2\u009a"+
		"\u009b\7k\2\2\u009b\u009c\7h\2\2\u009c\36\3\2\2\2\u009d\u009e\7g\2\2\u009e"+
		"\u009f\7p\2\2\u009f\u00a0\7f\2\2\u00a0 \3\2\2\2\u00a1\u00a2\7y\2\2\u00a2"+
		"\u00a3\7j\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7g\2\2"+
		"\u00a6\"\3\2\2\2\u00a7\u00a8\7h\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7t"+
		"\2\2\u00aa$\3\2\2\2\u00ab\u00ac\7u\2\2\u00ac\u00ad\7y\2\2\u00ad\u00ae"+
		"\7k\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7e\2\2\u00b0\u00b1\7j\2\2\u00b1"+
		"&\3\2\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7j\2\2\u00b5"+
		"\u00b6\7g\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7y\2\2\u00b8\u00b9\7k\2\2"+
		"\u00b9\u00ba\7u\2\2\u00ba\u00bb\7g\2\2\u00bb(\3\2\2\2\u00bc\u00bd\7e\2"+
		"\2\u00bd\u00be\7c\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7g\2\2\u00c0*\3\2"+
		"\2\2\u00c1\u00c2\7e\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5"+
		"\7v\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7w\2\2\u00c8"+
		"\u00c9\7g\2\2\u00c9,\3\2\2\2\u00ca\u00cb\7d\2\2\u00cb\u00cc\7t\2\2\u00cc"+
		"\u00cd\7g\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7m\2\2\u00cf.\3\2\2\2\u00d0"+
		"\u00d1\7h\2\2\u00d1\u00d2\7w\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7e\2\2"+
		"\u00d4\u00d5\7v\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8"+
		"\7p\2\2\u00d8\60\3\2\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7g\2\2\u00db\u00dc"+
		"\7v\2\2\u00dc\u00dd\7w\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7p\2\2\u00df"+
		"\62\3\2\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7v\2\2\u00e3"+
		"\64\3\2\2\2\u00e4\u00e5\7i\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7v\2\2\u00e7"+
		"\66\3\2\2\2\u00e8\u00e9\7?\2\2\u00e98\3\2\2\2\u00ea\u00eb\7\60\2\2\u00eb"+
		":\3\2\2\2\u00ec\u00ed\7.\2\2\u00ed<\3\2\2\2\u00ee\u00ef\7<\2\2\u00ef>"+
		"\3\2\2\2\u00f0\u00f1\7=\2\2\u00f1@\3\2\2\2\u00f2\u00f3\7*\2\2\u00f3B\3"+
		"\2\2\2\u00f4\u00f5\7+\2\2\u00f5D\3\2\2\2\u00f6\u00f7\7}\2\2\u00f7F\3\2"+
		"\2\2\u00f8\u00f9\7\177\2\2\u00f9H\3\2\2\2\u00fa\u00fb\7]\2\2\u00fbJ\3"+
		"\2\2\2\u00fc\u00fd\7_\2\2\u00fdL\3\2\2\2\u00fe\u0102\t\4\2\2\u00ff\u0101"+
		"\t\5\2\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103N\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\7v\2\2\u0106"+
		"\u0107\7t\2\2\u0107\u0108\7w\2\2\u0108\u0109\7g\2\2\u0109P\3\2\2\2\u010a"+
		"\u010b\7h\2\2\u010b\u010c\7c\2\2\u010c\u010d\7n\2\2\u010d\u010e\7u\2\2"+
		"\u010e\u010f\7g\2\2\u010fR\3\2\2\2\u0110\u0111\7(\2\2\u0111\u0112\7(\2"+
		"\2\u0112T\3\2\2\2\u0113\u0114\7~\2\2\u0114\u0115\7~\2\2\u0115V\3\2\2\2"+
		"\u0116\u0117\7\u0080\2\2\u0117X\3\2\2\2\u0118\u0119\7?\2\2\u0119\u011a"+
		"\7?\2\2\u011aZ\3\2\2\2\u011b\u011c\7\u0080\2\2\u011c\u011d\7?\2\2\u011d"+
		"\\\3\2\2\2\u011e\u011f\7@\2\2\u011f^\3\2\2\2\u0120\u0121\7@\2\2\u0121"+
		"\u0122\7?\2\2\u0122`\3\2\2\2\u0123\u0124\7>\2\2\u0124b\3\2\2\2\u0125\u0126"+
		"\7>\2\2\u0126\u0127\7?\2\2\u0127d\3\2\2\2\u0128\u012a\t\6\2\2\u0129\u0128"+
		"\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"f\3\2\2\2\u012d\u012f\t\6\2\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2\2\2"+
		"\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0136"+
		"\7\60\2\2\u0133\u0135\t\6\2\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2"+
		"\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137h\3\2\2\2\u0138\u0136\3"+
		"\2\2\2\b\2l\u0102\u012b\u0130\u0136\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}