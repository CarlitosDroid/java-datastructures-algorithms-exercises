public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{6, -3, -10, 0, 2};
        int n = array.length;
        //maxSubarrayProduct(array, n);
        maxSubarrayProduct2(array, n);
    }

    static void maxSubarrayProduct(int[] array, int n) {
        int maxProduct = 0;
        for (int i = 0; i < n; i++) {
            int mul = array[i];
            for (int j = i + 1; j < n; j++) {
                maxProduct = Math.max(maxProduct, mul);
                mul *= array[j];
            }
            maxProduct = Math.max(maxProduct, mul);
        }
        System.out.println("maximum product is " + maxProduct);
    }

    /**
     * Kadane's algorithm
     */
    private static void maxSubarrayProduct2(int[] array, int n) {
        int maxSoFar = array[0]; // highest product
        int minSoFar = array[0]; // lowest product
        int result = maxSoFar;

        for (int i = 1; i < n; i++) {
            int curr = array[i];
            int tempMax = Math.max(curr, Math.max(maxSoFar * curr, minSoFar * curr));
            minSoFar = Math.min(curr, Math.min(maxSoFar * curr, minSoFar * curr));
            maxSoFar = tempMax;
            result = Math.max(maxSoFar, result);
        }
        System.out.println("maximum product is " + result);
    }

}
