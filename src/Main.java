import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * A subsequence is a sequence that can be derived from another sequence by removing zero or more elements,
     * without changing the order of the remaining elements.
     * For a sequence of size `n`, we can have (2n - 1) subsequences
     */
    public static void main(String[] args) {
        String str = "abcd";
        findSubsequences(str, "");
        System.out.println(al);
    }

    static List<String> al = new ArrayList<>();

    private static void findSubsequences(String str, String ans) {
        if (str.length() == 0) {
            al.add(ans);
            return;
        }

        findSubsequences(str.substring(1), ans + str.charAt(0));
        findSubsequences(str.substring(1), ans);
    }

}
