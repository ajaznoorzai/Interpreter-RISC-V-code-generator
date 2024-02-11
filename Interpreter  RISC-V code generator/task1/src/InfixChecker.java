import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;


public class InfixChecker extends AbstractParseTreeVisitor<InfixTypes> implements InfixVisitor<InfixTypes> {

    private final Map<String,InfixTypes> localocalvar = new HashMap<>();
    private final Map<String, InfixTypes> mains = new HashMap<>();
    private final Map<String, InfixTypes> paramForFuc = new HashMap<>();
    private final Map<String, InfixTypes> Vars = new HashMap<>();
    private final Map<String, InfixTypes> checkVars = new HashMap<>();



    public InfixTypes convertType(TerminalNode type) {
        if (type.getText().equals("BOOL")) {
            return InfixTypes.BOOL;
        }
        // if return int

        if(type.getText().equals("int")){
            return InfixTypes.INT;
        }
        return InfixTypes.UNIT;
    }
    @Override
    public InfixTypes visitProg(InfixParser.ProgContext ctx) {
        //Checks if it returns int
//        //                Converter.convert(ctx.dEC(i).TYPE().getText()))
//
//
//        //for (int i = 0; i < ctx.aRGS().IDFR().size(); ++i)
//        boolean foundMain = false;
//        for (int i = 0; i < ctx.dec().size(); i++) {
//            if (localocalvar.containsKey(ctx.dec(i).IDFR().getText())) {
//                throw new InfixTypeException().duplicatedVarError();
//            } else if (ctx.dec(i).TYPE().getText().equals("int")) {
//                localocalvar.put(ctx.dec(i).IDFR().getText(), InfixTypes.INT);
//
//
//            } else if (localocalvar.containsKey(ctx.dec(i).IDFR().getText())) {
//                throw new InfixTypeException().duplicatedVarError();
//            } else if (ctx.dec(i).TYPE().getText().equals("bool")) {
//                localocalvar.put(ctx.dec(i).IDFR().getText(), InfixTypes.BOOL);
//
//
//            } else if (localocalvar.containsKey(ctx.dec(i).IDFR().getText())) {
//                throw new InfixTypeException().duplicatedVarError();
//            } else if (ctx.dec(i).TYPE().getText().equals("unit")) {
//                localocalvar.put(ctx.dec(i).IDFR().getText(), InfixTypes.UNIT);
//            }
//        }
//        for (int i = 0; i < localocalvar.size(); i++) {
//            if (!localocalvar.containsKey("main")) {
//                throw new InfixTypeException().noMainFuncError();
//            } else if (localocalvar.get("main") != InfixTypes.INT) {
//                throw new InfixTypeException().mainReturnTypeError();
//            }
//
//
//        }
//
//        return null;
//        //visitDEC(ctx.dEC());
//    }




//      //Checks if there is any duplications of value names in the program as well as checks if the program has a main method
        for (int i = 0; i < ctx.dec().size(); i++) {
        if (!mains.containsKey(ctx.dec(i).IDFR().getText())) {//checks if there is already an int function name in mains the hashMap
            if (ctx.dec(i).type().getText().equals("int")) {
                mains.put(ctx.dec(i).IDFR().getText(), InfixTypes.INT);
            } else if (mains.containsKey(ctx.dec(i).IDFR().getText())) {
                throw new InfixTypeException().duplicatedFuncError();
            } else if (ctx.dec(i).type().getText().equals("bool")) {//checks if there is already a bool function name in the mains hashMap
                mains.put(ctx.dec(i).IDFR().getText(), InfixTypes.BOOL);
            } else if (mains.containsKey(ctx.dec(i).IDFR().getText())) {
                throw new InfixTypeException().duplicatedFuncError();
            } else if (ctx.dec(i).type().getText().equals("unit")) {//Checks if there is already a unit function name in the mains hashMap
                mains.put(ctx.dec(i).IDFR().getText(), InfixTypes.UNIT);
            }
        } else {
            throw new InfixTypeException().duplicatedFuncError();

        }


    }
        //Checks if there is a main method and return type of the main method
        for (int i = 0; i < mains.size(); i++) {
            if (!mains.containsKey("main")) {//checks if the mainFunction has an IDFR main
                throw new InfixTypeException().noMainFuncError();
            } else if (mains.get("main") != InfixTypes.INT) {//if the hashMap mainFunction has IDFR "main" checks that its return type is "int" if not throws Exception
                throw new InfixTypeException().mainReturnTypeError();
            }
        }


    //Adds the parameters to a hash map
        for (int j = 0; j < ctx.dec().size(); j++) {

        //Checks already if there is any duplicate name existing in the hash map
        for (int i = 0;ctx.dec(i) != null && i < ctx.dec(i).depth(); i++) {
            if (ctx.dec(i).vardec().IDFR(j) != null) {

                if (!paramForFuc.containsKey(ctx.dec(i).vardec().IDFR(j).getText())) {//checks if already the parameterr is in the ParamForHashMap
                    //If there is an int it adds it to the hashmap with a IDFR string and return type INT
                    if (ctx.dec(i).vardec().type(j).getText().equals("int")) {
                        paramForFuc.put(ctx.dec(i).vardec().IDFR(j).getText(), InfixTypes.INT);
                    } else if (paramForFuc.containsKey(ctx.dec(i).vardec().IDFR(j).getText())) {
                        throw new InfixTypeException().duplicatedVarError();
                        //If there is an bool it adds it to the hashmap with a IDFR string and return type boolean
                    } else if (ctx.dec(i).vardec().type(j).getText().equals("boolean")) {
                        paramForFuc.put(ctx.dec(i).vardec().IDFR(j).getText(), InfixTypes.INT);
                    } else if (ctx.dec(i).vardec().type(j).getText().equals("unit")) {
                        throw new InfixTypeException().unitVarError();
                    }
                } else {
                    throw new InfixTypeException().duplicatedVarError
                            ();
                }
                if (paramForFuc.containsKey("<missing IDFR>")) {
                    throw new InfixTypeException().unitVarError();
                }
            }
        }

    }

    //Checks for local variables in dec body and adds them to the local variable hashmap
        for (int i = 0; i < ctx.dec().size(); i++) {//loops through the dec
        for (int j = 0; j < ctx.dec(i).body().localvar.size(); ++j) {//loops through each dec,body and localvar size
            if (!localocalvar.containsKey(ctx.dec(i).body().IDFR(j).getText())) {//checks if the localvar IDFR is already in the localocalvar hashMap
                if (ctx.dec(i).body().type(j).getText().equals("int")) {//if the localvar is of a type "int" it adds the IDFR to the localocalvar hashMap with return type int
                    if (mains.containsKey(ctx.dec(i).body().localvar.get(j).getText())) {//checks if the IDFR of in is already in the localocalvar hashMap if yeah return Exception clash
                        throw new InfixTypeException().clashedVarError();
                    } else {
                        localocalvar.put(ctx.dec(i).body().localvar.get(j).getText(), InfixTypes.INT);//if not it adds it to the hashMap
                    }
                } else if (ctx.dec(i).body().type(j).getText().equals("bool")) {//if the localvar is of a type "bool" it adds the IDFR to the localocalvar hashMap with return type int
                    if (mains.containsKey(ctx.dec(i).body().localvar.get(j).getText())) {
                        throw new InfixTypeException().clashedVarError();//checks if the IDFR of in is already in the localocalvar hashMap if yeah return Exception clash
                    } else {
                        localocalvar.put(ctx.dec(i).body().localvar.get(j).getText(), InfixTypes.BOOL);//if not it adds it to the hashMap
                    }
                } else if (ctx.dec(i).body().type(j).getText().equals("unit")) {//if the localvar is of a type "unti" it returns unitException
                    throw new InfixTypeException().unitVarError();
                }
            } else {
                throw new InfixTypeException().duplicatedVarError();
            }
        }


    }


    InfixTypes vDec = null;
        for (int i = 0; i < ctx.dec().size(); i++) {//Loop through the dec size, and visits  each dec in the program
        vDec = visitDec(ctx.dec(i));
    }
        return vDec;
}


