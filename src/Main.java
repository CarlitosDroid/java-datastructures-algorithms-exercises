import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{3,2,4,2,1,2,5,2};
        int n = array.length;

        mostFrequentElement1(array, n);

    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    private static void mostFrequentElement(int[] array, int n) { // Hashing
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }

        System.out.println(map);

        int maximum = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maximum) {
                maximum = entry.getKey();
            }
        }

        System.out.println("Most frequent element is " + maximum);
    }

    /**
     * This algorithm only works if the frequent element is present more than (array.length/2) times
     */
    private static void mostFrequentElement1(int[] array, int n) { // Moore's voting algorithm
        int findex = 0; // frequent element index
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] == array[findex]) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                findex = i;
                count = 1;
            }
        }

        System.out.println("Most frequent element is " + array[findex]);
    }
}
