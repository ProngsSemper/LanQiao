package lanqiao;

import java.util.Scanner;

/**
 * @author Prongs
 * @date 2020/10/13
 */
public class 苹果 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int[] a = new int[35];
        for (int i = 0; i < 30; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < 30; i++) {
            count += a[i] / 3;
            a[i] %= 3;
            while (a[i] > 0 && a[i + 1] > 0 && a[i + 2] > 0) {
                count++;
                a[i]--;
                a[i + 1]--;
                a[i + 2]--;
            }
        }
        System.out.println(count);
    }
}
