import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


//public class InfixTask1 {
//    public static void main(String[] args) throws Exception {
//
//        // Integer.parseInt("12345");
//        // Integer.parseInt(args[n]);
//
////    String valid1 = // test basic
////            """
////                    int main() {3}""";
////    args = new String[]{};
//
//    // create a CharStream that reads from standard input
//    //CharStream input = CharStreams.fromStream(System.in); // TODO uncomment when done
//    // CharStream input = CharStreams.fromString(valid1);
//    CharStream input = CharStreams.fromFileName("N:\\Documents\\Compilers\\246552\\task1\\src\\input.txt");
//    // create a lexer that feeds off of input CharStream
//    InfixLexer lexer = new InfixLexer(input);
//
//    // create a buffer of tokens pulled from the lexer
//    CommonTokenStream tokens = new CommonTokenStream(lexer);
//
//    // create a parser that feeds off the tokens buffer
//    InfixParser parser = new InfixParser(tokens);
//    InfixParser.ProgContext tree = parser.prog(); // begin parsing at pROG rule
//    //System.out.println(Tokens.size);
//    InfixChecker checker = new InfixChecker();
//    try {
//        checker.visit(tree);
//    } catch (InfixTypeException ex) {
//        System.out.println(ex.report());
//        return;
//    }
//
//    InfixInterpreter interpreter = new InfixInterpreter();
//    InfixTypes mainReturnValue = interpreter.visitProg(tree);
//
////    Integer mainReturnValue = interpreter.visitProgram(tree, args);
//    System.out.println("NORMAL_TERMINATION");
//    System.out.println(mainReturnValue);

import org.antlr.v4.runtime.*;

public class InfixTask1 {

    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from standard input
        CharStream input = CharStreams.fromStream(System.in);

        // create a lexer that feeds off of input CharStream

        InfixLexer lexer = new InfixLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        InfixParser parser = new InfixParser(tokens);
        InfixParser.ProgContext tree = parser.prog(); // begin parsing at prog rule

        InfixChecker checker = new InfixChecker();
        try {
            checker.visitProg(tree);
        } catch (InfixTypeException ex) {
            System.out.println(ex.report());
            return;
        }

        InfixInterpreter interpreter = new InfixInterpreter();
        Integer mainReturnValue = interpreter.visitProg(tree);
//        Integer mainReturnValue = interpreter.visitProgram(tree, args);
        System.out.println("NORMAL_TERMINATION");
        System.out.println(mainReturnValue);


    }





}
