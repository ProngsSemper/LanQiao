package lanqiao;

import java.util.Scanner;

/**
 * @author Prongs
 * @date 2020/10/8
 */
public class Drink {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(n + f(n));
    }

    static int f(int n) {
        if (n < 3) {
            return 0;
        }

        return n / 3 + f(n / 3 + n % 3);
    }
}
