package lanqiao;

import java.util.Scanner;

/**
 * @author Prongs
 * @date 2020/10/1
 */
public class NNumber {
    static int[] d;
    static int n;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float a = s.nextFloat();
        float b = s.nextFloat();
        n = s.nextInt();
        d = new int[100000];
        divide(a, b);
        for (int i = n; i <= n + 2; i++) {
            System.out.print(d[i]);
        }
    }

    public static void divide(float a, float b) {
        int i = 0;
        float m;
        while (i <= n) {
            d[i] = (int) (a / b);
            m = a % b;
            a = m * 10;
            i++;
        }
    }

}
