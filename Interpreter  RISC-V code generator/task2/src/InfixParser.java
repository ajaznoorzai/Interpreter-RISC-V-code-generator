// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class InfixParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		Quality=10, LParen=11, Comma=12, RParen=13, LBrace=14, Semicolon=15, RBrace=16, 
		Divide=17, LessEq=18, MoreEq=19, Times=20, Plus=21, Minus=22, And=23, 
		Xor=24, LogicalOr=25, Less=26, More=27, Assign=28, While=29, Do=30, Local=31, 
		TYPE=32, IDFR=33, INTLIT=34, BOOLLIT=35, WS=36, Comment=37;
	public static final int
		RULE_prog = 0, RULE_dec = 1, RULE_vardec = 2, RULE_body = 3, RULE_block = 4, 
		RULE_ene = 5, RULE_expr = 6, RULE_args = 7, RULE_binop = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "dec", "vardec", "body", "block", "ene", "expr", "args", "binop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'then'", "'else'", "'repeat'", "'until'", "'print'", "'space'", 
			"'newline'", "'skip'", "'=='", "'('", "','", "')'", "'{'", "';'", "'}'", 
			"'/'", "'<='", "'>='", "'*'", "'+'", "'-'", "'&'", "'^'", "'|'", "'<'", 
			"'>'", "':='", "'while'", "'do'", "'local'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "Quality", 
			"LParen", "Comma", "RParen", "LBrace", "Semicolon", "RBrace", "Divide", 
			"LessEq", "MoreEq", "Times", "Plus", "Minus", "And", "Xor", "LogicalOr", 
			"Less", "More", "Assign", "While", "Do", "Local", "TYPE", "IDFR", "INTLIT", 
			"BOOLLIT", "WS", "Comment"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public InfixParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(InfixParser.EOF, 0); }
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfixVisitor ) return ((InfixVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				dec();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TYPE );
			setState(23);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(InfixParser.TYPE, 0); }
		public TerminalNode IDFR() { return getToken(InfixParser.IDFR, 0); }
		public TerminalNode LParen() { return getToken(InfixParser.LParen, 0); }
		public VardecContext vardec() {
			return getRuleContext(VardecContext.class,0);
		}
		public TerminalNode RParen() { return getToken(InfixParser.RParen, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).exitDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfixVisitor ) return ((InfixVisitor<? extends T>)visitor).visitDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(TYPE);
			setState(26);
			match(IDFR);
			setState(27);
			match(LParen);
			setState(28);
			vardec();
			setState(29);
			match(RParen);
			setState(30);
			body();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VardecContext extends ParserRuleContext {
		public List<TerminalNode> TYPE() { return getTokens(InfixParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(InfixParser.TYPE, i);
		}
		public List<TerminalNode> IDFR() { return getTokens(InfixParser.IDFR); }
		public TerminalNode IDFR(int i) {
			return getToken(InfixParser.IDFR, i);
		}
		public List<TerminalNode> Comma() { return getTokens(InfixParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(InfixParser.Comma, i);
		}
		public VardecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).enterVardec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).exitVardec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfixVisitor ) return ((InfixVisitor<? extends T>)visitor).visitVardec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardecContext vardec() throws RecognitionException {
		VardecContext _localctx = new VardecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vardec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(32);
				match(TYPE);
				setState(33);
				match(IDFR);
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(34);
					match(Comma);
					setState(35);
					match(TYPE);
					setState(36);
					match(IDFR);
					}
					}
					setState(41);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public Token IDFR;
		public List<Token> localvar = new ArrayList<Token>();
		public ExprContext expr;
		public List<ExprContext> localvarexpr = new ArrayList<ExprContext>();
		public TerminalNode LBrace() { return getToken(InfixParser.LBrace, 0); }
		public EneContext ene() {
			return getRuleContext(EneContext.class,0);
		}
		public TerminalNode RBrace() { return getToken(InfixParser.RBrace, 0); }
		public List<TerminalNode> TYPE() { return getTokens(InfixParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(InfixParser.TYPE, i);
		}
		public List<TerminalNode> Assign() { return getTokens(InfixParser.Assign); }
		public TerminalNode Assign(int i) {
			return getToken(InfixParser.Assign, i);
		}
		public List<TerminalNode> Semicolon() { return getTokens(InfixParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(InfixParser.Semicolon, i);
		}
		public List<TerminalNode> IDFR() { return getTokens(InfixParser.IDFR); }
		public TerminalNode IDFR(int i) {
			return getToken(InfixParser.IDFR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfixVisitor ) return ((InfixVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(LBrace);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(45);
				match(TYPE);
				setState(46);
				((BodyContext)_localctx).IDFR = match(IDFR);
				((BodyContext)_localctx).localvar.add(((BodyContext)_localctx).IDFR);
				setState(47);
				match(Assign);
				setState(48);
				((BodyContext)_localctx).expr = expr();
				((BodyContext)_localctx).localvarexpr.add(((BodyContext)_localctx).expr);
				setState(49);
				match(Semicolon);
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			ene();
			setState(57);
			match(RBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBrace() { return getToken(InfixParser.LBrace, 0); }
		public EneContext ene() {
			return getRuleContext(EneContext.class,0);
		}
		public TerminalNode RBrace() { return getToken(InfixParser.RBrace, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfixVisitor ) return ((InfixVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(LBrace);
			setState(60);
			ene();
			setState(61);
			match(RBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EneContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Semicolon() { return getTokens(InfixParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(InfixParser.Semicolon, i);
		}
		public EneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ene; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).enterEne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).exitEne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfixVisitor ) return ((InfixVisitor<? extends T>)visitor).visitEne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EneContext ene() throws RecognitionException {
		EneContext _localctx = new EneContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ene);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			expr();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semicolon) {
				{
				{
				setState(64);
				match(Semicolon);
				setState(65);
				expr();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegersContext extends ExprContext {
		public TerminalNode INTLIT() { return getToken(InfixParser.INTLIT, 0); }
		public IntegersContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).enterIntegers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).exitIntegers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfixVisitor ) return ((InfixVisitor<? extends T>)visitor).visitIntegers(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SpaceContext extends ExprContext {
		public SpaceContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).enterSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).exitSpace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfixVisitor ) return ((InfixVisitor<? extends T>)visitor).visitSpace(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IDFRargsContext extends ExprContext {
		public TerminalNode IDFR() { return getToken(InfixParser.IDFR, 0); }
		public TerminalNode LParen() { return getToken(InfixParser.LParen, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode RParen() { return getToken(InfixParser.RParen, 0); }
		public IDFRargsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).enterIDFRargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).exitIDFRargs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfixVisitor ) return ((InfixVisitor<? extends T>)visitor).visitIDFRargs(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IFThenElseContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IFThenElseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).enterIFThenElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).exitIFThenElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfixVisitor ) return ((InfixVisitor<? extends T>)visitor).visitIFThenElse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewlineContext extends ExprContext {
		public NewlineContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).enterNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).exitNewline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfixVisitor ) return ((InfixVisitor<? extends T>)visitor).visitNewline(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileDoContext extends ExprContext {
		public TerminalNode While() { return getToken(InfixParser.While, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Do() { return getToken(InfixParser.Do, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileDoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).enterWhileDo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).exitWhileDo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfixVisitor ) return ((InfixVisitor<? extends T>)visitor).visitWhileDo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BOOLEANContext extends ExprContext {
		public TerminalNode BOOLLIT() { return getToken(InfixParser.BOOLLIT, 0); }
		public BOOLEANContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).enterBOOLEAN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).exitBOOLEAN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfixVisitor ) return ((InfixVisitor<? extends T>)visitor).visitBOOLEAN(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignExprContext extends ExprContext {
		public TerminalNode IDFR() { return getToken(InfixParser.IDFR, 0); }
		public TerminalNode Assign() { return getToken(InfixParser.Assign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfixVisitor ) return ((InfixVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RepeatUntilContext extends ExprContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RepeatUntilContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).enterRepeatUntil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).exitRepeatUntil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfixVisitor ) return ((InfixVisitor<? extends T>)visitor).visitRepeatUntil(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfixVisitor ) return ((InfixVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EXPRBlockContext extends ExprContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EXPRBlockContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).enterEXPRBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).exitEXPRBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfixVisitor ) return ((InfixVisitor<? extends T>)visitor).visitEXPRBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SkipContext extends ExprContext {
		public SkipContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).enterSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).exitSkip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfixVisitor ) return ((InfixVisitor<? extends T>)visitor).visitSkip(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpExprContext extends ExprContext {
		public TerminalNode LParen() { return getToken(InfixParser.LParen, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public TerminalNode RParen() { return getToken(InfixParser.RParen, 0); }
		public BinOpExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).enterBinOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).exitBinOpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfixVisitor ) return ((InfixVisitor<? extends T>)visitor).visitBinOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifiersContext extends ExprContext {
		public TerminalNode IDFR() { return getToken(InfixParser.IDFR, 0); }
		public IdentifiersContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).enterIdentifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).exitIdentifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfixVisitor ) return ((InfixVisitor<? extends T>)visitor).visitIdentifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new IntegersContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(INTLIT);
				}
				break;
			case 2:
				_localctx = new BOOLEANContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(BOOLLIT);
				}
				break;
			case 3:
				_localctx = new AssignExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				match(IDFR);
				setState(74);
				match(Assign);
				setState(75);
				expr();
				}
				break;
			case 4:
				_localctx = new BinOpExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				match(LParen);
				setState(77);
				expr();
				setState(78);
				binop();
				setState(79);
				expr();
				setState(80);
				match(RParen);
				}
				break;
			case 5:
				_localctx = new IDFRargsContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				match(IDFR);
				setState(83);
				match(LParen);
				setState(84);
				args();
				setState(85);
				match(RParen);
				}
				break;
			case 6:
				_localctx = new EXPRBlockContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				block();
				}
				break;
			case 7:
				_localctx = new IFThenElseContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(88);
				match(T__0);
				setState(89);
				expr();
				setState(90);
				match(T__1);
				setState(91);
				block();
				setState(92);
				match(T__2);
				setState(93);
				block();
				}
				break;
			case 8:
				_localctx = new WhileDoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(95);
				match(While);
				setState(96);
				expr();
				setState(97);
				match(Do);
				setState(98);
				block();
				}
				break;
			case 9:
				_localctx = new RepeatUntilContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(100);
				match(T__3);
				setState(101);
				block();
				setState(102);
				match(T__4);
				setState(103);
				expr();
				}
				break;
			case 10:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(105);
				match(T__5);
				setState(106);
				expr();
				}
				break;
			case 11:
				_localctx = new SpaceContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(107);
				match(T__6);
				}
				break;
			case 12:
				_localctx = new NewlineContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(108);
				match(T__7);
				}
				break;
			case 13:
				_localctx = new SkipContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(109);
				match(T__8);
				}
				break;
			case 14:
				_localctx = new IdentifiersContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(110);
				match(IDFR);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(InfixParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(InfixParser.Comma, i);
		}
		public List<TerminalNode> IDFR() { return getTokens(InfixParser.IDFR); }
		public TerminalNode IDFR(int i) {
			return getToken(InfixParser.IDFR, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfixVisitor ) return ((InfixVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 60666432466L) != 0) {
				{
				setState(113);
				expr();
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma || _la==IDFR) {
					{
					setState(117);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Comma:
						{
						setState(114);
						match(Comma);
						setState(115);
						expr();
						}
						break;
					case IDFR:
						{
						setState(116);
						match(IDFR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class BinopContext extends ParserRuleContext {
		public TerminalNode Quality() { return getToken(InfixParser.Quality, 0); }
		public TerminalNode Less() { return getToken(InfixParser.Less, 0); }
		public TerminalNode More() { return getToken(InfixParser.More, 0); }
		public TerminalNode LessEq() { return getToken(InfixParser.LessEq, 0); }
		public TerminalNode MoreEq() { return getToken(InfixParser.MoreEq, 0); }
		public TerminalNode Plus() { return getToken(InfixParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(InfixParser.Minus, 0); }
		public TerminalNode Times() { return getToken(InfixParser.Times, 0); }
		public TerminalNode Divide() { return getToken(InfixParser.Divide, 0); }
		public TerminalNode And() { return getToken(InfixParser.And, 0); }
		public TerminalNode LogicalOr() { return getToken(InfixParser.LogicalOr, 0); }
		public TerminalNode Xor() { return getToken(InfixParser.Xor, 0); }
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).enterBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).exitBinop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfixVisitor ) return ((InfixVisitor<? extends T>)visitor).visitBinop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 268305408L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		"\u0004\u0001%\u007f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0004\u0000\u0014\b\u0000\u000b\u0000\f\u0000\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002&\b\u0002\n\u0002\f\u0002)\t\u0002"+
		"\u0003\u0002+\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u00034\b\u0003\n\u0003\f\u0003"+
		"7\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"C\b\u0005\n\u0005\f\u0005F\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006p\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007v\b\u0007\n\u0007\f\u0007y\t\u0007\u0003\u0007"+
		"{\b\u0007\u0001\b\u0001\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0000\u0001\u0002\u0000\n\n\u0011\u001b\u008a\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0002\u0019\u0001\u0000\u0000\u0000\u0004"+
		"*\u0001\u0000\u0000\u0000\u0006,\u0001\u0000\u0000\u0000\b;\u0001\u0000"+
		"\u0000\u0000\n?\u0001\u0000\u0000\u0000\fo\u0001\u0000\u0000\u0000\u000e"+
		"z\u0001\u0000\u0000\u0000\u0010|\u0001\u0000\u0000\u0000\u0012\u0014\u0003"+
		"\u0002\u0001\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0015\u0001"+
		"\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001"+
		"\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0018\u0005"+
		"\u0000\u0000\u0001\u0018\u0001\u0001\u0000\u0000\u0000\u0019\u001a\u0005"+
		" \u0000\u0000\u001a\u001b\u0005!\u0000\u0000\u001b\u001c\u0005\u000b\u0000"+
		"\u0000\u001c\u001d\u0003\u0004\u0002\u0000\u001d\u001e\u0005\r\u0000\u0000"+
		"\u001e\u001f\u0003\u0006\u0003\u0000\u001f\u0003\u0001\u0000\u0000\u0000"+
		" !\u0005 \u0000\u0000!\'\u0005!\u0000\u0000\"#\u0005\f\u0000\u0000#$\u0005"+
		" \u0000\u0000$&\u0005!\u0000\u0000%\"\u0001\u0000\u0000\u0000&)\u0001"+
		"\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000"+
		"(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000* \u0001\u0000\u0000"+
		"\u0000*+\u0001\u0000\u0000\u0000+\u0005\u0001\u0000\u0000\u0000,5\u0005"+
		"\u000e\u0000\u0000-.\u0005 \u0000\u0000./\u0005!\u0000\u0000/0\u0005\u001c"+
		"\u0000\u000001\u0003\f\u0006\u000012\u0005\u000f\u0000\u000024\u0001\u0000"+
		"\u0000\u00003-\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001"+
		"\u0000\u0000\u000056\u0001\u0000\u0000\u000068\u0001\u0000\u0000\u0000"+
		"75\u0001\u0000\u0000\u000089\u0003\n\u0005\u00009:\u0005\u0010\u0000\u0000"+
		":\u0007\u0001\u0000\u0000\u0000;<\u0005\u000e\u0000\u0000<=\u0003\n\u0005"+
		"\u0000=>\u0005\u0010\u0000\u0000>\t\u0001\u0000\u0000\u0000?D\u0003\f"+
		"\u0006\u0000@A\u0005\u000f\u0000\u0000AC\u0003\f\u0006\u0000B@\u0001\u0000"+
		"\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001"+
		"\u0000\u0000\u0000E\u000b\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000"+
		"\u0000Gp\u0005\"\u0000\u0000Hp\u0005#\u0000\u0000IJ\u0005!\u0000\u0000"+
		"JK\u0005\u001c\u0000\u0000Kp\u0003\f\u0006\u0000LM\u0005\u000b\u0000\u0000"+
		"MN\u0003\f\u0006\u0000NO\u0003\u0010\b\u0000OP\u0003\f\u0006\u0000PQ\u0005"+
		"\r\u0000\u0000Qp\u0001\u0000\u0000\u0000RS\u0005!\u0000\u0000ST\u0005"+
		"\u000b\u0000\u0000TU\u0003\u000e\u0007\u0000UV\u0005\r\u0000\u0000Vp\u0001"+
		"\u0000\u0000\u0000Wp\u0003\b\u0004\u0000XY\u0005\u0001\u0000\u0000YZ\u0003"+
		"\f\u0006\u0000Z[\u0005\u0002\u0000\u0000[\\\u0003\b\u0004\u0000\\]\u0005"+
		"\u0003\u0000\u0000]^\u0003\b\u0004\u0000^p\u0001\u0000\u0000\u0000_`\u0005"+
		"\u001d\u0000\u0000`a\u0003\f\u0006\u0000ab\u0005\u001e\u0000\u0000bc\u0003"+
		"\b\u0004\u0000cp\u0001\u0000\u0000\u0000de\u0005\u0004\u0000\u0000ef\u0003"+
		"\b\u0004\u0000fg\u0005\u0005\u0000\u0000gh\u0003\f\u0006\u0000hp\u0001"+
		"\u0000\u0000\u0000ij\u0005\u0006\u0000\u0000jp\u0003\f\u0006\u0000kp\u0005"+
		"\u0007\u0000\u0000lp\u0005\b\u0000\u0000mp\u0005\t\u0000\u0000np\u0005"+
		"!\u0000\u0000oG\u0001\u0000\u0000\u0000oH\u0001\u0000\u0000\u0000oI\u0001"+
		"\u0000\u0000\u0000oL\u0001\u0000\u0000\u0000oR\u0001\u0000\u0000\u0000"+
		"oW\u0001\u0000\u0000\u0000oX\u0001\u0000\u0000\u0000o_\u0001\u0000\u0000"+
		"\u0000od\u0001\u0000\u0000\u0000oi\u0001\u0000\u0000\u0000ok\u0001\u0000"+
		"\u0000\u0000ol\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000on\u0001"+
		"\u0000\u0000\u0000p\r\u0001\u0000\u0000\u0000qw\u0003\f\u0006\u0000rs"+
		"\u0005\f\u0000\u0000sv\u0003\f\u0006\u0000tv\u0005!\u0000\u0000ur\u0001"+
		"\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000zq\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{\u000f\u0001\u0000\u0000\u0000|}\u0007\u0000\u0000\u0000"+
		"}\u0011\u0001\u0000\u0000\u0000\t\u0015\'*5Douwz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}