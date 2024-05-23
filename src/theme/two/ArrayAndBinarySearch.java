package theme.two;

import theme.DataHelper;

import java.util.Arrays;

import static theme.DataHelper.RANDOM_SORTED_ARRAY_INT;

public class ArrayAndBinarySearch {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Поиск пары элементов с разностью 8: " + Arrays.toString(binarySearch(RANDOM_SORTED_ARRAY_INT, 8)));
        // Задание 2
        System.out.println("Поиск 'banana': " + binarySearch(DataHelper.ARRAY_WITH_FRUITS, "banana"));
        System.out.println("Поиск 'mango': " + binarySearch(DataHelper.ARRAY_WITH_FRUITS, "mango"));
        // Задание 3
        int[] input = DataHelper.RANDOM_POSITIVE_ARRAY_INT;
        System.out.println("Вход: " + Arrays.toString(input));
        int[] result = getClosestLowerNumberDec(input);
        System.out.println("Выход: " + Arrays.toString(result));
    }

    /**
     * Задание на поиск двух индексов
     */
    public static int[] binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == array[mid]) { // если элемент найден
                return new int[]{mid, mid}; // возвращаем индексы элемента
            } else if (target < array[mid]) { // элемент больше целевого
                right = mid - 1; // сужаем диапазон поиска
            } else { // элемент меньше целевого или равен ему
                left = mid + 1; // расширяем диапазон поиска
            }
        }
        return new int[]{-1, -1}; // элементы не найдены
    }


    /**
     * Задача с ягодами и фруктами
     */
    public static int binarySearch(String[] array, String target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (target.compareTo(array[mid]) < 0) {
                right = mid - 1;
            } else if (target.compareTo(array[mid]) > 0) {
                left = mid + 1;
            } else {
                return mid; // цель найдена
            }
        }
        return -1; // цель не найдена
    }


    /**
     * Сложность O(N)
     *
     * @param num - входное число в виде массива
     * @return - наибольшее близкое значение меньше входного числа
     * <p>
     * Более подробное объяснение алгоритма можно найти поо ссылке ниже
     * <a href="https://vk.com/im?peers=310747551&sel=316671573&z=video-16108331_456273999%2F60e24d84b3e7dddc66%2Fpl_post_-79831840_44682">...</a>
     */
    public static int[] getClosestLowerNumberDec(int[] num) { // получаем а вход число(представлен в виде массива)
        if (num == null) {
            return null;
        }

        int swapIndexInNum = getSwapIndexInNum(num); // O(N) получаем индекс для замены
        if (swapIndexInNum == -1) { // если массив отсортирован по возрастанию,
            // то предыдущего числа не существует - ошибка
            return null;
        }
        int swapIndexInSubNum = getSwapIndexInSubNum(num, num[swapIndexInNum]); // O(N) берем индекс числа для замены

        swap(num, swapIndexInNum, swapIndexInSubNum); // O(1) меняем местами числа

        reverse(num, swapIndexInNum + 1, num.length - 1); // O(N) инвертируем подмассив

        return num; // итог
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static void reverse(int[] arr, int start, int end) {
        int swapsCount = (end - start + 1) / 2;
        for (int i = 0; i < swapsCount; i++) {
            swap(arr, start + i, end - i);
        }
    }

    private static int getSwapIndexInNum(int[] num) {
        for (int i = num.length - 1; i >= 1; i--) {
            if (num[i - 1] > num[i]) {
                return i - 1;
            }
        }
        return -1;
    }

    private static int getSwapIndexInSubNum(int[] num, int swapValue) {
        for (int i = num.length - 1; i >= 0; i--) {
            if (num[i] < swapValue) {
                return i;
            }
        }
        return -1;
    }
}