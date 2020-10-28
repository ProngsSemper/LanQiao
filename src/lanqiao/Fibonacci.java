package lanqiao;

import java.util.Scanner;

/**
 * @author Prongs
 * @date 2020/9/11
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] temp = new int[] {1, 1};
        for(int i = 3; i <= n; i++) {
            int next = temp[0] + temp[1];
            temp[0] = temp[1] % 10007;
            temp[1] = next % 10007;
        }
        System.out.print(temp[1]);
    }
}
