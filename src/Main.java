import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        System.out.println(Arrays.toString(sort(array)));
    }

    private static int[] sort(int[] array) {
        int counterOfOnes = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                counterOfOnes++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if(i < counterOfOnes) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }

        return array;
    }



}
