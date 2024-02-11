import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InfixCodeGenerator extends AbstractParseTreeVisitor<String> implements InfixVisitor<String>
{

    private int numOfArgs;
    private List<TerminalNode> args;
    private final Map<String, Integer> localVars = new HashMap<>();
    private int labelCounter = 0;

    @Override
    public String visitProg(InfixParser.ProgContext ctx) {


        numOfArgs = ctx.dec().size();
        args = ctx.dec(labelCounter).IDFR();
        return visit(ctx.dec(labelCounter));


        return null;
    }

    @Override
    public String visitDec(InfixParser.DecContext ctx) {



        return null;
    }

    @Override
    public String visitVardec(InfixParser.VardecContext ctx) {

        return null;

    }

    @Override
    public String visitBody(InfixParser.BodyContext ctx) {
        if (numOfArgs + ctx.localvar.size() > 22) {     // x10 - x31
            throw new RuntimeException("Too many local variables.");
        }

        StringBuilder sb = new StringBuilder();

        sb.append("""
                main:
                    lw          ra, 4(sp)
                    addi        sp, sp, 4
                """
        );

        int regOffset = 10;

        for (int i = 0; i < numOfArgs; ++i) {
            localVars.put(args.get(i).getText(), i + regOffset);
            sb.append(
                    String.format("""
                    lw          x%2d, 4(sp)
                    addi        sp, sp, 4
                """,
                            i + regOffset
                    )
            );
        }

        regOffset = regOffset + numOfArgs;

        sb.append("""
                    addi        sp, sp, 4
                """
        );
        sb.append("""
                    ret
                """
        );

        return sb.toString();

    }

    @Override
    public String visitBlock(InfixParser.BlockContext ctx) {


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.ene().expr().size(); ++i) {
            sb.append(visit(ctx.ene().expr().get(i)));

            if (
                    ctx.ene().expr().get(i) instanceof InfixParser.BinOpExprContext
                            || ctx.ene().expr().get(i) instanceof InfixParser.IdentifiersContext
                            || ctx.ene().expr().get(i) instanceof InfixParser.IdentifiersContext
            ) {

                sb.append("""
                    Discard     4
                """
                );

            }

        }

        return sb.toString();
    }

    @Override
    public String visitEne(InfixParser.EneContext ctx) {
        return null;
    }

    @Override
    public String visitIdentifiers(InfixParser.IdentifiersContext ctx) {
        return null;
    }

    @Override
    public String visitIntegers(InfixParser.IntegersContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(
                String.format("""
                    PushImm     %d
                """,
                        Integer.parseInt(ctx.INTLIT().getText())
                )
        );
        return sb.toString();
    }

    @Override
    public String visitBOOLEAN(InfixParser.BOOLEANContext ctx) {
        return null;
    }

    @Override
    public String visitAssignExpr(InfixParser.AssignExprContext ctx) {


        StringBuilder sb = new StringBuilder();
        sb.append(visit(ctx.expr()));
        sb.append(
                String.format("""
                    PopReg      x%2d
                """,
                        localVars.get(ctx.IDFR().getText())
                )
        );
        return sb.toString();
    }

    @Override
    public String visitBinOpExpr(InfixParser.BinOpExprContext ctx) {


            StringBuilder sb = new StringBuilder();

            sb.append(visit(ctx.expr(1)));
            sb.append(visit(ctx.expr(0)));

            switch (((TerminalNode) (ctx.binop().getChild(0))).getSymbol().getType())

            {

                case InfixParser.LessEq -> {

                    sb.append("""
                                CompLE
                            """
                    );

                }
                case InfixParser.MoreEq -> {

                    sb.append("""
                                 CompMQ
                            """

                    );
                }


                case InfixParser.Plus -> {

                    sb.append("""
                                Plus
                            """
                    );

                }

                case InfixParser.Times ->{

                    sb.append("""
                                  Times   
                            """

                    );
                }
                case InfixParser.Minus -> {

                    sb.append("""
                                Minus
                            """
                    );

                }
                case InfixParser.And -> {

                    sb.append("""
                                LogicalAnd
                            """
                    );

                }
                case InfixParser.Xor -> {

                    sb.append("""
                                LogicalXor
                            """
                    );

                }
                case InfixParser.LogicalOr -> {

                    sb.append("""
                             LogicalOr
                        """
                    );
                }
                case InfixParser.More -> {

                    sb.append("""
                             More 
                        """
                    );

                }
                case InfixParser.Divide -> {

                    sb.append("""
                             Divide
                        """
                    );

                }






                default -> {
                    throw new RuntimeException("Shouldn't be here - wrong binary operator.");
                }

            }




            return sb.toString();

    }

    @Override
    public String visitIDFRargs(InfixParser.IDFRargsContext ctx) {
        return null;
    }

    @Override
    public String visitEXPRBlock(InfixParser.EXPRBlockContext ctx) {
        return null;
    }

    @Override
    public String visitIFThenElse(InfixParser.IFThenElseContext ctx) {
        {

            StringBuilder sb = new StringBuilder();
            String loopLabel = String.format("label_%d", labelCounter++);
            String exitLabel = String.format("label_%d", labelCounter++);

            sb.append(
                    String.format("""
                %s:
                """,
                            loopLabel)
            );

            sb.append(visit(ctx.expr()));

            sb.append(
                    String.format("""
                    PushImm     1
                    LogicalXor
                    JumpTrue    %s
                """,
                            exitLabel)
            );

            sb.append(visit(ctx.block()));
            sb.append(
                    String.format("""
                    PushImm     1
                    LogicalXor
                    JumpTrue    %s
                """,
                            exitLabel)
            );

            sb.append(visit(ctx.block()));

            sb.append(
                    String.format("""
                    Jump        %s
                """,
                            loopLabel)
            );

            sb.append(
                    String.format("""
                    %s:
                    """,
                            exitLabel)
            );

            return sb.toString();
        }
    }

    @Override
    public String visitWhileDo(InfixParser.WhileDoContext ctx) {
        {

            StringBuilder sb = new StringBuilder();
            String loopLabel = String.format("label_%d", labelCounter++);
            String exitLabel = String.format("label_%d", labelCounter++);

            sb.append(
                    String.format("""
                %s:
                """,
                            loopLabel)
            );

            sb.append(visit(ctx.expr()));

            sb.append(
                    String.format("""
                    PushImm     1
                    LogicalXor
                    JumpTrue    %s
                """,
                            exitLabel)
            );

            sb.append(visit(ctx.block()));

            sb.append(
                    String.format("""
                    Jump        %s
                """,
                            loopLabel)
            );

            sb.append(
                    String.format("""
                    %s:
                    """,
                            exitLabel)
            );

            return sb.toString();
        }
    }

    @Override
    public String visitRepeatUntil(InfixParser.RepeatUntilContext ctx) {
        return null;
    }

    @Override
    public String visitPrint(InfixParser.PrintContext ctx) {
        return null;
    }

    @Override
    public String visitSpace(InfixParser.SpaceContext ctx) {
        return null;
    }

    @Override
    public String visitNewline(InfixParser.NewlineContext ctx) {
        return null;
    }

    @Override
    public String visitSkip(InfixParser.SkipContext ctx) {
        return null;
    }

    @Override
    public String visitArgs(InfixParser.ArgsContext ctx) {
        return null;
    }

    @Override
    public String visitBinop(InfixParser.BinopContext ctx) {
        return null;
    }
}
