package realisation.queue;

import java.util.Arrays;

public class QueueTest {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(10);
        myQueue.add(8);
        myQueue.add(-1);
        myQueue.add(0);
        myQueue.add(1000);

        System.out.println(Arrays.toString(myQueue.getQueue()));

        int value = myQueue.poll();
        System.out.println(value);
        System.out.println(Arrays.toString(myQueue.getQueue()));
    }
}