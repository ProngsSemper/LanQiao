package lanqiao;

/**
 * @author Prongs
 * @date 2020/10/16
 */
public class 煤球数目 {
    public static void main(String[] args) {
        int level = 0;
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            level += i;
            //是100层的总值，不是第100层的值所以要用count记录
            count += level;
        }
        System.out.println(count);
    }
}
