package lanqiao;

/**
 * @author Prongs
 * @date 2020/10/13
 */
public class 爬楼梯 {
    public static void main(String[] args) {

        int dp[] = new int[11];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        dp[4] = 8;
        for (int i = 5; i <= 10; i++) {
            if (i == 5 || i == 7) {
                continue;
            }
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3] + dp[i - 4];
        }
        System.out.println(dp[10]);
    }
}
