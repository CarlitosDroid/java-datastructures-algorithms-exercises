import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{-4, -1, 0, 3, 10};
        convertToSquares(array, array.length);
        convertToSquares2(array, array.length);
    }

    private static void convertToSquares(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            array[i] = array[i] * array[i];
        }

        Arrays.sort(array);
        System.out.println("Sorted array " + Arrays.toString(array));
    }

    private static void convertToSquares2(int[] array, int n) { // Two pointers
        int[] newArray = new int[array.length];

        int left = 0;
        int right = array.length - 1;

        for (int i = array.length - 1; i >= 0; i--) {
            if (Math.abs(array[left]) > array[right]) {
                newArray[i] = array[left] * array[left];
                left++;
            } else {
                newArray[i] = array[right] * array[right];
                right--;
            }
        }

        System.out.println("Sorted array " + Arrays.toString(array));
    }
}
