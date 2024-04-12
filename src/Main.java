public class Main {

    public static void main(String[] args) {
        int[] array = new int[] {1, 4, 20, 3, 10, 5};
        int sum = 15;
        getSubArray(array, sum);
        getSubArray2(array, sum);
    }

    /**
     * Naive approach, Brute Force Approach, Nested Loop
     * Time Complexity: O(N2)
     *
     */
    private static void getSubArray(int[] array, int sum) {
        for (int i = 0; i < array.length; i++) {
            int currentSum = array[i];
            for (int j = i + 1; j < array.length; j++) {
                currentSum += array[j];
                if (currentSum == sum) {
                    System.out.println("The elements are between " + i + " and " + j);
                }
            }
        }
    }

    /**
     * Using sliding window
     */
    private static boolean getSubArray2(int[] array, int sum) {
        int currentSum = array[0];
        int startIndex = 0;

        for (int i = 1; i <= array.length; i++) {
            while (currentSum > sum && startIndex < i - 1) {
                currentSum -= array[startIndex];
                startIndex++;
            }

            if(currentSum == sum) {
                int endIndex = i - 1;
                System.out.println("Sum found between indexes " + startIndex + " and " + endIndex);
                return true;
            }

            if (i < array.length) {
                currentSum += array[i];
            }
        }

        System.out.println("No subarray found");
        return false;
    }

}
