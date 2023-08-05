import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{1, 0, 1, 0, 1, 1, 0, 1};
        int n = array.length;
        sortArray(array, n);
        //sortArray1(array, n);
    }

    private static void sortArray(int[] array, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == 1) {
                count++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i < count) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }

        System.out.println("the new array is " + Arrays.toString(array));
    }

    private static void sortArray1(int[] array, int n) {
        int pivot = 1;
        int j = 0; // count zeros and the position where it should move
        for (int i = 0; i < n - 1; i++) {
            if (array[i] < pivot) {
                // swap
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                j++;
            }
        }
        System.out.println("the new array is " + Arrays.toString(array));
    }

}
