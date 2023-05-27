import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String str = "CarlitosDroid";
        rotateArrayToLeft(str.toCharArray(), 8);
    }

    /**
     * `The Reversal Algorithm` for array rotation
     * this method uses the concept of reversing a part of array.
     */
    private static void rotateArrayToLeft(char[] array, int d) {
        if (d == 0) {
            return;
        }

        // Important: validate if d is greater than array size
        d = d % array.length;

        reverseArray(array, 0, d - 1);
        reverseArray(array, d, array.length - 1);
        reverseArray(array, 0, array.length - 1);

        System.out.println(String.valueOf(array));
    }

    private static void reverseArray(char[] array, int start, int end) {
        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

}
