public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int k = 4; // size of subarray
        //System.out.println("Max sum of " + maximumSumOfSubArray(array, array.length, k));
        System.out.println("Max sum of " + maximumSumOfSubArray1(array, array.length, k));
    }

    /**
     * Naive approach, Brute Force Approach
     * Time Complexity: O(n*k)
     */
    private static int maximumSumOfSubArray(int[] array, int n, int k) {
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

    /**
     *
     * Using Sliding Window
     * Time Complexity: O(n)
     * @param k The size of subarray
     */
    private static int maximumSumOfSubArray1(int[] array, int n, int k) { // Sliding Window Technique

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
