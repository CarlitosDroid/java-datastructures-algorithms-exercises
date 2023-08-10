import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String str = "III"; // IV
        //System.out.println("The value is " + romanToInt(str));
        System.out.println("The value is " + romanToNumber(str, str.length()));
        System.out.println("The value is " + romanToNumber2(str, str.length()));
    }

    private static final Map<Character, Integer> map = new HashMap<>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    private static int romanToNumber(String str, int n) { // Hashing
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i != n - 1 && map.get(str.charAt(i)) < map.get(str.charAt(i + 1))) {
                sum += map.get(str.charAt(i + 1)) - map.get(str.charAt(i));
            } else {
                sum += map.get(str.charAt(i));
            }
        }
        return sum;
    }


    private static int romanToNumber2(String str, int n) { // hacerlo con hashinggggg
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (i != n - 1 && intValue(str.charAt(i)) < intValue(str.charAt(i + 1))) {
                sum += intValue(str.charAt(i + 1)) - intValue(str.charAt(i));
                i++;
            } else {
                sum += intValue(str.charAt(i));
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
