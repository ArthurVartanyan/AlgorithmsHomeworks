package realisation.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {10, -1, 7, 0, 100, -9};
        System.out.println(Arrays.toString(sortArray(array)));
    }


    // [10][-1][7][0][100][-9]
    // 1. [10][-1][7] - [0][100][-9]
    // 2. [10] - [-1][7]   - [0] - [100][-9]

    //             !             !
    // 3. [-1][7][10] - [-9][0][100]
    // 4. [-9][-1][0][7][10][100]

    public static int[] sortArray(int[] array) {
        if (array.length <= 1) return array;
        int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
        int[] right = Arrays.copyOfRange(array, left.length, array.length);

        return mergeArray(sortArray(left), sortArray(right));
    }

    private static int[] mergeArray(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int resIn = 0, leftIn = 0, rightIn = 0;

        while(leftIn < left.length && rightIn < right.length) {
            if (left[leftIn] < right[rightIn]) {
                result[resIn++] = left[leftIn++];
            } else {
                result[resIn++] = right[rightIn++];
            }
        }

        while (resIn < result.length) {
            if (leftIn != left.length) {
                result[resIn++] = left[leftIn++];
            } else {
                result[resIn++] = right[rightIn++];
            }
        }

        return result;
    }




}
