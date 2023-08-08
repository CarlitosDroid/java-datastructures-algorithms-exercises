import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{6, 0, 8, 2, 3, 0, 4, 0, 1};
        int[] array1 = new int[]{6, 0, 8, 2, 3, 0, 4, 0, 1};
        int n = array.length;
        resolve(array, n);
        resolve1(array1, n);
    }

    private static void resolve(int[] array, int n) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            if(array[i] != 0) {
                array[count++] = array[i];
            }
        }

        for (int i = count; i < n; i++) {
            array[i] = 0;
        }

        System.out.println(Arrays.toString(array));
    }

    private static void resolve1(int[] array, int n) { // Quicksort - partition logic
        int pivot = 0;
        int j = 0;

        for (int i = 0; i < n; i++) {
            if(array[i] != pivot) { // if number is different from pivot then placed it before pivot
                //swap
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                j++;
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
