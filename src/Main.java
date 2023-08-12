public class Main {

    public static void main(String[] args) {
        int N = 12345;
        reverseNumber(N);
    }

    private static void reverseNumber(int N) {
        int reverse = 0;
        int r;

        while (N > 0) {
            r = N % 10;
            reverse = reverse * 10 + r;
            N = N / 10;
        }

        System.out.println("The reverse number is " + reverse);
    }
}
