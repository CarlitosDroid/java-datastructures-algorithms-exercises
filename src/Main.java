import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{8, 7, 2, 5, 3, 1};
        int n = array.length;
        int target = 10;

        //findPair(array, n, target);
        //findPair1(array, n, target);
        findPair2(array, n, target);
    }

    /**
     * Time complexity: O(n⌃2)
     * Space complexity O(1)
     */
    private static void findPair(int[] array, int n, int target) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println("The pair is " + array[i] + " and " + array[j]);
                    return;
                }
            }
        }
    }

    /**
     * Time complexity: O(n log n)
     * Space complexity O(1)
     */
    private static void findPair1(int[] array, int n, int target) {

        Arrays.sort(array);

        int start = 0;
        int end = n - 1;

        while (start < end) {
            if (array[start] + array[end] == target) {
                System.out.println("The pair is " + array[start] + " and " + array[end]);
                return;
            } else if (array[start] + array[end] < target) {
                start++;
            } else {
                end--;
            }
        }
    }

    /**
     * Time complexity: O(n)
     * Space complexity O(n)
     */
    private static void findPair2(int[] array, int n, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(target - array[i])) {
                System.out.println("The Pair is " + array[map.get(target - array[i])] + " and " + array[i]);
                return;
            }

            map.put(array[i], i);
        }

        System.out.println("Pair not found");
    }

}
