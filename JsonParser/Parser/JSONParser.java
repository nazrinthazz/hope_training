package JsonParser.Parser;

import java.util.*;

public class JSONParser {

    public static Map<String, String> parse(String json) {
        Map<String, String> map = new HashMap<>();

        if (json == null || !json.startsWith("{") || !json.endsWith("}")) {
            throw new RuntimeException("Invalid JSON format");
        }
        json = json.trim();
        if (json.length() <= 2) {
            return map;
        }
        json = json.substring(1, json.length() - 1);
        String[] pairs = json.split(",");

        for (String pair : pairs) {
            String[] kv = pair.split(":", 2);
            if (kv.length != 2) {
                throw new RuntimeException("Invalid key-value pair: " + pair);
            }
            String key = kv[0].replace("\"", "").trim();
            String value = kv[1].replace("\"", "").trim();
            map.put(key, value);
        }

       return map;
    }
}
