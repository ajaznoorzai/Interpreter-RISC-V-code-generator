
public class InfixTypeException extends RuntimeException {

    private String msg;

    public InfixTypeException() {
        super();
    }

    // Error information is to be determined separately on a case-by-case basis (see below).
    public InfixTypeException(String errmsg)
    {
        msg = errmsg;
    }

    // A method to generate a report of the error as a string.
    public String report() {
        return msg;
    }

    // A method to produce an exception for the 'no main function' error.
    public InfixTypeException noMainFuncError() {
        msg = "No main function defined";
        return this;
    }

    // A method to produce an exception for errors regarding main's return type
    public InfixTypeException mainReturnTypeError() {
        msg = "Wrong return type declared for main function";
        return this;
    }

    // A method to produce an exception for duplicated function names
    public InfixTypeException duplicatedFuncError() {
        msg = "Duplicated function names";
        return this;
    }

    // A method to produce an exception for duplicated parameter or local variable names
    public InfixTypeException duplicatedVarError() {
        msg = "Duplicated variable names";
        return this;
    }

    // A method to produce an exception for parameter or local variable names that clashes with function names
    public InfixTypeException clashedVarError() {
        msg = "A variable name clashed with a function name";
        return this;
    }

    // A method to produce an exception for parameters or local variables of 'unit' type.
    public InfixTypeException unitVarError() {
        msg = "Variable of unit type";
        return this;
    }

    // A method to produce an exception for undefined function name
    public InfixTypeException undefinedFuncError() {
        msg = "Unknown function name";
        return this;
    }

    // A method to produce an exception for undefined parameter or local variable name
    public InfixTypeException undefinedVarError() {
        msg = "Unknown variable name";
        return this;
    }

    // A method to produce an exception related to mis-typed comparisons of integer values
    public InfixTypeException comparisonError() {
        msg = "Invalid operand in integer comparison";
        return this;
    }

    // A method to produce an exception related to mis-typed arithmetic expressions
    public InfixTypeException arithmeticError() {
        msg = "Invalid operand in arithmetic expression";
        return this;
    }

    // A method to produce an exception related to mis-typed Boolean expressions
    public InfixTypeException logicalError() {
        msg = "Invalid operand in Boolean expression";
        return this;
    }

    // A method to produce an exception for 'if' statements, in which
    // the 'then' branch and the 'else' branch have different types.
    public InfixTypeException branchMismatchError() {
        msg = "Mismatched expression types in if expression";
        return this;
    }

    // A method to produce an exception for if/loop conditions which are not of type bool.
    public InfixTypeException conditionError() {
        msg = "Invalid condition in if expression or loop";
        return this;
    }

    // A method to produce an exception related to expressions in loop body.
    public InfixTypeException loopBodyError() {
        msg = "Invalid last expression type in loop body";
        return this;
    }

    // TODO
    // A method to produce an exception for errors regarding function's return type.
    public InfixTypeException functionBodyError() {
        msg = "Invalid return value type";
        return this;
    }

    // TODO
    // A method to produce an exception related to assignment.
    public InfixTypeException assignmentError() {
        msg = "Incompatible types in assignment";
        return this;
    }

    // A method to produce an exception related to argument list mismatches.
    public InfixTypeException argumentNumberError() {
        msg = "Invalid # of arguments in invocation";
        return this;
    }

    // A method to produce an exception related to argument type mismatches.
    public InfixTypeException argumentError() {
        msg = "Invalid argument type in invocation";
        return this;
    }

    // A method to produce an exception related to print (expression not an int, space, or newline).
    public InfixTypeException printError() {
        msg = "Invalid expression for print";
        return this;
    }

}
