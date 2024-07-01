package theme.four;

import java.util.Stack;

public class RecursionAndStack {

    // Задание 1
//    public static void main(String[] args) {
//        int N = 5; // заданное число
//
//        int sum = calculateSum(N);
//
//        System.out.println("Сумма чисел от 1 до " + N + " равна: " + sum);
//    }

    public static int calculateSum(int N) {
        if (N <= 0) {
            return 0;
        }
        return N + calculateSum(N - 1);
    }

    //    Задание 2
//    public static void main(String[] args) {
//        System.out.println(recursion(20, 15)); // вызов рекурсивной функции
//        System.out.println(recursion(10, 15)); // вызов рекурсивной функции
//    }

    public static String recursion(int a, int b) {
        // основное условие задачи
        if (a > b) {
            // Базовый случай
            if (a == b) {
                return Integer.toString(a);
            }
            // Шаг рекурсии / рекурсивное условие
            return a + " " + recursion(a - 1, b);
        } else {
            // Базовый случай
            if (a == b) {
                return Integer.toString(a);
            }
            // Шаг рекурсии / рекурсивное условие
            return a + " " + recursion(a + 1, b);
        }
    }

    // Задание 3
//    public static void main(String[] args) {
//        String input = "([]{()})";
//        if (isValid(input)) {
//            System.out.println("Строка является валидной скобочной последовательностью");
//        } else {
//            System.out.println("Строка НЕ является валидной скобочной последовательностью");
//        }
//    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char topChar = stack.pop();
                if (c == ')' && topChar != '(') {
                    return false;
                } else if (c == ']' && topChar != '[') {
                    return false;
                } else if (c == '}' && topChar != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}