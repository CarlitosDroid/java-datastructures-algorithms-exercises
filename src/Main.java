import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{-5, -1, 0, 3, 10 };

        System.out.println("The duplicated array is " + Arrays.toString(duplicate(array)));
        System.out.println("The sorted array is " + Arrays.toString(sortArray(array)));
    }

    private static int[] duplicate(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(array[i], 2);
        }
        return array;
    }

    /**
     * Using insertion sort algorithm
     */
    private static int[] sortArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
        return array;
    }
}
