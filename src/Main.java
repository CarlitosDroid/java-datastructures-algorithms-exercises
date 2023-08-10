public class Main {

    public static void main(String[] args) {
        String str = "MCMIV";
        System.out.println("The value is " + romanToNumber(str, str.length()));
    }

    private static int romanToNumber(String str, int n) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int value1 = intValue(str.charAt(i));
            int value2 = intValue(str.charAt(i + 1));

            if (i != n - 1 && value1 < value2) {
                sum += value2 - value1;
                i++;
            } else {
                sum += value1;
            }
        }
        return sum;
    }

    private static int intValue(char c) {
        int result;
        switch (c) {
            case 'I':
                result = 1;
                break;
            case 'V':
                result = 5;
                break;
            case 'X':
                result = 10;
                break;
            case 'L':
                result = 50;
                break;
            case 'C':
                result = 100;
                break;
            case 'D':
                result = 500;
                break;
            case 'M':
                result = 1000;
                break;
            default:
                result = -1;
                break;
        }
        return result;
    }
}
