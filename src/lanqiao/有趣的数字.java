package lanqiao;

/**
 * @author Prongs
 * @date 2020/10/13
 */
public class 有趣的数字 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i <= 100000; i++) {
            if (isPrime(i)) {
                if ((i + "").contains("5")) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static boolean isPrime(int num) {
        if (num == 2) {
            return true;
        }
        if (num < 2 || num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            //【任何一个数只要能被 比自己平方根小的数整除，就不是质数】
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
