package lanqiao;

import java.util.Scanner;

/**
 * @author Prongs
 * @date 2020/10/14
 */
public class 字符串 {
    static long m;

    static long twoSixteen(String str) {
        long count = 0;
        for (int i = 0; i < str.length(); i++) {
            count = (count * 26 + (str.charAt(i) - 'A')) % m;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        m = scanner.nextLong();
        long count = twoSixteen(str);
        if (count == 0) {
            System.out.println("0 0");
            return;
        }
        long[] a = new long[str.length()];
        a[str.length() - 1] = 1;
        for (int i = str.length() - 2; i >= 0; i--) {
            a[i] = a[i + 1] * 26 % m;
        }
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                long ma = ((str.charAt(i) - str.charAt(j)) * a[j]) + ((str.charAt(j) - str.charAt(i)) * a[i]);
                if ((ma + count + m) % m == 0) {
                    System.out.println(++i + " " + ++j);
                    return;
                }
            }
        }
        System.out.println("-1 -1");
    }
}
