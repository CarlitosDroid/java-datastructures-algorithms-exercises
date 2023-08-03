public class Main {

    public static void main(String[] args) {
        String str = "abba";
        int n = str.length();
        System.out.println(isPalindrome(str, n));
    }

    private static boolean isPalindrome(String str, int n) {
        int start = 0;
        int end = n - 1;

        while (start < end) {
            if(str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
