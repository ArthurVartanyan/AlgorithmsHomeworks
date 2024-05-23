package theme.three;

public class LinkedListAndSelectionSort {
    public static void main(String[] args) {
        // Задание 1
        MyLinkedList data = new MyLinkedList();
        data.add(2);
        data.add(6);
        data.add(1);
        data.add(-32);
        data.add(2314);
        data.add(4444);
        data.add(-89);
        data.add(0);
        System.out.println(data.findMiddle());

        // Задание 2
        data.printReverse();
    }

}
