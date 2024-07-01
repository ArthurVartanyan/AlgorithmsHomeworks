package realisation.stack;

public class CallStack {
    public static void main(String[] args) {
        printOne();
    }

    public static void printOne() {
        System.out.println("Print one!");
        printTwo();
    }

    public static void printTwo() {
        System.out.println("Print two!");
        printText("Hello, World!");
    }

    public static void printText(String text) {
        System.out.println("Your text: " + text);
    }
}