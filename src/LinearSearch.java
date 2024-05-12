import java.util.HashMap;
import java.util.Map;

public class LinearSearch {
    public static void main(String[] args) {
        var name = findStudentMaxGrade(DataHelper.studentGrades());
        if (!name.equalsIgnoreCase("Анастасия"))
            throw new RuntimeException("Задание findStudentMaxGrade реализовано неверно!");
        else System.out.println("Задание findStudentMaxGrade реализовано верно!");

        var maxValue = findMaxValue(DataHelper.RANDOM_ARRAY_MAX);
        if (Double.MAX_VALUE != maxValue)
            throw new RuntimeException("Задание findMaxValue реализовано неверно!");
        else System.out.println("Задание findMaxValue реализовано верно!");

        var minValue = findMinValue(DataHelper.RANDOM_ARRAY_MIN);
        if (Double.MIN_VALUE != minValue)
            throw new RuntimeException("Задание findMinValue реализовано неверно!");
        else System.out.println("Задание findMinValue реализовано верно!");

        var avgValue = findAverageValue(DataHelper.RANDOM_ARRAY);
        if (DataHelper.calculateAverage() != avgValue)
            throw new RuntimeException("Задание findAverageValue реализовано неверно!");
        else System.out.println("Задание findAverageValue реализовано верно!");

        var arrayWithoutRemoveValue = removeElement(DataHelper.RANDOM_ARRAY_INT, 4);
        if (DataHelper.valueCount(4) != 0 && arrayWithoutRemoveValue.length != 8)
            throw new RuntimeException("Задание removeElement реализовано неверно!");
        else System.out.println("Задание removeElement реализовано верно!");
    }


    /**
     * Задание #1.
     * Дан массив из случайных дробных чисел. Необходимо найти минимальное значение и вернуть его в return.
     *
     * @param array - double массив рандомых значений
     * @return - минмальное значение в массиве
     */
    public static double findMinValue(double[] array) {
        double min = array[0];
        for (double v : array) {
            if (min > v)
                min = v;
        }
        return min;
    }


    /**
     * Задание #2.
     * Дан массив из случайных дробных чисел. Необходимо найти максимальное значение и вернуть его в return.
     *
     * @param array - double массив рандомых значений
     * @return - максимальное значение в массиве
     */
    public static double findMaxValue(double[] array) {
        double max = array[0];
        for (double v : array) {
            if (max < v)
                max = v;
        }
        return max;
    }


    /**
     * Задание #3.
     * Дан массив из случайных дробных чисел. Необходимо найти максимальное значение и вернуть его в return.
     *
     * @param array - double массив рандомых значений
     * @return - максимальное значение в массиве
     */
    public static double findAverageValue(double[] array) {
        double avg = 0;
        for (double v : array) {
            avg += v / array.length;
        }
        return avg;
    }


    /**
     * Задание #4.
     * Вам на вод дается MAP, где ключ - это имя студента, а значение - массив его оценок за год.
     * Необходимо вычислить среднюю оценку каждого студента за год и вернуть в return имя самого успешного.
     * Если попадется сразу два одиннаково успешных студента, вернуть любого из них.
     *
     * @param studentGrades - студенты со своими оценками - Имя: массив оценок. Пример: "Даниил": {4, 4, 3, 5, 4}
     * @return - имя студента, у которога самый высокий средний бал
     */
    public static String findStudentMaxGrade(Map<String, int[]> studentGrades) {
        var nameAverage = new HashMap<String, Double>();

        for (String key : studentGrades.keySet()) {
            var sumValue = 0;
            for (int grade : studentGrades.get(key)) {
                sumValue = sumValue + grade;
            }
            nameAverage.put(key, (double) sumValue / studentGrades.get(key).length);
        }

        var championName = "";
        var championAverage = 0.0;
        for (Map.Entry<String, Double> entry : nameAverage.entrySet()) {
            if (entry.getValue() >= championAverage) {
                championAverage = entry.getValue();
                championName = entry.getKey();
            }
        }
        return championName;
    }

    /**
     * Задание 5.
     * Дан массив целых чисел array и ещё одно целое число removeValue.
     * Удалите все вхождения этого числа из массива. Повторы в том числе.
     *
     * @param array       - входной массив целых чисел
     * @param removeValue - значение, которое в массиве нужно удалить(повторы в том числе)
     * @return - массив, в котором будут отсуствовать все значения равные removeValue
     */
    public static int[] removeElement(int[] array, int removeValue) {
        int count = 0;
        for (int j : array) {
            if (j != removeValue) {
                count++;
            }
        }

        int[] newArray = new int[count];
        int offset = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == removeValue) {
                offset++;
            } else {
                newArray[i - offset] = array[i];
            }
        }
        return newArray;
    }
}