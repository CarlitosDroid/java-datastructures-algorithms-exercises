public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{7, -10, 13, 1, 4, -7, -12, -3, 0, -9, 6, -2, -6, 7};
        System.out.println("The closest number to 0 is " + closestToZero(array));
        System.out.println("The closest number to 0 is " + closestToZero1(array));
    }

    private static int closestToZero(int[] array) {
        if (array.length == 0) return 0;

        int closest = array[0];

        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            int absClosest = Math.abs(closest);

            if (number > 0 && number <= absClosest) {
                closest = number;
            } else if (number < 0 && -number < absClosest) {
                closest = number;
            }
        }
        return closest;
    }

    private static int closestToZero1(int[] array) {
        if (array.length == 0) return 0;

        int positiveClosestToZero = Integer.MAX_VALUE;
        int negativeClosestToZero = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveClosestToZero = Math.min(positiveClosestToZero, array[i]);
            } else if (array[i] < 0) {
                negativeClosestToZero = Math.max(negativeClosestToZero, array[i]);
            }
        }

        int absPositive = Math.abs(positiveClosestToZero);
        int absNegative = Math.abs(negativeClosestToZero);

        int closestToZero = Math.min(absPositive, absNegative);
        if (closestToZero == absPositive) {
            return positiveClosestToZero;
        } else {
            return negativeClosestToZero;
        }
    }
}
