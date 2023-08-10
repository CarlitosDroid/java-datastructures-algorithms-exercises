public class Main {

    public static void main(String[] args) {
        String str1 = "AB";
        String str2 = "CD";

        interleavings(str1, 0, str2, 0, "");
    }

    private static void interleavings(String str1, int i, String str2, int j, String asf) { // iterative

        if (i == str1.length() && j == str2.length()) {
            System.out.println(asf);
        }

        if (i < str1.length()) {
            interleavings(str1, i + 1, str2, j, asf + str1.charAt(i));
        }

        if (j < str2.length()) {
            interleavings(str1, i, str2, j + 1, asf + str2.charAt(j));
        }
    }

}
