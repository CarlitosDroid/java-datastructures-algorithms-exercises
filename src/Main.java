public class Main {

    public static void main(String[] args) {
        String str = "ABCD";
        rotate(str, str.length());
    }

    private static void rotate(String str, int n) {
        for (int i = 0; i < n; i++) {
            str = str.substring(1) + str.charAt(0);
            System.out.println(str);
        }
    }
}
