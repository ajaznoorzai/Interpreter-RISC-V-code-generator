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
		Xor=24, LogicalOr=25, Less=26, More=27, INTYPE=28, BOOLTYPE=29, UNITTYPE=30, 
		Assign=31, While=32, Do=33, Local=34, IDFR=35, INTLIT=36, BOOLLIT=37, 
		WS=38, Comment=39;
	public static final int
		RULE_prog = 0, RULE_dec = 1, RULE_vardec = 2, RULE_body = 3, RULE_block = 4, 
		RULE_ene = 5, RULE_expr = 6, RULE_type = 7, RULE_args = 8, RULE_binop = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "dec", "vardec", "body", "block", "ene", "expr", "type", "args", 
			"binop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'then'", "'else'", "'repeat'", "'until'", "'print'", "'space'", 
			"'newline'", "'skip'", "'=='", "'('", "','", "')'", "'{'", "';'", "'}'", 
			"'/'", "'<='", "'>='", "'*'", "'+'", "'-'", "'&'", "'^'", "'|'", "'<'", 
			"'>'", "'int'", "'bool'", "'unit'", "':='", "'while'", "'do'", "'local'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "Quality", 
			"LParen", "Comma", "RParen", "LBrace", "Semicolon", "RBrace", "Divide", 
			"LessEq", "MoreEq", "Times", "Plus", "Minus", "And", "Xor", "LogicalOr", 
			"Less", "More", "INTYPE", "BOOLTYPE", "UNITTYPE", "Assign", "While", 
			"Do", "Local", "IDFR", "INTLIT", "BOOLLIT", "WS", "Comment"
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
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				dec();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0 );
			setState(25);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
			setState(27);
			type();
			setState(28);
			match(IDFR);
			setState(29);
			match(LParen);
			setState(30);
			vardec();
			setState(31);
			match(RParen);
			setState(32);
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
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
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
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0) {
				{
				setState(34);
				type();
				setState(35);
				match(IDFR);
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(36);
					match(Comma);
					setState(37);
					type();
					setState(38);
					match(IDFR);
					}
					}
					setState(44);
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
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
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
			setState(47);
			match(LBrace);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0) {
				{
				{
				setState(48);
				type();
				setState(49);
				((BodyContext)_localctx).IDFR = match(IDFR);
				((BodyContext)_localctx).localvar.add(((BodyContext)_localctx).IDFR);
				setState(50);
				match(Assign);
				setState(51);
				((BodyContext)_localctx).expr = expr();
				((BodyContext)_localctx).localvarexpr.add(((BodyContext)_localctx).expr);
				setState(52);
				match(Semicolon);
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			ene();
			setState(60);
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
			setState(62);
			match(LBrace);
			setState(63);
			ene();
			setState(64);
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
			setState(66);
			expr();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semicolon) {
				{
				{
				setState(67);
				match(Semicolon);
				setState(68);
				expr();
				}
				}
				setState(73);
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
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new IntegersContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(INTLIT);
				}
				break;
			case 2:
				_localctx = new BOOLEANContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(BOOLLIT);
				}
				break;
			case 3:
				_localctx = new AssignExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				match(IDFR);
				setState(77);
				match(Assign);
				setState(78);
				expr();
				}
				break;
			case 4:
				_localctx = new BinOpExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				match(LParen);
				setState(80);
				expr();
				setState(81);
				binop();
				setState(82);
				expr();
				setState(83);
				match(RParen);
				}
				break;
			case 5:
				_localctx = new IDFRargsContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				match(IDFR);
				setState(86);
				match(LParen);
				setState(87);
				args();
				setState(88);
				match(RParen);
				}
				break;
			case 6:
				_localctx = new EXPRBlockContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				block();
				}
				break;
			case 7:
				_localctx = new IFThenElseContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(91);
				match(T__0);
				setState(92);
				expr();
				setState(93);
				match(T__1);
				setState(94);
				block();
				setState(95);
				match(T__2);
				setState(96);
				block();
				}
				break;
			case 8:
				_localctx = new WhileDoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(98);
				match(While);
				setState(99);
				expr();
				setState(100);
				match(Do);
				setState(101);
				block();
				}
				break;
			case 9:
				_localctx = new RepeatUntilContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(103);
				match(T__3);
				setState(104);
				block();
				setState(105);
				match(T__4);
				setState(106);
				expr();
				}
				break;
			case 10:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(108);
				match(T__5);
				setState(109);
				expr();
				}
				break;
			case 11:
				_localctx = new SpaceContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(110);
				match(T__6);
				}
				break;
			case 12:
				_localctx = new NewlineContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(111);
				match(T__7);
				}
				break;
			case 13:
				_localctx = new SkipContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(112);
				match(T__8);
				}
				break;
			case 14:
				_localctx = new IdentifiersContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(113);
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTYPE() { return getToken(InfixParser.INTYPE, 0); }
		public TerminalNode BOOLTYPE() { return getToken(InfixParser.BOOLTYPE, 0); }
		public TerminalNode UNITTYPE() { return getToken(InfixParser.UNITTYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InfixListener ) ((InfixListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InfixVisitor ) return ((InfixVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0) ) {
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
		enterRule(_localctx, 16, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 244813155282L) != 0) {
				{
				setState(118);
				expr();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma || _la==IDFR) {
					{
					setState(122);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Comma:
						{
						setState(119);
						match(Comma);
						setState(120);
						expr();
						}
						break;
					case IDFR:
						{
						setState(121);
						match(IDFR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(126);
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
		enterRule(_localctx, 18, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
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
		"\u0004\u0001\'\u0084\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0004\u0000\u0016\b\u0000\u000b"+
		"\u0000\f\u0000\u0017\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002)\b"+
		"\u0002\n\u0002\f\u0002,\t\u0002\u0003\u0002.\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u00037\b\u0003\n\u0003\f\u0003:\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005F\b\u0005\n\u0005\f\u0005I\t\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006s\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b{\b\b\n\b\f"+
		"\b~\t\b\u0003\b\u0080\b\b\u0001\t\u0001\t\u0001\t\u0000\u0000\n\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0002\u0001\u0000\u001c"+
		"\u001e\u0002\u0000\n\n\u0011\u001b\u008e\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0002\u001b\u0001\u0000\u0000\u0000\u0004-\u0001\u0000\u0000\u0000"+
		"\u0006/\u0001\u0000\u0000\u0000\b>\u0001\u0000\u0000\u0000\nB\u0001\u0000"+
		"\u0000\u0000\fr\u0001\u0000\u0000\u0000\u000et\u0001\u0000\u0000\u0000"+
		"\u0010\u007f\u0001\u0000\u0000\u0000\u0012\u0081\u0001\u0000\u0000\u0000"+
		"\u0014\u0016\u0003\u0002\u0001\u0000\u0015\u0014\u0001\u0000\u0000\u0000"+
		"\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000"+
		"\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000"+
		"\u0019\u001a\u0005\u0000\u0000\u0001\u001a\u0001\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\u0003\u000e\u0007\u0000\u001c\u001d\u0005#\u0000\u0000\u001d"+
		"\u001e\u0005\u000b\u0000\u0000\u001e\u001f\u0003\u0004\u0002\u0000\u001f"+
		" \u0005\r\u0000\u0000 !\u0003\u0006\u0003\u0000!\u0003\u0001\u0000\u0000"+
		"\u0000\"#\u0003\u000e\u0007\u0000#*\u0005#\u0000\u0000$%\u0005\f\u0000"+
		"\u0000%&\u0003\u000e\u0007\u0000&\'\u0005#\u0000\u0000\')\u0001\u0000"+
		"\u0000\u0000($\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001"+
		"\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000"+
		",*\u0001\u0000\u0000\u0000-\"\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000"+
		"\u0000.\u0005\u0001\u0000\u0000\u0000/8\u0005\u000e\u0000\u000001\u0003"+
		"\u000e\u0007\u000012\u0005#\u0000\u000023\u0005\u001f\u0000\u000034\u0003"+
		"\f\u0006\u000045\u0005\u000f\u0000\u000057\u0001\u0000\u0000\u000060\u0001"+
		"\u0000\u0000\u00007:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u0000"+
		"89\u0001\u0000\u0000\u00009;\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000"+
		"\u0000;<\u0003\n\u0005\u0000<=\u0005\u0010\u0000\u0000=\u0007\u0001\u0000"+
		"\u0000\u0000>?\u0005\u000e\u0000\u0000?@\u0003\n\u0005\u0000@A\u0005\u0010"+
		"\u0000\u0000A\t\u0001\u0000\u0000\u0000BG\u0003\f\u0006\u0000CD\u0005"+
		"\u000f\u0000\u0000DF\u0003\f\u0006\u0000EC\u0001\u0000\u0000\u0000FI\u0001"+
		"\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000"+
		"H\u000b\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000Js\u0005$\u0000"+
		"\u0000Ks\u0005%\u0000\u0000LM\u0005#\u0000\u0000MN\u0005\u001f\u0000\u0000"+
		"Ns\u0003\f\u0006\u0000OP\u0005\u000b\u0000\u0000PQ\u0003\f\u0006\u0000"+
		"QR\u0003\u0012\t\u0000RS\u0003\f\u0006\u0000ST\u0005\r\u0000\u0000Ts\u0001"+
		"\u0000\u0000\u0000UV\u0005#\u0000\u0000VW\u0005\u000b\u0000\u0000WX\u0003"+
		"\u0010\b\u0000XY\u0005\r\u0000\u0000Ys\u0001\u0000\u0000\u0000Zs\u0003"+
		"\b\u0004\u0000[\\\u0005\u0001\u0000\u0000\\]\u0003\f\u0006\u0000]^\u0005"+
		"\u0002\u0000\u0000^_\u0003\b\u0004\u0000_`\u0005\u0003\u0000\u0000`a\u0003"+
		"\b\u0004\u0000as\u0001\u0000\u0000\u0000bc\u0005 \u0000\u0000cd\u0003"+
		"\f\u0006\u0000de\u0005!\u0000\u0000ef\u0003\b\u0004\u0000fs\u0001\u0000"+
		"\u0000\u0000gh\u0005\u0004\u0000\u0000hi\u0003\b\u0004\u0000ij\u0005\u0005"+
		"\u0000\u0000jk\u0003\f\u0006\u0000ks\u0001\u0000\u0000\u0000lm\u0005\u0006"+
		"\u0000\u0000ms\u0003\f\u0006\u0000ns\u0005\u0007\u0000\u0000os\u0005\b"+
		"\u0000\u0000ps\u0005\t\u0000\u0000qs\u0005#\u0000\u0000rJ\u0001\u0000"+
		"\u0000\u0000rK\u0001\u0000\u0000\u0000rL\u0001\u0000\u0000\u0000rO\u0001"+
		"\u0000\u0000\u0000rU\u0001\u0000\u0000\u0000rZ\u0001\u0000\u0000\u0000"+
		"r[\u0001\u0000\u0000\u0000rb\u0001\u0000\u0000\u0000rg\u0001\u0000\u0000"+
		"\u0000rl\u0001\u0000\u0000\u0000rn\u0001\u0000\u0000\u0000ro\u0001\u0000"+
		"\u0000\u0000rp\u0001\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000s\r\u0001"+
		"\u0000\u0000\u0000tu\u0007\u0000\u0000\u0000u\u000f\u0001\u0000\u0000"+
		"\u0000v|\u0003\f\u0006\u0000wx\u0005\f\u0000\u0000x{\u0003\f\u0006\u0000"+
		"y{\u0005#\u0000\u0000zw\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000"+
		"{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f"+
		"v\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0011"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0007\u0001\u0000\u0000\u0082\u0013"+
		"\u0001\u0000\u0000\u0000\t\u0017*-8Grz|\u007f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}