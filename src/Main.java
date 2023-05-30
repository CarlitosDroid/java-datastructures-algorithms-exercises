import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String name = "aaabbbccd";

        printFrequencyOfLetters(name);
        System.out.println("----------------------------");
        System.out.println("Second Way: Using Hash Table");
        System.out.println("----------------------------");
        printFrequencyOfLetters2(name);

    }

    /**
     * Time Complexity O(n)
     * Space Complexity O(1)
     */
    private static void printFrequencyOfLetters(String str) {
        int[] frequency = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int position = str.charAt(i) - 'a';
            frequency[position]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            System.out.println("letter " + (char)('a' + i) + " quantity " +  frequency[i]);
        }
    }

    /**
     * Time Complexity O(n)
     * Space Complexity O(n)
     */
    private static void printFrequencyOfLetters2(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> mapEntry: map.entrySet()) {
            System.out.println("letter " + mapEntry.getKey() + " quantity " + mapEntry.getValue());
        }

    }
}
