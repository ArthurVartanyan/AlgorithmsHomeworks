package theme.eight;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Tree {

    // Задание 2
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(4, "Ангелы и демоны");
        map.put(2, "Вишневый сад");
        map.put(3, "Тень воина");
        map.put(5, "Преступление и наказание");
        map.put(1, "Маша и медведь");

        var result = getBooksWithNumber(map);
        System.out.println(result);
    }

    public static Map<String, Integer> getBooksWithNumber(Map<Integer, String> source) {
        return source.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
    }
}
