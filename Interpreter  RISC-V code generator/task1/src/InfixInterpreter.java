import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class InfixInterpreter extends InfixBaseVisitor<Integer> {
    private HashMap<String, InterpreterFunData> functions;
    private final InterpreterStack stack;
    String printOut;

    public InfixInterpreter() {
        this.functions = new HashMap<>();
        this.stack = new InterpreterStack();
        this.printOut = "";
    }


    @Override
    public Integer visitProg(InfixParser.ProgContext ctx) {
        for (int i = 0; i < ctx.dec().size(); i++) {
            InfixParser.DecContext thisFunc = ctx.dec(i);
            int argCount = thisFunc.vardec().IDFR().size();
            String funcName = thisFunc.IDFR().getText();  //names
            InfixParser.BodyContext funcBody = thisFunc.body(); // body
            ArrayList<String> funcParams = new ArrayList<>(); //Param names

            for (int j = 0; j < argCount; j++) {
                funcParams.add(thisFunc.vardec().IDFR(j).getText());
            }

            functions.put(funcName, new InterpreterFunData(funcName, funcBody, funcParams));
        }
        InterpreterFunData main = functions.get("main");  // to run the main first as it needs to rum first
        // We want to return whatever we get when we run the function called 'main'
        // This means we need to visits the body of main
        // First, as we're entering a function, push a new layer to the stack
        stack.push(new HashMap<>());
        int output = visitBody(main.getBody());
        return output;
        // return visitBody(ctx.body());
    }

    @Override
    public Integer visitDec(InfixParser.DecContext ctx) {
        return super.visitDec(ctx);
    }

    @Override
    public Integer visitVardec(InfixParser.VardecContext ctx) {
        return super.visitVardec(ctx);
    }

    @Override
    public Integer visitBody(InfixParser.BodyContext ctx) {
        //  if (ctx.localvar != null)
//        {
        for (int i = 0; i < ctx.localvar.size(); i++) {   // which will
            stack.put(ctx.localvar.get(i).getText(), visit(ctx.localvarexpr.get(i)));
        }
//        }
        return visitEne(ctx.ene());
    }

    @Override
    public Integer visitBlock(InfixParser.BlockContext ctx) {
        return super.visitBlock(ctx);
    }

    @Override
    public Integer visitEne(InfixParser.EneContext ctx) {

        Iterator<InfixParser.ExprContext> lastVal = ctx.expr().iterator();
        InfixParser.ExprContext expr = lastVal.next();

        while (lastVal.hasNext()) {         //iter through each expr in the ene
            visit(expr);                    //reurns he value last exp
            expr = lastVal.next();
        }
        return visit(expr);
    }

    @Override
    public Integer visitIdentifiers(InfixParser.IdentifiersContext ctx) {
        return (int) stack.get(ctx.getText());
    }

    @Override
    public Integer visitIntegers(InfixParser.IntegersContext ctx) {
        int value = Integer.parseInt(ctx.getText());
        return value;

    }

    @Override
    public Integer visitBOOLEAN(InfixParser.BOOLEANContext ctx) {


        if (ctx.getText().equals("true")) {                        // todo
            return (1);
        }

        return (0);
    }

    @Override
    public Integer visitAssignExpr(InfixParser.AssignExprContext ctx) {

        String varName = ctx.IDFR().getText();
        Integer expr = visit(ctx.expr());

        stack.put(varName, expr);
        return super.visitAssignExpr(ctx);
    }

    @Override
    public Integer visitBinOpExpr(InfixParser.BinOpExprContext ctx) {

        Integer oprnd1 = visit(ctx.expr(0));
        Integer oprnd2 = visit(ctx.expr(1));
        // boolean b1 = visit(ctx.expr("true"));

        switch (((TerminalNode) (ctx.binop().getChild(0))).getSymbol().getType()) {

            case InfixParser.LessEq -> {

                return oprnd1 <= oprnd2 ? 1 : 0;

            }
            case InfixParser.MoreEq -> {

                return oprnd1 >= oprnd2 ? 1 : 0;

            }

            case InfixParser.Plus -> {

                return oprnd1 + oprnd2;

            }

            case InfixParser.Times -> {

                return oprnd1 * oprnd2;
            }
            case InfixParser.LogicalOr -> {

                return oprnd1 == 1 ? 1 : oprnd2 == 1 ? 1 : 0;
            }
            case InfixParser.More -> {

                return ((oprnd1 > oprnd2) ? 1 : 0);

            }
            case InfixParser.Less -> {

                return ((oprnd1 < oprnd2) ? 1 : 0);
            }

            case InfixParser.Quality -> {

                return ((oprnd1.equals(oprnd2)) ? 1 : 0);
            }
            case InfixParser.Minus -> {

                return oprnd1 - oprnd2;

            }
            case InfixParser.And -> {

                return oprnd1 == 1 && oprnd2 == 1 ? 1 : 0;

            }

            case InfixParser.Divide -> {

                return oprnd1 / oprnd2;                     // todo
            }                                         // the rest

            case InfixParser.Xor -> {

                return oprnd1 == 1 && oprnd2 == 0 || oprnd1 == 0 && oprnd2 == 1 ? 1 : 0;

            }
            default -> {
                throw new RuntimeException("Shouldn't be here - wrong binary operator.");
            }

        }
//        Integer operand1 = (Integer) visit(ctx.expr(0));
//        Integer operand2 = (Integer) visit(ctx.expr(1));
//        //get the middle expression
//        Object operation = (ctx.getText());
//
//        if (operation == "+") {
//            return (operand1 + operand2);
//        }
//        if (operation == "-") {
//            return (operand1 - operand2);
//        }
//        if (operation == "*") {
//            return (operand1 * operand2);
//        }
//        if (operation == "/") {
//            return (operand1 / operand2);
//        }
//        if (operation == "<") {
//            return ((operand1 < operand2)? 1 : 0);
//        }
//        if (operation == ">") {
//            return ((operand1 > operand2)? 1 : 0);
//        }
//        if (operation == "<=") {
//            return ((operand1 <= operand2)? 1 : 0);
//        }
//        if (operation == ">=") {
//            return ((operand1 >= operand2)? 1 : 0);
//        }
//        if (operation == "==") {
//            return (Objects.equals(operand1, operand2));
//        }
//        if (operation == "|") {
//            return (operand1 | operand2);
//        }
//        if (operation == "&") {
//            return (operand1 & operand2);
//        }
//        if (operation == "^") {
//            return (operand1 ^ operand2);
//        }
//        else {
//            throw new InfixTypeException().arithmeticError();
//        }
         }



        @Override
        public Integer visitIDFRargs (InfixParser.IDFRargsContext ctx){
            ArrayList<String> Params = functions.get(ctx.IDFR().getText()).getParams();  // this will get the params for func calls
            // We're about to enter a new scope
            // so PUSH a new layer
            stack.push(new HashMap<>());
            for (int i = 0; i < Params.size(); i++) {
                stack.put(Params.get(i), visit(ctx.args().expr(i)));     // put the params to vars
            }
            Integer returnValue = visitBody(functions.get(ctx.IDFR().getText()).getBody());

            stack.pop();
            // visitBODY(functions.get(ctx.IDFR()).getBody());   // it will return the value in the funcs
            return returnValue;                                                           //todo
        }

        @Override
        public Integer visitEXPRBlock (InfixParser.EXPRBlockContext ctx){                       // todo
            return super.visitEXPRBlock(ctx);
        }

        @Override
        public Integer visitIFThenElse (InfixParser.IFThenElseContext ctx){
            //Integer (Boolean) conditionMet = visit(ctx.expr());

            if (visit(ctx.expr()).equals(1)) {
                return visit(ctx.block(0));


            } else {
                return visitBlock(ctx.block(1));
            }

        }

        @Override
        public Integer visitWhileDo (InfixParser.WhileDoContext ctx){
            // InfixParser.ExprContext condition = ctx.expr();
            InfixParser.BlockContext block = ctx.block();

            while (!visit(ctx.expr()).equals(1)) {
                return visit(ctx.block());

            }
            return null;
        }

        @Override
        public Integer visitRepeatUntil (InfixParser.RepeatUntilContext ctx){


            visit(ctx.block());
            while (!visit(ctx.expr()).equals(1)) {

                visit(ctx.block());

            }
            return 0;
        }

        @Override
        public Integer visitPrint (InfixParser.PrintContext ctx) {
            Integer outPut = visit(ctx.expr());


            if (ctx.expr().getText().equals("space")) {
                printOut = printOut.concat(" ");
            } else if (ctx.expr().getText().equals("newline")) {

            } else {
                printOut = printOut.concat(outPut.toString());
            }

     //    else{                                                 //todo
                printOut = printOut.concat("\n");

                int sNumber = Integer.parseInt("12345");

                return 0;


            }

       // }           //todo

            public void runMain (String[]raw){

                InterpreterFunData main = functions.get("main");
         //       int output = main.run(evaluateArgs(rawArgs)).getValue();


                if (!printOut.isEmpty()) {
                    System.out.println(printOut);
                }

             //   System.out.println("\nNORMAL_TERMINATION\n" + output);
            }


            @Override
            public Integer visitSpace (InfixParser.SpaceContext ctx){
                return super.visitSpace(ctx);
            }

            @Override
            public Integer visitNewline (InfixParser.NewlineContext ctx){
                return super.visitNewline(ctx);
            }

            @Override
            public Integer visitSkip (InfixParser.SkipContext ctx){
                return super.visitSkip(ctx);
            }

            @Override
            public Integer visitArgs (InfixParser.ArgsContext ctx){
                return super.visitArgs(ctx);
            }

            @Override
            public Integer visitBinop (InfixParser.BinopContext ctx){
                return super.visitBinop(ctx);
            }
}
