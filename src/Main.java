import java.util.HashMap;

public class Main {
    public static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        addToMap("str1", 2);
        System.out.println(map);
        addToMap("str2", 1);
        System.out.println(map);
        addToMap("str1", 2);
        System.out.println(map);
        addToMap("str1", 5);
        System.out.println(map);
    }

    public static void addToMap(String key, Integer value) {
        if (!map.containsKey(key)) {
            map.put(key, value);
        } else if (map.get(key).equals(value)) {
            System.out.println("Такая пара КЛЮЧ-ЗНАЧЕНИЕ существует!");
        } else {
            map.replace(key, value);
        }
    }
}
