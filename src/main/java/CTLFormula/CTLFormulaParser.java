// Generated from E:/Workspace/idea/系统分析验证/CTLFormula/src/main/java\CTLFormula.g4 by ANTLR 4.9
package CTLFormula;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CTLFormulaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, AND=5, OR=6, NOT=7, TRUE=8, FALSE=9, IMP=10, 
		X=11, F=12, E=13, A=14, G=15, U=16, ATOM=17, SpaceOrTab=18, Comment=19;
	public static final int
		RULE_parse = 0, RULE_formula = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "formula"
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

	@Override
	public String getGrammarFileName() { return "CTLFormula.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CTLFormulaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CTLFormulaParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTLFormulaListener ) ((CTLFormulaListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTLFormulaListener ) ((CTLFormulaListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTLFormulaVisitor ) return ((CTLFormulaVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			formula(0);
			setState(5);
			match(EOF);
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

	public static class FormulaContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(CTLFormulaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CTLFormulaParser.FALSE, 0); }
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public TerminalNode IMP() { return getToken(CTLFormulaParser.IMP, 0); }
		public TerminalNode OR() { return getToken(CTLFormulaParser.OR, 0); }
		public TerminalNode AND() { return getToken(CTLFormulaParser.AND, 0); }
		public TerminalNode NOT() { return getToken(CTLFormulaParser.NOT, 0); }
		public TerminalNode U() { return getToken(CTLFormulaParser.U, 0); }
		public TerminalNode A() { return getToken(CTLFormulaParser.A, 0); }
		public TerminalNode X() { return getToken(CTLFormulaParser.X, 0); }
		public TerminalNode E() { return getToken(CTLFormulaParser.E, 0); }
		public TerminalNode F() { return getToken(CTLFormulaParser.F, 0); }
		public TerminalNode G() { return getToken(CTLFormulaParser.G, 0); }
		public TerminalNode ATOM() { return getToken(CTLFormulaParser.ATOM, 0); }
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTLFormulaListener ) ((CTLFormulaListener)listener).enterFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTLFormulaListener ) ((CTLFormulaListener)listener).exitFormula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CTLFormulaVisitor ) return ((CTLFormulaVisitor<? extends T>)visitor).visitFormula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		return formula(0);
	}

	private FormulaContext formula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FormulaContext _localctx = new FormulaContext(_ctx, _parentState);
		FormulaContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_formula, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(8);
				match(TRUE);
				}
				break;
			case 2:
				{
				setState(9);
				match(FALSE);
				}
				break;
			case 3:
				{
				setState(10);
				match(T__0);
				setState(11);
				formula(0);
				setState(12);
				match(IMP);
				setState(13);
				formula(0);
				setState(14);
				match(T__1);
				}
				break;
			case 4:
				{
				setState(16);
				match(T__0);
				setState(17);
				formula(0);
				setState(18);
				match(OR);
				setState(19);
				formula(0);
				setState(20);
				match(T__1);
				}
				break;
			case 5:
				{
				setState(22);
				match(T__0);
				setState(23);
				formula(0);
				setState(24);
				match(AND);
				setState(25);
				formula(0);
				setState(26);
				match(T__1);
				}
				break;
			case 6:
				{
				setState(28);
				match(NOT);
				setState(29);
				formula(21);
				}
				break;
			case 7:
				{
				setState(30);
				match(T__0);
				setState(31);
				match(NOT);
				setState(32);
				formula(0);
				setState(33);
				match(T__1);
				}
				break;
			case 8:
				{
				setState(35);
				match(T__2);
				setState(36);
				formula(0);
				setState(37);
				match(U);
				setState(38);
				formula(0);
				setState(39);
				match(T__3);
				}
				break;
			case 9:
				{
				setState(41);
				match(A);
				setState(42);
				match(X);
				setState(43);
				formula(17);
				}
				break;
			case 10:
				{
				setState(44);
				match(T__0);
				setState(45);
				match(A);
				setState(46);
				match(X);
				setState(47);
				match(T__1);
				}
				break;
			case 11:
				{
				setState(48);
				match(E);
				setState(49);
				match(X);
				setState(50);
				formula(15);
				}
				break;
			case 12:
				{
				setState(51);
				match(T__0);
				setState(52);
				match(E);
				setState(53);
				match(X);
				setState(54);
				match(T__1);
				}
				break;
			case 13:
				{
				setState(55);
				match(A);
				setState(56);
				match(F);
				setState(57);
				formula(13);
				}
				break;
			case 14:
				{
				setState(58);
				match(T__0);
				setState(59);
				match(A);
				setState(60);
				match(F);
				setState(61);
				match(T__1);
				}
				break;
			case 15:
				{
				setState(62);
				match(E);
				setState(63);
				match(F);
				setState(64);
				formula(11);
				}
				break;
			case 16:
				{
				setState(65);
				match(T__0);
				setState(66);
				match(E);
				setState(67);
				match(F);
				setState(68);
				match(T__1);
				}
				break;
			case 17:
				{
				setState(69);
				match(A);
				setState(70);
				match(G);
				setState(71);
				formula(9);
				}
				break;
			case 18:
				{
				setState(72);
				match(T__0);
				setState(73);
				match(A);
				setState(74);
				match(G);
				setState(75);
				formula(0);
				setState(76);
				match(T__1);
				}
				break;
			case 19:
				{
				setState(78);
				match(E);
				setState(79);
				match(G);
				setState(80);
				formula(7);
				}
				break;
			case 20:
				{
				setState(81);
				match(T__0);
				setState(82);
				match(E);
				setState(83);
				match(G);
				setState(84);
				formula(0);
				setState(85);
				match(T__1);
				}
				break;
			case 21:
				{
				setState(87);
				match(A);
				setState(88);
				match(T__2);
				setState(89);
				formula(0);
				setState(90);
				match(U);
				setState(91);
				formula(0);
				setState(92);
				match(T__3);
				}
				break;
			case 22:
				{
				setState(94);
				match(T__0);
				setState(95);
				match(A);
				setState(96);
				match(T__2);
				setState(97);
				formula(0);
				setState(98);
				match(U);
				setState(99);
				formula(0);
				setState(100);
				match(T__3);
				setState(101);
				match(T__1);
				}
				break;
			case 23:
				{
				setState(103);
				match(E);
				setState(104);
				match(T__2);
				setState(105);
				formula(0);
				setState(106);
				match(U);
				setState(107);
				formula(0);
				setState(108);
				match(T__3);
				}
				break;
			case 24:
				{
				setState(110);
				match(T__0);
				setState(111);
				match(E);
				setState(112);
				match(T__2);
				setState(113);
				formula(0);
				setState(114);
				match(U);
				setState(115);
				formula(0);
				setState(116);
				match(T__3);
				setState(117);
				match(T__1);
				}
				break;
			case 25:
				{
				setState(119);
				match(ATOM);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(134);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new FormulaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(122);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(123);
						match(IMP);
						setState(124);
						formula(28);
						}
						break;
					case 2:
						{
						_localctx = new FormulaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(125);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(126);
						match(OR);
						setState(127);
						formula(26);
						}
						break;
					case 3:
						{
						_localctx = new FormulaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(128);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(129);
						match(AND);
						setState(130);
						formula(24);
						}
						break;
					case 4:
						{
						_localctx = new FormulaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(131);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(132);
						match(U);
						setState(133);
						formula(20);
						}
						break;
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return formula_sempred((FormulaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean formula_sempred(FormulaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 27);
		case 1:
			return precpred(_ctx, 25);
		case 2:
			return precpred(_ctx, 23);
		case 3:
			return precpred(_ctx, 19);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25\u008e\4\2\t\2"+
		"\4\3\t\3\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3{\n\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0089\n\3\f\3\16\3\u008c"+
		"\13\3\3\3\2\3\4\4\2\4\2\2\2\u00a7\2\6\3\2\2\2\4z\3\2\2\2\6\7\5\4\3\2\7"+
		"\b\7\2\2\3\b\3\3\2\2\2\t\n\b\3\1\2\n{\7\n\2\2\13{\7\13\2\2\f\r\7\3\2\2"+
		"\r\16\5\4\3\2\16\17\7\f\2\2\17\20\5\4\3\2\20\21\7\4\2\2\21{\3\2\2\2\22"+
		"\23\7\3\2\2\23\24\5\4\3\2\24\25\7\b\2\2\25\26\5\4\3\2\26\27\7\4\2\2\27"+
		"{\3\2\2\2\30\31\7\3\2\2\31\32\5\4\3\2\32\33\7\7\2\2\33\34\5\4\3\2\34\35"+
		"\7\4\2\2\35{\3\2\2\2\36\37\7\t\2\2\37{\5\4\3\27 !\7\3\2\2!\"\7\t\2\2\""+
		"#\5\4\3\2#$\7\4\2\2${\3\2\2\2%&\7\5\2\2&\'\5\4\3\2\'(\7\22\2\2()\5\4\3"+
		"\2)*\7\6\2\2*{\3\2\2\2+,\7\20\2\2,-\7\r\2\2-{\5\4\3\23./\7\3\2\2/\60\7"+
		"\20\2\2\60\61\7\r\2\2\61{\7\4\2\2\62\63\7\17\2\2\63\64\7\r\2\2\64{\5\4"+
		"\3\21\65\66\7\3\2\2\66\67\7\17\2\2\678\7\r\2\28{\7\4\2\29:\7\20\2\2:;"+
		"\7\16\2\2;{\5\4\3\17<=\7\3\2\2=>\7\20\2\2>?\7\16\2\2?{\7\4\2\2@A\7\17"+
		"\2\2AB\7\16\2\2B{\5\4\3\rCD\7\3\2\2DE\7\17\2\2EF\7\16\2\2F{\7\4\2\2GH"+
		"\7\20\2\2HI\7\21\2\2I{\5\4\3\13JK\7\3\2\2KL\7\20\2\2LM\7\21\2\2MN\5\4"+
		"\3\2NO\7\4\2\2O{\3\2\2\2PQ\7\17\2\2QR\7\21\2\2R{\5\4\3\tST\7\3\2\2TU\7"+
		"\17\2\2UV\7\21\2\2VW\5\4\3\2WX\7\4\2\2X{\3\2\2\2YZ\7\20\2\2Z[\7\5\2\2"+
		"[\\\5\4\3\2\\]\7\22\2\2]^\5\4\3\2^_\7\6\2\2_{\3\2\2\2`a\7\3\2\2ab\7\20"+
		"\2\2bc\7\5\2\2cd\5\4\3\2de\7\22\2\2ef\5\4\3\2fg\7\6\2\2gh\7\4\2\2h{\3"+
		"\2\2\2ij\7\17\2\2jk\7\5\2\2kl\5\4\3\2lm\7\22\2\2mn\5\4\3\2no\7\6\2\2o"+
		"{\3\2\2\2pq\7\3\2\2qr\7\17\2\2rs\7\5\2\2st\5\4\3\2tu\7\22\2\2uv\5\4\3"+
		"\2vw\7\6\2\2wx\7\4\2\2x{\3\2\2\2y{\7\23\2\2z\t\3\2\2\2z\13\3\2\2\2z\f"+
		"\3\2\2\2z\22\3\2\2\2z\30\3\2\2\2z\36\3\2\2\2z \3\2\2\2z%\3\2\2\2z+\3\2"+
		"\2\2z.\3\2\2\2z\62\3\2\2\2z\65\3\2\2\2z9\3\2\2\2z<\3\2\2\2z@\3\2\2\2z"+
		"C\3\2\2\2zG\3\2\2\2zJ\3\2\2\2zP\3\2\2\2zS\3\2\2\2zY\3\2\2\2z`\3\2\2\2"+
		"zi\3\2\2\2zp\3\2\2\2zy\3\2\2\2{\u008a\3\2\2\2|}\f\35\2\2}~\7\f\2\2~\u0089"+
		"\5\4\3\36\177\u0080\f\33\2\2\u0080\u0081\7\b\2\2\u0081\u0089\5\4\3\34"+
		"\u0082\u0083\f\31\2\2\u0083\u0084\7\7\2\2\u0084\u0089\5\4\3\32\u0085\u0086"+
		"\f\25\2\2\u0086\u0087\7\22\2\2\u0087\u0089\5\4\3\26\u0088|\3\2\2\2\u0088"+
		"\177\3\2\2\2\u0088\u0082\3\2\2\2\u0088\u0085\3\2\2\2\u0089\u008c\3\2\2"+
		"\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\5\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\5z\u0088\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}