import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(1, "Apple");
        m.put(2, "Banana");
        m.put(3, "Mango");

        System.out.println("Map elements:");
        for (var entry : m.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
