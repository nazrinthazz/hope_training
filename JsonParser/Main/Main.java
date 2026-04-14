package JsonParser.Main;
import JsonParser.Parser.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String json = "{\"name\":\"Alice\",\"age\":20,\"isStudent\":true}";
        Map<String, String> result = JSONParser.parse(json);
        for (String key : result.keySet()) {
            System.out.println(key + " : " + result.get(key));
        }
    }
}
