package lanqiao;

import java.util.Scanner;

/**
 * @author Prongs
 * @date 2020/9/29
 */
public class Bridge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] gra = new int[m][3];
        for (int i = 0; i < m; i++) {
            gra[i][0] = scanner.nextInt();
            gra[i][1] = scanner.nextInt();
            gra[i][2] = scanner.nextInt();
        }
        int max = 0;
        for (int i = 0; i < m - 1; i++) {
            max = Math.max(gra[i][2], gra[i + 1][2]);
        }
        int result = 0;
        boolean flag = false;
        for (int i = 1; i < max; i++) {
            for (int j = 0; j < m; j++) {
                if (gra[j][2] == i) {
                    for (int k = 0; k < j; k++) {
                        if (gra[k][1] == gra[j][0]) {
                            for (int l = 0; l < j; l++) {
                                if (gra[l][1] == gra[j][1]) {
                                    flag = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                if (flag = false) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
