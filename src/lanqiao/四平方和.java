package lanqiao;

import java.util.Scanner;

/**
 * @author Prongs
 * @date 2020/10/16
 */
public class 四平方和 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i * i <= n; i++) {
            for (int j = i; j * j <= n - i * i; j++) {
                for (int k = j; k * k <= n - i * i - j * j; k++) {
                    for (int p = k; p * p <= n - i * i - j * j - k * k; p++) {
                        if (i * i + j * j + k * k + p * p == n) {
                            System.out.println(i + " " + j + " " + k + " " + p);
                            return;
                        }
                    }
                }
            }
        }
    }
}
