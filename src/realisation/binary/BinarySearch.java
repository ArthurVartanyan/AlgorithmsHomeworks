package realisation.binary;

public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {-999, -1, 0, 111, 8934, 325324, 90000000};
        System.out.println(binarySearch(sortedArray, 111));
    }

    private static int binarySearch(int[] sortedArray, int element) {
        // в начале левая и правая границы равны первому и последнему элементу массива
        int left = 0;
        int right = sortedArray.length - 1;
        // пока левая и правая границы поиска не пересеклись
        while (left <= right) {
            // индекс текущего элемента находится посередине
            int middleIndex = (left + right) / 2;
            int currentElement = sortedArray[middleIndex];

            if (currentElement == element) {
                // нашли элемент - возвращаем его индекс
                return middleIndex;
            } else if (currentElement < element) {
                // текущий элемент меньше искомого - сдвигаем левую границу
                left = middleIndex + 1;
            } else {
                // иначе сдвигаем правую границу
                right = middleIndex - 1;
            }
        }
        // проверили весь массив, но не нашли элемент
        return -1;
    }
}
