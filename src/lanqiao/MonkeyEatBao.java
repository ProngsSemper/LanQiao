package lanqiao;

import java.util.Scanner;

/**
 * @author Prongs
 * @date 2020/9/13
 */
public class MonkeyEatBao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temp = new double[7];

        for (int i = 0; i < 7; i++) {
            temp[i] = scanner.nextInt();
        }
        cacl(temp);
    }

    public static void cacl(double[] numbers) {
        double res = numbers[3] / numbers[0] + numbers[4] / numbers[1] + numbers[5] / numbers[2];
        System.out.printf("%." + (int) numbers[6] + "f", res);
    }
}
