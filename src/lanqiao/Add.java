package lanqiao;

import java.util.Scanner;

/**
 * @author Prongs
 * @date 2020/9/11
 */
public class Add {
    public static int GetTwoInts(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(scanner.nextInt() + scanner.nextInt());
    }
}
