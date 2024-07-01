package theme.seven;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HashTable {

    // Задание 2
    public static void main(String[] args) {

        int[] data = new int[100];

        Random r = new Random();

        for (int i = 0; i < data.length; i++)
            data[i] = r.nextInt(100);

        var rez = new HashMap<Integer, Integer>();

        for (int i : data) {

            Integer tmp1 = i;

            if (rez.containsKey(tmp1)) {
                int tmp2 = rez.get(tmp1) + 1;
                rez.put(tmp1, tmp2);
            } else
                rez.put(tmp1, 0);
        }

        for (Map.Entry<Integer, Integer> entry : rez.entrySet()) {
            if (!entry.getValue().equals(0))
                System.out.printf("Number...  %s, Duplicate...  %s\r\n", entry.getKey(), entry.getValue() + 1);
        }
    }

//    Задание 3
//    public static void main(String[] args) {
//        recursion(0, 0); // вызов рекурсивной функции
//    }

    public static void recursion(int sum, int count) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        n = n / 10;
        // Базовый случай
        if (n > 0) {
            // Шаг рекурсии / рекурсивное условие
            recursion(sum + n, ++count);
        } else if (sum > 0 && count > 0) {
            System.out.println((float) sum / count);
        }
    }
}