package lanqiao;

import java.math.BigInteger;

/**
 * @author Prongs
 * @date 2020/10/11
 */
public class 复数幂 {
    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(2);
        BigInteger b = BigInteger.valueOf(3);
        BigInteger c = BigInteger.valueOf(2);
        BigInteger d = BigInteger.valueOf(3);
        for (int i=2;i<=123456;i++){
            BigInteger x = a.multiply(c).subtract(b.multiply(d));
            BigInteger y = a.multiply(d).add(b.multiply(c));
            a=x;
            b=y;
        }
        System.out.print(a.toString()+b.toString()+"i");
    }
}
