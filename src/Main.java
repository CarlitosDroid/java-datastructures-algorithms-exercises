public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{};
        System.out.println("Max sum of " + slidingWindow(array, array.length, 3));
        System.out.println("Max sum of " + slidingWindow2(array, array.length, 3));
    }

    /**
     * Naive approach, Brute Force Approach
     * Time Complexity: O(n*k)
     */
    private static int slidingWindow(int[] array, int n, int k) {
        int max_sum = Integer.MIN_VALUE;

        for (int i = 0; i < n - k + 1; i++) {
            int curentSum = 0;
            for (int j = 0; j < k; j++) {
                curentSum = curentSum + array[i + j];
            }
            max_sum = Math.max(curentSum, max_sum);
        }

        return max_sum;
    }

    /**
     * Using Sliding Window
     * Time Complexity: O(n)
     */
    private static int slidingWindow2(int[] array, int n, int k) {

        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += array[i];
        }

        int windowSum = maxSum;

        for (int i = k; i < n; i++) {
            windowSum += array[i] - array[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
