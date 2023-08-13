public class Main {

    public static void main(String[] args) {
        String str = "DROIDDROD";
        findFirstNonRepeatingCharacter(str);
    }

    private static void findFirstNonRepeatingCharacter(String str) {

        if (str.isEmpty()) {
            System.out.println("Empty string");
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                System.out.println("The element is " + str.charAt(i));
                break;
            }
        }
    }
}
