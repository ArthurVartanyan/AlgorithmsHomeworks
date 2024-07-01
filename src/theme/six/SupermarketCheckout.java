package theme.six;

import java.util.LinkedList;
import java.util.Queue;

// Задание 2
public class SupermarketCheckout {
    private Queue<String> queue;

    public SupermarketCheckout() {
        this.queue = new LinkedList<>();
    }

    public void addCustomer(String customerName) {
        queue.add(customerName);
        System.out.println(customerName + " добавлен в очередь");
    }

    public String serveCustomer() {
        if (queue.isEmpty()) {
            System.out.println("Очередь пуста");
            return null;
        }
        String servedCustomer = queue.poll();
        System.out.println("Обслужен покупатель: " + servedCustomer);
        return servedCustomer;
    }

    public static void main(String[] args) {
        SupermarketCheckout supermarket = new SupermarketCheckout();
        supermarket.addCustomer("Alice");
        supermarket.addCustomer("Bob");
        supermarket.addCustomer("Charlie");

        supermarket.serveCustomer();
        supermarket.serveCustomer();
        supermarket.serveCustomer();
        supermarket.serveCustomer(); // Очередь пуста
    }
}
