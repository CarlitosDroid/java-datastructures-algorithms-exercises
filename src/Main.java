import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{3, 1, 0, -1, 9};
        getMaximumAndMinimum(array);
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    private static void getMaximumAndMinimum(int[] array) {

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            } else if (array[i] < minimum) {
                minimum = array[i];
            }
        }

        System.out.println("The maximum is " + maximum);
        System.out.println("The minimum is " + minimum);
    }

}
