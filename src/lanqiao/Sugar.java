package lanqiao;

import java.util.Scanner;

/**
 * @author Prongs
 * @date 2020/10/7
 */
public class Sugar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int children = scanner.nextInt();
        int[] a = new int[children];

        for (int i = 0; i < children; i++) {
            a[i] = scanner.nextInt();
        }
        int count = 0;
        while (true) {
            //需要设置一个临时数组，存放每个人获取到的糖果，每次循环开始都要清空
            int[] temp = new int[children];
            boolean flag = true;

            for (int i = 0; i < children; i++) {
                if (i == 0) {
                    temp[children - 1] += a[i] / 2;
                } else {
                    temp[i - 1] += a[i] / 2;
                }
            }

            //此时再改变原数组中糖果数量
            for (int i = 0; i < children; i++) {
                a[i] = temp[i] + a[i] / 2;
                if (a[i] % 2 != 0) {
                    a[i] += 1;
                    count++;
                }
            }

            //判断是否相等
            for (int i = 0; i < children; i++) {
                if (a[i] != a[0]) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                break;
            }

        }
        System.out.print(count);
    }
}
