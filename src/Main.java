public class Main {

    /**
     * Remember: a string is a contiguous part of string. A string inside another string.
     * For s string of size n, there are n*(n+1)/2 non-empty substrings
     */
    public static void main(String[] args) {
        String str = "geeks";
        int n = str.length();
        printAllSubstrings(str, n);
        System.out.println(numberOfSubstrings(n));
    }

    private static void printAllSubstrings(String str, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }

    private static int numberOfSubstrings(int n) {
        return n * (n + 1) / 2;
    }

}