    @Override
    public InfixTypes visitDec(InfixParser.DecContext ctx) {


//
////        InfixTypes returnType = convertType(ctx.type());  //int bool unit
//        String idfr = ctx.IDFR().getText();
//
//        if(!localocalvar.containsKey(idfr)){
//            throw new InfixTypeException().undefinedFuncError();
//        }
//
////        if()
//
//        if(localocalvar.containsKey(idfr)){
//            throw new InfixTypeException().duplicatedVarError();
//        }
//        localocalvar.put(idfr, InfixTypes);
//
//        visitVardec(ctx.vardec());
//        InfixTypes body = visitBody(ctx.body());
//        if(body != InfixTypes){throw new InfixTypeException().functionBodyError(); }
//
//        return returnType;
//
//


        for (int i = 0; i < ctx.depth(); i++) {
        }
        return visitBody(ctx.body());


    }




    @Override
    public InfixTypes visitVardec(InfixParser.VardecContext ctx) {
        return null;
    }

    @Override
    public InfixTypes visitBody(InfixParser.BodyContext ctx) {



        for (int i = 0; i < ctx.localvar.size(); ++i) {
            InfixTypes expType = visit(ctx.localvarexpr.get(i));
            if (expType != InfixTypes.INT) {
                throw new InfixTypeException().assignmentError(); // assignerror
            }
            if (localocalvar.containsKey(ctx.localvar.get(i).getText())) {
                throw new InfixTypeException().duplicatedVarError();
            }
            localocalvar.put(ctx.localvar.get(i).getText(), InfixTypes.INT);
        }

        InfixTypes returnType = InfixTypes.UNIT;
        for (int i = 0; i < ctx.ene().expr().size(); ++i) {
            InfixParser.ExprContext expr = ctx.ene().expr().get(i);
            returnType = visit(expr);
        }
        return returnType;
    }

