public class Main {

    public static void main(String[] args) {
        String str = "carlitosdroid";
        removeVowels(str);
        removeConsonants(str);
    }

    private static void removeVowels(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' ||
                    str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u' ||
                    str.charAt(i) == 'A' ||
                    str.charAt(i) == 'E' ||
                    str.charAt(i) == 'I' ||
                    str.charAt(i) == 'O' ||
                    str.charAt(i) == 'U'
            ) {
                continue;
            } else {
                result += str.charAt(i);
            }
        }

        System.out.println(result);
    }

    private static void removeConsonants(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' ||
                    str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u' ||
                    str.charAt(i) == 'A' ||
                    str.charAt(i) == 'E' ||
                    str.charAt(i) == 'I' ||
                    str.charAt(i) == 'O' ||
                    str.charAt(i) == 'U'
            ) {
                result += str.charAt(i);
            }
        }

        System.out.println(result);
    }

}
