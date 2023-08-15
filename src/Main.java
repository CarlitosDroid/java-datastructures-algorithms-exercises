public class Main {

    public static void main(String[] args) {
        String str = "abcba";
        int n = str.length();
        System.out.println(isPalindrome(str, n));
        System.out.println(isPalindrome1(str, 0, n - 1));
    }

    private static boolean isPalindrome(String str, int n) { // Iterative
        int start = 0;
        int end = n - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private static boolean isPalindrome1(String str, int low, int high) { // Recursive
        if (str.charAt(low) == str.charAt(high)) {
            if (low < high) {
                return isPalindrome1(str, low + 1, high - 1);
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
