import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{3, 8, 3};
        int n = array.length;
        findEquilibriumIndex1(array, n);
    }

    private static void findEquilibriumIndex1(int[] array, int n) {
        int total = IntStream.of(array).sum();
        int left = 0;

        for (int i = 0; i < n; i++) {
            if (total - (array[i] + left) == left) {
                System.out.println("The equilibrium is " + i);
            }
            left += array[i];
        }
    }

    /**
     * We use two pointers to keep track of sum of elements to the left and to right of the pivot
     *
     */
    private static void findEquilibriumIndex(int[] array, int n) {
        int left = 0;
        int pivot = 0;
        int right = 0;

        for (int i = 1; i < n; i++) {
            right += array[i];
        }

        while (pivot < n - 1 && right != left) {
            pivot++;
            right -= array[pivot];
            left += array[pivot - 1];
        }

        if (left == right) {
            System.out.println("Equilibrium Index found at " + pivot);
        } else {
            System.out.println("val -1");
        }
    }

}
