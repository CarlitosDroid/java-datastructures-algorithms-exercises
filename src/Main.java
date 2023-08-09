public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{6, -3, -10, 0, 2};
        int n = array.length;
        resolve(array, n);
        maxSubarrayProduct(array);
    }

    static void maxSubarrayProduct(int arr[]) {
        // Initializing result
        int result = arr[0];
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int mul = arr[i];
            // traversing in current subarray
            for (int j = i + 1; j < n; j++) {
                // updating result every time to keep an eye
                // over the maximum product
                result = Math.max(result, mul);
                mul *= arr[j];
            }
            // updating the result for (n-1)th index.
            result = Math.max(result, mul);
        }
        System.out.println("maxium product is " + result);
    }

    /**
     * Kadane's algorithm
     */
    private static void resolve(int[] array, int n) {
        int max_ending_here = array[0];
        int min_ending_here = array[0];
        int max_so_far = array[0];

        for (int i = 1; i < n; i++) {
            int temp = Math.max(
                    Math.max(array[i], array[i] * max_ending_here),
                    array[i] * min_ending_here);
            min_ending_here = Math.min(
                    Math.min(array[i], array[i] * max_ending_here),
                    array[i] * min_ending_here);
            max_ending_here = temp;
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        System.out.println("maxium product is " + max_so_far);
    }

}
