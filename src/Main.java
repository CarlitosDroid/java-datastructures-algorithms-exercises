public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = array.length;

        System.out.println("The maximum sum is " + maxSubArraySum2(array, n));
    }


    /**
     * Using Kadane's Algorithm
     * Time Complexity: O(n)
     *
     */
    static int maxSubArraySum2(int[] array, int n) { // Kadane's Algorithm
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;

        for (int i = 0; i < n; i++) {
            maxEndingHere += array[i];
            maxEndingHere = Math.max(maxEndingHere, 0);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

}
