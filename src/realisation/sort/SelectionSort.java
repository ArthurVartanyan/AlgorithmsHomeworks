package realisation.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {21, 7, -90, -3, 90, 0, 9888, -1};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void sort(int[] array) {
        int arrayLength = array.length;
        // Пробегаемся по массиву и берем первый лемент, который будем сравнивать с остальными
        for (int i = 0; i < arrayLength - 1; i++) {
            // Берем первый элемент массива
            int minIndex = i;
            // Пробегаемся по массиву второй раз и сравниваем текущий элемент каждый раз со следующими
            for (int j = i + 1; j < arrayLength; j++)
                // если следующий элемент меньше текущего, мы делаем минимальным его
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }

            // Меняем местами найденный минимальный элемент с текущим, чтобы по нему не итерироваться второй раз
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}