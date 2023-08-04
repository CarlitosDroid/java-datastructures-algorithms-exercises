public class Main {

    /**
     * An anagram of a string is another string that contains the same character but in a different order.
     * For example: "abcd" - "dabc"
     */
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "bcad";

        System.out.println(areAnagram(str1, str2));
    }

    private static boolean areAnagram(String str1, String str2) {
        int asciiValue1 = getASCCIValue(str1);
        int asciiValue2 = getASCCIValue(str2);

        if (asciiValue1 == asciiValue2) {
            return true;
        } else {
            return false;
        }
    }

    private static int getASCCIValue(String str) {
        char[] chars = str.toCharArray();
        int asciiValue = 0;
        for (int i = 0; i < chars.length; i++) {
            asciiValue += (chars[i]);
        }
        return asciiValue;
    }

}
