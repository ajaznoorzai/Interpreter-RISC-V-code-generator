import java.util.ArrayList;
import java.util.HashMap;

class InterpreterStack {
    private final ArrayList<HashMap<String, Object>> stack = new ArrayList<>();

    public void push(HashMap<String, Object> vars) {
        stack.add(vars);
    }

    public HashMap<String, Object> pop() {
        return stack.remove(stack.size() - 1);

    }

    public Object get(String varName) {
        // We need to make sure get finds the top matching key
        // But this may mean looking into deeper layers

        HashMap<String, Object> layer = stack.get(stack.size() - 1);

        return layer.get(varName);
    }

    public void put(String varName, Object value) {
        System.out.println(varName);
        stack.get(stack.size() - 1).put(varName, value);
    }
    public int length()
    {
        return stack.size();
    }


}
