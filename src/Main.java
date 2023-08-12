import java.util.*;

public class Main {

    public static void main(String[] args) {
        String s = "salritoc";
        int[] array = new int[]{7, 1, 3, 2, 4, 5, 6, 0};
        sortMapByKey(s, array);;
    }

    private static void sortMapByKey(String s, int[] array) {
        Map<Character, Integer> unsortedMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            unsortedMap.put(s.charAt(i), array[i]);
        }

        Map<Character, Integer> treeMap = new TreeMap<>(Comparator.naturalOrder()); // or reverseOrder
        treeMap.putAll(unsortedMap);
        System.out.println(treeMap);
    }
}
