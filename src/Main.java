public class Main {

    public static void main(String[] args) {
        String name = "abc";
        reverseString(name.toCharArray());
    }

    /**
     * Time Complexity = O(n)
     * Space Complexity = O(1)
     */
    private static void reverseString(char[] array) {
        int i = 0;
        int j = array.length - 1;

        while(i < j) {
            // swap
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }

        System.out.println("The reverse string is " + String.valueOf(array));
    }
}
