import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        areBracketsBalanced(144);
    }

    private static void areBracketsBalanced(int N) {
        Map<Float, Float> map = new HashMap<>();
        for (int i = 2; i * i <= N; i++) {
            map.put((float) (i * i), (float) 1); // 4, 9, 16, 36, ... 144
            System.out.println(N / (i * i));
            if (map.containsKey((float) N / (i * i))) { // 144 / 36 = 4 (already exist)
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
