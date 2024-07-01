package theme.five;

import java.util.Random;

public class CallStackAndQuickSort {

    // Задание 1
//    public static void main(String[] args) {
//        System.out.println(recursion(123)); // вызов рекурсивной функции
//    }

    public static int recursion(int n) {
        // Базовый случай
        if (n < 10) {
            return n;
        }// Шаг рекурсии / рекурсивное условие
        else {
            System.out.print(n % 10 + " ");
            return recursion(n / 10);
        }
    }

    // Задание 2
//    public static void main(String[] args) {
//        System.out.println(recursion("radar")); // вызов рекурсивной функции
//    }

    public static String recursion(String s) {
        // Базовый случай
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
                // Базовый случай
                if (s.length() == 2) {
                    return "YES";
                }
                // Шаг рекурсии / рекурсивное условие
                return recursion(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }

    // Задание 3
//    public static void main(String[] args) {
//        var array = new FootballTeam[10];
//        Random rand = new Random();
//        for (int i = 0; i < 10; i++) {
//            var team = new FootballTeam();
//            team.setTeamName("Team " + i);
//            team.setGoalCountBySeason(rand.nextInt(200));
//            array[i] = team;
//        }
//
//        quickSort(array, 0, array.length - 1);
//
//        for (var t : array) {
//            System.out.println(t);
//        }
//    }

    public static void quickSort(FootballTeam[] array, int low, int high) {
        if (array.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }

        int middle = low + (high - low) / 2;
        FootballTeam pivot = array[middle];

        int i = low;
        int j = high;

        while (i <= j) {

            while (array[i].getGoalCountBySeason() < pivot.getGoalCountBySeason()) {
                i++;
            }

            while (array[j].getGoalCountBySeason() > pivot.getGoalCountBySeason()) {
                j--;
            }

            if (i <= j) {
                FootballTeam temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }

            if (low < j) {
                quickSort(array, low, j);
            }

            if (high > i) {
                quickSort(array, i, high);
            }
        }
    }
}
