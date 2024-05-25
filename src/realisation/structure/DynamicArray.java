package realisation.structure;

import java.util.Arrays;

public class DynamicArray {

    private int[] array;
    private int size;

    public void add(int newElement) {
        if (size == 0) {
            array = new int[1];
            array[array.length - 1] = newElement;
        } else {
            int[] newArray = new int[size + 1];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            newArray[array.length] = newElement;
            array = newArray;
        }
        size++;
    }

    public int get(int index) {
        return array[index];
    }

    public void remove(int elemIndex) {
        int[] newArray = new int[size - 1];
        boolean skipAction = false;

        for (int i = 0; i < array.length - 1; i++) {
            if (skipAction) {
                newArray[i - 1] = array[i];
            }

            if (i != elemIndex && !skipAction) {
                newArray[i] = array[i];
            } else {
                skipAction = true;
            }
        }
        array = newArray;
    }

    @Override
    public String toString() {
        return "DynamicArray{" + Arrays.toString(array) + '}';
    }
}
