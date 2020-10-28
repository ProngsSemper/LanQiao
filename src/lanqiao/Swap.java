package lanqiao;

import java.util.Scanner;

/**
 * @author Prongs
 * @date 2020/9/11
 */
public class Swap {
    public static int[] swap(int x, int y) {
        int[] temp = {y, x};
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] res = swap(sc.nextInt(), sc.nextInt());
        System.out.println(res[0] + " " + res[1]);
    }
}
