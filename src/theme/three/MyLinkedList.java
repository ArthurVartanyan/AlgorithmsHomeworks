package theme.three;

public class MyLinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    // Указатель на первый элемент списка
    private Node head;

    public void add(int value) {
        // Добавляем новый элемент в конец списка
        if (head == null) {
            head = new Node(value);
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(value);
    }

    /**
     * Функция поиска серединного элемента связного списка
     */
    public Node findMiddle() {
        Node slow = head, fast = head; // Инициализируем указатели

        while (fast != null && fast.next != null) { // Пока оба указателя не достигнут конца списка
            slow = slow.next; // Передвигаем медленный указатель на один шаг вперёд
            fast = fast.next.next; // Ускоряем быстрый указатель на два шага вперёд
        }

        return slow; // Возвращаем серединный элемент
    }

    /**
     * Функция обхода связного списка в обратном порядке
     */
    public void printReverse() {
        Node prev = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
}