package realisation.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {0, -1, 80, 0, 100, -64, 1};
        quickSort(array, 0, 6);
        System.out.println(Arrays.toString(array));
    }

    //         !      !        !
    // 1. [0][-1][80][0][100][-64][1] - 3 index
    // 2. [0][-1][-64] [0] [100][80][1]
    // 3. recursion repeat

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }

        int middle = low + (high - low) / 2;
        int pivot = array[middle];

        int i = low;
        int j = high;

        while(i <= j) {

            while(array[i] < pivot) {
                i++;
            }

            while(array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }

            if (low < j) {
                quickSort(array, low, j);
            }

            if (high > i) {
                quickSort(array, i, high);
            }
        }
    }
}
