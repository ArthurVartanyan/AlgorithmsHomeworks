package realisation.queue;

public class MyQueue {

    public MyQueue(int capacity) {
        this.capacity = capacity;
        arrayQueue = new Integer[capacity];
    }

    private final int capacity;

    private final Integer[] arrayQueue;

    private Integer firstElemIndex;

    private Integer lastElemIndex;


    public void add(int elem) {
        if (firstElemIndex == null) {
            firstElemIndex = 0;
            lastElemIndex = 0;
            arrayQueue[firstElemIndex] = elem;
        } else {
            if (firstElemIndex + 1 > capacity) {
                throw new RuntimeException("Index out of bound exception");
            }
            arrayQueue[lastElemIndex + 1] = elem;
            lastElemIndex++;
        }
    }

    public int poll() {
        int elementValue = arrayQueue[firstElemIndex];
        if (firstElemIndex <= lastElemIndex) {
            firstElemIndex++;
        }
        return elementValue;
    }

    public int[] getQueue() {
        int[] array = new int[lastElemIndex - firstElemIndex + 1];
        int first = firstElemIndex;
        for (int i = 0; i < array.length; i++) {
            if (first <= lastElemIndex) {
                array[i] = arrayQueue[first];
                first++;
            }
        }
        return array;
    }
}
