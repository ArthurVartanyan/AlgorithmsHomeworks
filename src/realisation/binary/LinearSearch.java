package realisation.binary;

public class LinearSearch {
    public static void main(String[] args) {

        int[] array = {900, 54, -6, 0, -7, 89, 90, 56};
        int indexValue = linearSearch(array, -7);
        System.out.println(indexValue);
    }

    public static int linearSearch(int[] array, int findValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == findValue) {
                return i;
            }
        }
        return -1;
    }
}