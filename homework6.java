import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class homework6 {
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    public static void printBook(Map<String, ArrayList<Integer>> map) {
        for (var item : map.entrySet()) {
            String phones = "";
            for (int el : item.getValue()) {
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Попов", 890921234, bookPhone);
        addNumber("Иванов", 891023255, bookPhone);
        addNumber("Кучин", 890913213, bookPhone);
        addNumber("Петров", 891256712, bookPhone);
        addNumber("Петров", 895647723, bookPhone);
        addNumber("Кучин", 891189821, bookPhone);
        addNumber("Иванов", 891023231, bookPhone);
        addNumber("Ковров", 899910120, bookPhone);
        printBook(bookPhone);
    }
}

