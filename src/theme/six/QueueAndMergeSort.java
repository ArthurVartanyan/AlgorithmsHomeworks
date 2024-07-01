package theme.six;

import java.util.LinkedList;
import java.util.Queue;

public class QueueAndMergeSort {

    // Задание 1
//    public static void main(String[] args) {
//        Queue<Integer> first = new LinkedList<>();
//        first.add(9);
//        first.add(1);
//        first.add(22);
//        first.add(346);
//        Queue<Integer> second = new LinkedList<>();
//        second.add(65);
//        second.add(123124);
//        second.add(456);
//        second.add(4563);
//        second.add(-345);
//        second.add(-7);
//        second.add(1);
//
//        var result = combineQueues(first, second);
//        System.out.println(result);
//    }

    public static Queue<Integer> combineQueues(Queue<Integer> first, Queue<Integer> second) {
        Queue<Integer> combinedQueue = new LinkedList<>();

        while (!first.isEmpty() || !second.isEmpty()) {
            if (!first.isEmpty()) {
                combinedQueue.add(first.poll());
            }
            if (!second.isEmpty()) {
                combinedQueue.add(second.poll());
            }
        }
        return combinedQueue;
    }
}
