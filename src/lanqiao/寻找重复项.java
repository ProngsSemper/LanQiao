package lanqiao;

import java.util.*;

/**
 * @author Prongs
 * @date 2020/10/13
 */
public class 寻找重复项 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Long, Long> map = new HashMap<>();
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();
        long a = 1;
        map.put(a, a);
        for (int i = 1; i < 2000000; i++) {
            a = (A * a + a % B) % C;
            if (map.get(a) != null) {
                System.out.println(i);
                return;
            }
            map.put(a, a);
        }
        System.out.println(-1);
    }
}
