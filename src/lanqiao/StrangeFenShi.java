package lanqiao;

/**
 * @author Prongs
 * @date 2020/10/7
 */
public class StrangeFenShi {
    public static void main(String[] args) {
        int count = 0;
        for (int a = 1; a < 10; a++) {
            for (int b = 1; b < 10; b++) {
                for (int c = 1; c < 10; c++) {
                    for (int d = 1; d < 10; d++) {
                        if ((a == b) || (c == d)) {
                            continue;
                        }
                        //整数除法尽量化为乘法避免误差
                        int e = a * 10 + c;
                        int f = b * 10 + d;
                        if (e * b * d == f * a * c) {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.print(count);
    }

}
