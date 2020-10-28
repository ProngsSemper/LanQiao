package lanqiao;

/**
 * @author Prongs
 * @date 2020/10/9
 */
public class Party {
    public static void main(String[] args) {
        //今年几岁
        for (int i = 0; i < 100; i++) {
            int s = 0;
            //从今年开始过生日的话，开始累加
            for (int j = i; j < 100; j++) {
                s += j;
                if (s == 236) {
                    System.out.println(i);
                }
                if (s > 236) {
                    break;
                }
            }
        }
    }
}
