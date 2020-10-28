package lanqiao;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Prongs
 * @date 2020/9/11
 */
public class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = scanner.nextInt();
        }

        Arrays.sort(temp);
        for (int j : temp) {
            System.out.print(j + "");
        }
    }
}
