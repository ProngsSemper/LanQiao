package lanqiao;

import java.util.Scanner;

/**
 * @author Prongs
 * @date 2020/10/11
 */
public class 特别数的和 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if ((i + "").contains("2") || (i + "").contains("0") || (i + "").contains("1") || (i + "").contains("9")) {
                count += i;
            }
        }
        System.out.println(count);
    }
}
