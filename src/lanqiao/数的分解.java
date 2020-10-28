package lanqiao;

/**
 * @author Prongs
 * @date 2020/10/11
 * 把 2019 分解成 3 个各不相同的正整数之和，并且要求每个正整数都不
 * 包含数字 2 和 4，一共有多少种不同的分解方法？
 *
 * 注意交换 3 个整数的顺序被视为同一种方法，例如 1000+1001+18 和 1001+1000+18 被视为同一种。
 */
public class 数的分解 {
    public static void main(String[] args) {
        int n = 2019;
        int count = 0;
        for (int i = 1; i < n; i++) {
            if ((i + "").contains("2") || (i + "").contains("4")) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if ((j + "").contains("2") || (j + "").contains("4")) {
                    continue;
                }
                int k = n - i - j;
                if (i == j || i == k || j == k) {
                    continue;
                }
                if ((k > 0) && ((k + "").contains("2") || (k + "").contains("4"))) {
                    count++;
                }
            }
        }
        System.out.println(count / 3);
    }
}
