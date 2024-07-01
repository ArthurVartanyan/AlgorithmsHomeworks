package realisation.stack;

import java.util.Arrays;

public class Stack {

    private int size;

    private int[] stackArray;

    private int topIndex;

    public Stack(int size) {
        this.size = size;
        stackArray = new int[size];
        topIndex = -1;
    }

    public void add(int element) {
        stackArray[++topIndex] = element;
    }

    public int readTop() {
        int returnValue = stackArray[topIndex];
        topIndex--;
        return returnValue;
    }

    @Override
    public String toString() {
        return "stack.Stack{" +
                "stackArray=" + Arrays.toString(stackArray) +
                '}';
    }
}