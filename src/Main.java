import java.util.*;

public class Main {

    public static void main(String[] args) {
        String s1 = "11";
        String s2 = "11";
        int[] array = new int[] {1, 9, 9};
        //longestCommonPrefix(array);
        AddOne(array);
    }

    private static void longestCommonPrefix(int[] array) {  // using multiple conversions
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
        }

        int number = Integer.parseInt(stringBuilder.toString());
        number++;
        String newNumbb = String.valueOf(number);

        char[] chars = newNumbb.toCharArray();

        int[] numbers = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            numbers[i] = chars[i] - '0';
        }

        System.out.println(Arrays.toString(numbers));
    }

    private static void AddOne(int[] array) { // using a list
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


//    private static void longestCommonPrefix(String s1, String s2) {  // horizontal
//        int i = s1.length() - 1;
//        int j = s2.length() - 1;
//        int carry = 0;
//        int sum = 0;
//        StringBuilder result = new StringBuilder();
//
//        while (i >= 0 || j >= 0 || carry == 1) {
//            sum = carry;
//            if (i >= 0) sum = sum + Character.getNumericValue(s1.charAt(i));
//            if (j >= 0) sum = sum + Character.getNumericValue(s2.charAt(j));
//            result.append((char) (sum % 2 + '0'));
//            carry = sum / 2;
//            i--;
//            j--;
//        }
//        System.out.println(result.reverse().toString());
//    }
}
