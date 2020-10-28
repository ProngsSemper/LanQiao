package lanqiao;

import java.util.Scanner;

/**
 * @author Prongs
 * @date 2020/9/29
 */
public class Walnut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int result = 1;
        while (result % a != 0 || result % b != 0 || result % c != 0) {
            result++;
        }

        System.out.print(result);
    }
}
