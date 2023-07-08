import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};

        System.out.println("The reverse array is " + Arrays.toString(reverseArray(array)));
    }

    private static int[] reverseArray(int[] array) {

        int leftPosition = 0;
        int rightPosition = array.length - 1;

        while (leftPosition < rightPosition) { // 0(n/2) = O(n) - Time complexity -> linear

            // swap
            int temp = array[leftPosition];
            array[leftPosition] = array[rightPosition];
            array[rightPosition] = temp;

            leftPosition++;
            rightPosition--;
        }
        return array;
    }
}
