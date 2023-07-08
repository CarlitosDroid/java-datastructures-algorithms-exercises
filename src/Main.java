public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{10, 2, 15, 20, 19, 90, 67};
        System.out.println("The element is " + findElementHigherThanNeighbours(array));
    }

    private static int findElementHigherThanNeighbours(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i-1] && array[i] > array[i+1]) {
                return array[i];
            }
        }
        return 0;
    }

}