    @Override
    public InfixTypes visitBlock(InfixParser.BlockContext ctx) {
        for (int i = 0; i < ctx. ene().expr().size(); ++i) {
            visit(ctx.ene().expr(i));
        }
        return null;
    }

    @Override
    public InfixTypes visitEne(InfixParser.EneContext ctx) {

        int finalExpr = ctx.expr().size() - 1;
        for (int i = 0; i < finalExpr; i++){
            visit(ctx.expr(i));
        }
        return visit(ctx.expr(finalExpr));

    }

    @Override
    public InfixTypes visitIdentifiers(InfixParser.IdentifiersContext ctx) {
//        if (!localocalvar.containsKey(ctx.IDFR().getText())) {
//            throw new InfixTypeException().undefinedVarError();
//        }
//        return InfixTypes.INT;


        String vName = ctx.getText();

        Vars.putAll(localocalvar);
        Vars.putAll(paramForFuc);
        Vars.putAll(mains);

        checkVars.putAll(localocalvar);
        checkVars.putAll(paramForFuc);

        if (!Vars.containsKey(vName)) {
            System.out.println("VName");
            throw new InfixTypeException().undefinedVarError();
        }
//        if (!checkVars.containsKey(vName)){
//            System.out.println("vName Checker");
//            throw new InfixTypeException().unitVarError();
//        }


        return InfixTypes.INT;



//        return InfixTypes.UKNOWN;return null;
    }

    @Override
    public InfixTypes visitType(InfixParser.TypeContext ctx) {
        return null;
    }

    @Override
    public InfixTypes visitIntegers(InfixParser.IntegersContext ctx) {

        return InfixTypes.INT;
    }

    @Override
    public InfixTypes visitBOOLEAN(InfixParser.BOOLEANContext ctx) {
        return InfixTypes.BOOL;
    }

    @Override
    public InfixTypes visitAssignExpr(InfixParser.AssignExprContext ctx) {
//        if (!localocalvar.containsKey(ctx.IDFR().getText())) {
//            throw new InfixTypeException().undefinedVarError();
//        }
//        if (visit(ctx.expr()) != InfixTypes.INT) {
//            throw new InfixTypeException().assignmentError();
//        }
//        return InfixTypes.UNIT;   // Doesn't matter
//        //return null;


        String varName = ctx.IDFR().getText();
        InfixTypes rightExpr = visit(ctx.expr());
        if (Vars.get(varName) != rightExpr){
            throw new InfixTypeException().assignmentError();
        }
        if (!checkVars.containsKey(varName)){
            throw new InfixTypeException().undefinedVarError();
        }
        return InfixTypes.UNIT;
    }


