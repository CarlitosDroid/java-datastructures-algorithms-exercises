import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{7, 10, 4, 3, 21, 117, 13};

        System.out.println("the 2th(K) smallest element is " + findKthElement(array, 2));
        System.out.println("the Third maximum element is " + findTheThirdMaximumElement(array));

    }

    /**
     * Using time Complexty
     * Space Complexity: O(n)
     * treeSet sort and remove duplicated elements
     * you can use a for with treeSet
     * you can use iterator to iterate over a treeSet
     *
     */
    private static int findKthElement(int[] array, int K) {
        Set<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < array.length; i++) {
            treeSet.add(array[i]);
        }

        Iterator<Integer> iterator = treeSet.iterator();

        int smallest = 0;
        while (K > 0) {
            smallest = iterator.next();
            K--;
        }
        return smallest;
    }

    /**
     * This only works for a hardcoded 'th' number.
     * This only works if the elements are not repeated
     * For example the 2nd, or the 3th, etc (because we need the same numbers of if)
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    private static int findTheThirdMaximumElement(int[] array) {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if(array[i] > first) {
                third = second;
                second = first;
                first = array[i];
            } else if(array[i] > second) {
                third = second;
                second = array[i];
            } else if (array[i] > third) {
                third = array[i];
            }
        }
        return third;
    }

}
