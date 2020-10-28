package lanqiao;

/**
 * @author Prongs
 * @date 2020/10/9
 */
public class 凑算式 {
    static int count = 0;

    static int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void dfs(int m) {
        if (m >= 9) {
            int A = a[0];
            int B = a[1];
            int C = a[2];
            int D = 100 * a[3] + 10 * a[4] + a[5];
            int E = 100 * a[6] + 10 * a[7] + a[8];
            if (A * C * E + B * E + D * C == 10 * C * E) {
                count++;
            }

            return;
        }

        for (int i = m; i < 9; i++) {
            swap(m, i);
            dfs(m + 1);
            swap(m, i);
        }

    }

    static void swap(int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) {
        dfs(0);
        System.out.println(count);
    }

}
