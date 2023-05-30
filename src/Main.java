public class Main {

    public static void main(String[] args) {
        String str = "caarlos";
        sortString(str);
    }

    /**
     * Time Complexity = O(MAX_LETTERS*n) => O(n)
     * Space complexity = O(1)
     * @param str
     */
    private static void sortString(String str) {
        int[] letters = new int[MAX_LETTERS];

        // count the letters in the string
        for (int i = 0; i < str.length(); i++) {
            int position = str.charAt(i) - 'a';
            letters[position]++;
        }

        for (int i = 0; i < MAX_LETTERS; i++) {
            for (int j = 0; j < letters[i]; j++) {
                System.out.print(((char) ('a' + i)));
            }
        }
    }

    // This represents the quantity of letters in the alphabet(`a` - `z`)
    private static final int MAX_LETTERS = 26;
}
