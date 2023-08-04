import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 3, 19, 18, 25};
        int n = array.length;
        System.out.println("The smallest difference is " + findTheSmallestInterval(array, n));
    }

    private static int findTheSmallestInterval(int[] array, int n) {
        if (array.length == 0) return 0;
        if (array.length == 1) return array[0];

        Arrays.sort(array);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n - 1; i++) {
            min = Math.min(min, array[i + 1] - array[i]);
        }
        return min;
    }
}
