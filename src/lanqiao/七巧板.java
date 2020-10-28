package lanqiao;

/**
 * @author Prongs
 * @date 2020/10/13
 */
public class 七巧板 {
    public static void main(String[] args) {
        int a = 7, b = 6;
        for (int i = 0; i < 5; i++) {
            a += b++;
        }
        System.out.println(a);
    }
}
