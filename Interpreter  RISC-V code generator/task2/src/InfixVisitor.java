// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link InfixParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface InfixVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link InfixParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(InfixParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link InfixParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(InfixParser.DecContext ctx);
	/**
	 * Visit a parse tree produced by {@link InfixParser#vardec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardec(InfixParser.VardecContext ctx);
	/**
	 * Visit a parse tree produced by {@link InfixParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(InfixParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link InfixParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(InfixParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link InfixParser#ene}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEne(InfixParser.EneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Integers}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegers(InfixParser.IntegersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BOOLEAN}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBOOLEAN(InfixParser.BOOLEANContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(InfixParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinOpExpr}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpExpr(InfixParser.BinOpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDFRargs}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDFRargs(InfixParser.IDFRargsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPRBlock}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPRBlock(InfixParser.EXPRBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IFThenElse}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIFThenElse(InfixParser.IFThenElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileDo}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileDo(InfixParser.WhileDoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RepeatUntil}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatUntil(InfixParser.RepeatUntilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(InfixParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Space}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpace(InfixParser.SpaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Newline}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewline(InfixParser.NewlineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Skip}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(InfixParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifiers}
	 * labeled alternative in {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiers(InfixParser.IdentifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link InfixParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(InfixParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link InfixParser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinop(InfixParser.BinopContext ctx);
}