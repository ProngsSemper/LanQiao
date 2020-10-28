package lanqiao;

import java.util.Scanner;

/**
 * @author Prongs
 * @date 2020/9/29
 */
public class Grade {
    static int ans = 0, n = 9, x;
    static int[] A = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        dfs(0);
        System.out.println(ans);
    }

    static void dfs(int m) {
        if (m >= 9) {
            for (int i = 1; i < n; i++) {
                // x = a + b/c     x-a =b/c  (x-a)*c=b
                int a = 0;
                for (int k = 0; k < i; k++) {
                    a = 10 * a + A[k];
                }
                if (a > x) {
                    break;
                }
                for (int j = i + 1; j < n; j++) {
                    int b = 0, c = 0;
                    for (int k = i; k < j; k++) {
                        b = 10 * b + A[k];
                    }
                    for (int k = j; k < n; k++) {
                        c = 10 * c + A[k];
                    }
                    if ((x - a) * c == b) {
                        ans++;
                    }
                }
            }
            return;
        }

        for (int i = m; i < n; i++) {
            swap(i, m);
            dfs(m + 1);
            swap(i, m);
        }

    }

    private static void swap(int i, int j) {
        int t = A[i];
        A[i] = A[j];
        A[j] = t;
    }

}