    @Override
    public InfixTypes visitBinOpExpr(InfixParser.BinOpExprContext ctx) {

//
//        InfixTypes operand1Type = visit(ctx.expr(0));
//        InfixTypes operand2Type = visit(ctx.expr(1));
//
//       return switch (((TerminalNode) (ctx.binop().getChild(0))).getSymbol().getType()) {
//
//           case InfixParser.MoreEq, InfixParser.Quality, InfixParser.LessEq -> {
//
//                if (operand1Type != InfixTypes.INT || operand2Type != InfixTypes.INT ||operand1Type == InfixTypes.INT) {
//                    throw new InfixTypeException().comparisonError();       //incompatibleOperandsError
//                }
//                yield InfixTypes.BOOL;
//
//            }
//
//            case InfixParser.Plus, InfixParser.Divide, InfixParser.Times, InfixParser.Minus -> {
//
//                if (operand1Type != InfixTypes.INT || operand2Type != InfixTypes.INT) {
//                    throw new InfixTypeException().arithmeticError();
//                }
//                yield InfixTypes.INT;
//
//            }
//
//            case InfixParser.And, InfixParser.Xor -> {
//
//                if (operand1Type != InfixTypes.BOOL || operand2Type != InfixTypes.BOOL) {
//                    throw new InfixTypeException().logicalError();
//                }
//                yield InfixTypes.BOOL;
//
//            }
//
//            default -> {
//                System.out.println((((TerminalNode) (ctx.binop().getChild(0))).getSymbol().getText()));
//                throw new RuntimeException("Shouldn't be here - wrong binary operator.");
//            }
//
//        };



        InfixTypes finalType = null;//makes a return type null
        if (ctx.binop().getText().equals("+")
                || ctx.binop().getText().equals("-")
                || ctx.binop().getText().equals("*")
                || ctx.binop().getText().equals("/")) {
            if (visit(ctx.expr(0)) != InfixTypes.INT || visit(ctx.expr(1)) != InfixTypes.INT) {//checks if the first or second expr are of return int
                if (visit(ctx.expr(0)) == InfixTypes.BOOL && visit(ctx.expr(1)) == InfixTypes.BOOL) {
                    throw new InfixTypeException().logicalError();//return exception is they are the same return type
                }
                throw new InfixTypeException().arithmeticError();
            } else finalType = InfixTypes.INT;
        } else if (ctx.binop().getText().equals("==")//checks each IDFR what its BINOP
                || ctx.binop().getText().equals("<")
                || ctx.binop().getText().equals(">")
                || ctx.binop().getText().equals("<=")) {
            if (visit(ctx.expr(0)) != InfixTypes.INT || visit(ctx.expr(1)) != InfixTypes.INT) {//checks if the first or second expr are of return int
                if (visit(ctx.expr(0)) == InfixTypes.BOOL && visit(ctx.expr(1)) == InfixTypes.BOOL) {
                }
//                throw new TypeException().comparisonError();
            } else finalType = InfixTypes.BOOL;
        } else if (ctx.binop().getText().equals("&")//checks each IDFR what its BINOP
                || ctx.binop().getText().equals("|")
                || ctx.binop().getText().equals("&")) {
            if (visit(ctx.expr(0)) != InfixTypes.BOOL || visit(ctx.expr(1)) != InfixTypes.BOOL) {//checks if the first or second expr are of return int
                if (visit(ctx.expr(0)) == InfixTypes.INT && visit(ctx.expr(1)) == InfixTypes.INT) {//Checks if the first and second are of return BOOL
                    throw new InfixTypeException().arithmeticError();
                }
                throw new InfixTypeException().logicalError();
            } else finalType = InfixTypes.BOOL;
        }
        return finalType = InfixTypes.BOOL;
    }

    @Override
    public InfixTypes visitIDFRargs(InfixParser.IDFRargsContext ctx) {
        String funcIDFR = ctx.IDFR().getText();
        if (!mains.containsKey(funcIDFR)){
            throw new InfixTypeException().undefinedFuncError();
        }
        return visitArgs(ctx.args());

    }

    @Override
    public InfixTypes visitEXPRBlock(InfixParser.EXPRBlockContext ctx) {
        return visit(ctx.block());
    }

    @Override
    public InfixTypes visitIFThenElse(InfixParser.IFThenElseContext ctx) {
        if(!visit(ctx.expr()).equals(InfixTypes.BOOL)) {
            throw new InfixTypeException().conditionError();

        }
        if(!visit(ctx.block(0)).equals(visit(ctx.block(1)))) {
            throw new InfixTypeException().branchMismatchError();
        }

        return visit(ctx.block(0));
}

    @Override
    public InfixTypes visitWhileDo(InfixParser.WhileDoContext ctx) {
        if (visit(ctx.expr()) != InfixTypes.BOOL) {
            throw new InfixTypeException().conditionError();
        }

        if  (visit(ctx.block()) != InfixTypes.UNIT) {

            throw new InfixTypeException().loopBodyError();

        }

        return InfixTypes.UNIT;
    }

    @Override
    public InfixTypes visitRepeatUntil(InfixParser.RepeatUntilContext ctx) {



        if  (visit(ctx.block()) != InfixTypes.UNIT) {

            throw new InfixTypeException().loopBodyError();
        }
        if (visit(ctx.expr()) != InfixTypes.BOOL) {
            throw new InfixTypeException().conditionError();
        }
        return InfixTypes.UNIT;                                    // in UNKNOWN

    }

    @Override
    public InfixTypes visitPrint(InfixParser.PrintContext ctx) {
        if (visit(ctx.expr()) == null){
            return null;
        }
        if (visit(ctx.expr()).equals(InfixTypes.INT)||ctx.expr().getText().equals("space")||ctx.expr().getText().equals("newline")) {
            return InfixTypes.UNIT;
        }
        throw new InfixTypeException().printError();

    }

    @Override
    public InfixTypes visitSpace(InfixParser.SpaceContext ctx) {
        return InfixTypes.UNIT;
    }


    @Override
    public InfixTypes visitNewline(InfixParser.NewlineContext ctx) {
        return  InfixTypes.UNIT;
    }

    @Override
    public InfixTypes visitSkip(InfixParser.SkipContext ctx) {
        return InfixTypes.UNIT;
    }

    @Override
    public InfixTypes visitArgs(InfixParser.ArgsContext ctx) {
        return null;
    }

    @Override
    public InfixTypes visitBinop(InfixParser.BinopContext ctx) {
        return null;
    }

}