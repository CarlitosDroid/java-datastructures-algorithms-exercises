import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[] {1, 9, 9};
        addOne1(array);
        addOne2(array);
    }

    private static void addOne1(int[] array) {  // using multiple conversions
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
        }

        int number = Integer.parseInt(stringBuilder.toString());
        number++;
        String newNumber = String.valueOf(number);

        char[] chars = newNumber.toCharArray();

        int[] numbers = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            numbers[i] = chars[i] - '0';
        }

        System.out.println(Arrays.toString(numbers));
    }

    private static void addOne2(int[] array) { // using a list
        List<Integer> vector = new Vector<>();
        for (int i = 0; i < array.length; i++) {
            vector.add(array[i]);
        }

        int index = vector.size() - 1;

        while (index >= 0 && vector.get(index) == 9) { // replace all 9 with 0
            vector.set(index, 0);
            index--;
        }

        if(index < 0) { // 999 -> 1000
            vector.set(0, 1);
            vector.add(vector.size(), 0);
        } else {
            vector.set(index, vector.get(index) + 1); // 199 -> 200
        }
        System.out.println(vector);
    }

}
