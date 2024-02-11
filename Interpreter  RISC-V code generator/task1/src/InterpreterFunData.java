import java.util.ArrayList;

public class InterpreterFunData {


    private final String name;
    private final InfixParser.BodyContext body;
    private final ArrayList<String> params;


    public InterpreterFunData(String name, InfixParser.BodyContext body, ArrayList<String> params) {
        this.name = name;
        this.body = body;
        this.params = params;
    }

    public InfixParser.BodyContext getBody() {
        return body;
    }

    public ArrayList<String> getParams() {
        return params;
    }

    public String getName() {
        return name;
    }

}
