public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};
        int n = array.length;
        System.out.println("The average is " + average1(array, n));
        System.out.println("The average is " + average2(array, 0, n));
    }

    private static double average1(int[] array, int n) { // iterative
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }

        return (double) sum / n;
    }

    private static double average2(int[] array, int i, int n) { // recursive

        if (i == n - 1) {
            return array[i];
        }

        if (i == 0) {
            return (array[i] + average2(array, i + 1, n)) / n;
        } else {
            return (array[i] + average2(array, i + 1, n));
        }
    }
}
