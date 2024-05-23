package theme;

import java.util.HashMap;
import java.util.Map;

public class DataHelper {

    public static final int[] RANDOM_ARRAY_INT = {4, -100, 55, -1, 346, 2315, -5687, 4, 0, 0, 4};
    public static final int[] RANDOM_POSITIVE_ARRAY_INT = {3, 1, 2, 0, 8, 4, 1, 2, 5, 5};
    public static final int[] RANDOM_SORTED_ARRAY_INT = {1, 3, 5, 7, 9, 11};
    public static final String[] ARRAY_WITH_FRUITS = {"apple", "banana", "cherry", "orange", "mango", "strawberry"};

    public static final double[] RANDOM_ARRAY_MAX =
            {Math.random(), Math.random(), Math.random(), Math.random(),
                    Math.random(), Math.random(), Double.MAX_VALUE, Math.random()};

    public static final double[] RANDOM_ARRAY_MIN =
            {Math.random(), Math.random(), Double.MIN_VALUE, Math.random(),
                    Math.random(), Math.random(), Math.random(), Math.random()};

    public static final double[] RANDOM_ARRAY =
            {Math.random(), Math.random(), Math.random(), Math.random(),
                    Math.random(), Math.random(), Math.random(), Math.random()};


    public static Map<String, int[]> studentGrades() {
        var newMap = new HashMap<String, int[]>();
        newMap.put("Иван", new int[]{4, 2, 5, 5, 2, 5});
        newMap.put("Дарья", new int[]{2, 2, 3, 3, 2, 5});
        newMap.put("Артем", new int[]{4, 2, 3, 4, 4, 4});
        newMap.put("Анастасия", new int[]{4, 5, 5, 5, 5, 5});
        newMap.put("Мария", new int[]{4, 2, 2, 5, 2, 3});
        return newMap;
    }

    public static double calculateAverage() {
        double avg = 0;
        for (double v : RANDOM_ARRAY) {
            avg += v / RANDOM_ARRAY.length;
        }
        return avg;
    }

    public static int valueCount(int value) {
        var count = 0;
        for (int i : RANDOM_ARRAY_INT) {
            if (i == value) count++;
        }
        return count;
    }
}
