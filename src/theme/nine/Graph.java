package theme.nine;

import java.util.Scanner;

public class Graph {

    // Задание 1
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        char[] ch = str.toCharArray();
//        long flag = 0;
//        for (char aCh : ch) {
//            String symbol = Character.toString(aCh);
//            switch (symbol) {
//                case ("6"):
//                    flag++;
//                    break;
//                case ("8"):
//                    flag = flag + 2;
//                    break;
//                case ("9"):
//                    flag++;
//                    break;
//                case ("0"):
//                    flag++;
//                    break;
//            }
//        }
//        System.out.println(flag);
//    }

    // Задание 2
    public static void main(String[] argv) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int a = 1, b = 1, k = 1;
        int isFibonacci = 0;
        while (number > a){
            k++;
            b = a + b;
            a = b - a;
            if(a == number){
                isFibonacci = 1;
            }
        }
        String result = (isFibonacci == 0) ? "0" : "1\n" + k;
        System.out.println(result);
    }
}
