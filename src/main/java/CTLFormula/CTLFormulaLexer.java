// Generated from E:/Workspace/idea/系统分析验证/CTLFormula/src/main/java\CTLFormula.g4 by ANTLR 4.9
package CTLFormula;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CTLFormulaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, AND=5, OR=6, NOT=7, TRUE=8, FALSE=9, IMP=10, 
		X=11, F=12, E=13, A=14, G=15, U=16, ATOM=17, SpaceOrTab=18, Comment=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "AND", "OR", "NOT", "TRUE", "FALSE", 
			"IMP", "X", "F", "E", "A", "G", "U", "ATOM", "SpaceOrTab", "Comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", null, null, null, null, null, "'->'", 
			"'X_'", "'F_'", "'E_'", "'A_'", "'G_'", "'U_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "AND", "OR", "NOT", "TRUE", "FALSE", "IMP", 
			"X", "F", "E", "A", "G", "U", "ATOM", "SpaceOrTab", "Comment"
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


	public CTLFormulaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CTLFormula.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25z\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\69\n\6\3\7\3\7\3\7\3\7\3\7\5\7@\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\bI\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\6\22"+
		"e\n\22\r\22\16\22f\3\23\6\23j\n\23\r\23\16\23k\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\7\24t\n\24\f\24\16\24w\13\24\3\24\3\24\2\2\25\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25\3\2\7\5\2\63\63VVvv\5\2\62\62HHhh\5\2\62;C\\c|\4\2\13\f\"\"\4\2\f"+
		"\f\17\17\2\u0082\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7-\3"+
		"\2\2\2\t/\3\2\2\2\138\3\2\2\2\r?\3\2\2\2\17H\3\2\2\2\21J\3\2\2\2\23L\3"+
		"\2\2\2\25N\3\2\2\2\27Q\3\2\2\2\31T\3\2\2\2\33W\3\2\2\2\35Z\3\2\2\2\37"+
		"]\3\2\2\2!`\3\2\2\2#d\3\2\2\2%i\3\2\2\2\'o\3\2\2\2)*\7*\2\2*\4\3\2\2\2"+
		"+,\7+\2\2,\6\3\2\2\2-.\7]\2\2.\b\3\2\2\2/\60\7_\2\2\60\n\3\2\2\2\619\7"+
		"(\2\2\62\63\7c\2\2\63\64\7p\2\2\649\7f\2\2\65\66\7C\2\2\66\67\7P\2\2\67"+
		"9\7F\2\28\61\3\2\2\28\62\3\2\2\28\65\3\2\2\29\f\3\2\2\2:@\7~\2\2;<\7q"+
		"\2\2<@\7t\2\2=>\7Q\2\2>@\7T\2\2?:\3\2\2\2?;\3\2\2\2?=\3\2\2\2@\16\3\2"+
		"\2\2AI\7\u0080\2\2BC\7P\2\2CD\7Q\2\2DI\7V\2\2EF\7p\2\2FG\7q\2\2GI\7v\2"+
		"\2HA\3\2\2\2HB\3\2\2\2HE\3\2\2\2I\20\3\2\2\2JK\t\2\2\2K\22\3\2\2\2LM\t"+
		"\3\2\2M\24\3\2\2\2NO\7/\2\2OP\7@\2\2P\26\3\2\2\2QR\7Z\2\2RS\7a\2\2S\30"+
		"\3\2\2\2TU\7H\2\2UV\7a\2\2V\32\3\2\2\2WX\7G\2\2XY\7a\2\2Y\34\3\2\2\2Z"+
		"[\7C\2\2[\\\7a\2\2\\\36\3\2\2\2]^\7I\2\2^_\7a\2\2_ \3\2\2\2`a\7W\2\2a"+
		"b\7a\2\2b\"\3\2\2\2ce\t\4\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2"+
		"g$\3\2\2\2hj\t\5\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2"+
		"mn\b\23\2\2n&\3\2\2\2op\7/\2\2pq\7/\2\2qu\3\2\2\2rt\n\6\2\2sr\3\2\2\2"+
		"tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\b\24\2\2y(\3\2\2"+
		"\2\t\28?Hfku\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}