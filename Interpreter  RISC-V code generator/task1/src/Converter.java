import java.util.HashMap;
import java.util.Map;

public abstract class Converter {

    private static Map<String, InfixTypes> Utils = new HashMap<>(){{


        for( var type : InfixTypes.values()){

            put(type.name(), type);

        }



    }};

    public static InfixTypes convert(String in){
        return Utils.get(in.toUpperCase());
    }

}
