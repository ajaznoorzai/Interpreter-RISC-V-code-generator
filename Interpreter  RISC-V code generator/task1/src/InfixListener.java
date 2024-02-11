// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InfixParser}.
 */
public interface InfixListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InfixParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(InfixParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link InfixParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(InfixParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link InfixParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(InfixParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link InfixParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(InfixParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link InfixParser#vardec}.
	 * @param ctx the parse tree
	 */
	void enterVardec(InfixParser.VardecContext ctx);
	/**
	 * Exit a parse tree produced by {@link InfixParser#vardec}.
	 * @param ctx the parse tree
	 */
	void exitVardec(InfixParser.VardecContext ctx);
	/**
	 * Enter a parse tree produced by {@link InfixParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(InfixParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link InfixParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(InfixParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link InfixParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(InfixParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link InfixParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(InfixParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link InfixParser#ene}.
	 * @param ctx the parse tree
	 */
	void enterEne(InfixParser.EneContext ctx);
	/**
	 * Exit a parse tree produced by {@link InfixParser#ene}.
	 * @param ctx the parse tree
	 */
	void exitEne(InfixParser.EneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Integers}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntegers(InfixParser.IntegersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integers}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntegers(InfixParser.IntegersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BOOLEAN}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBOOLEAN(InfixParser.BOOLEANContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BOOLEAN}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBOOLEAN(InfixParser.BOOLEANContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(InfixParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(InfixParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinOpExpr}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinOpExpr(InfixParser.BinOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinOpExpr}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinOpExpr(InfixParser.BinOpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDFRargs}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIDFRargs(InfixParser.IDFRargsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDFRargs}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIDFRargs(InfixParser.IDFRargsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPRBlock}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEXPRBlock(InfixParser.EXPRBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPRBlock}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEXPRBlock(InfixParser.EXPRBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IFThenElse}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIFThenElse(InfixParser.IFThenElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IFThenElse}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIFThenElse(InfixParser.IFThenElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileDo}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterWhileDo(InfixParser.WhileDoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileDo}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitWhileDo(InfixParser.WhileDoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RepeatUntil}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRepeatUntil(InfixParser.RepeatUntilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RepeatUntil}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRepeatUntil(InfixParser.RepeatUntilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Print}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPrint(InfixParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPrint(InfixParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Space}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSpace(InfixParser.SpaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Space}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSpace(InfixParser.SpaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Newline}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNewline(InfixParser.NewlineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Newline}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNewline(InfixParser.NewlineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Skip}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSkip(InfixParser.SkipContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Skip}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSkip(InfixParser.SkipContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifiers}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiers(InfixParser.IdentifiersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifiers}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiers(InfixParser.IdentifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link InfixParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(InfixParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link InfixParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(InfixParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link InfixParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(InfixParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link InfixParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(InfixParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link InfixParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterBinop(InfixParser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link InfixParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitBinop(InfixParser.BinopContext ctx);
}