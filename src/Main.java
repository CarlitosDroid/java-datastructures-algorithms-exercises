public class Main {

    public static void main(String[] args) {
        String[] array = new String[]{"flower","flow","flight"};
        System.out.println("valor es " + longestCommonPrefix(array, array.length));
        System.out.println("valor es " + longestCommonPrefix1(array));
    }

    private static String longestCommonPrefix(String[] array, int n) {  // horizontal
        String prefix = array[0];
        for (int i = 1; i < n; i++) {

            while (array[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static String longestCommonPrefix1(String[] S) { //vertical
        if (S == null || S.length == 0) return "";
        for (int i = 0; i < S[0].length(); i++) {
            char c = S[0].charAt(i);
            for (int j = 1; j < S.length; j++) {
                if (i == S[j].length() || S[j].charAt(i) != c)
                    return S[0].substring(0, i);
            }
        }
        return S[0];
    }

}
