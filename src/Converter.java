import java.util.HashMap;
import java.util.Map;


public class Converter {
    public static Map<String, Integer> map = new HashMap<>();

    public static void initialize() {
        map.put("I", 1);
        map.put("II", 2);
        map.put("III", 3);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("VI", 6);
        map.put("VII", 7);
        map.put("VIII", 8);
        map.put("IX", 9);
        map.put("X", 10);
    }

    public static int convert(String romeNumber) {
        return map.get(romeNumber);
    }
}