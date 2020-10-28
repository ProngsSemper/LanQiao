package lanqiao;

/**
 * @author Prongs
 * @date 2020/10/7
 */
public class LiFangItSelf {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 10000; i++) {
            if (i == find(i * i * i)) {
                count++;
            }
        }
        System.out.print(count);
    }

    static int find(int a) {
        String temp = String.valueOf(a);
        int find = 0;
        for (int i = 0; i < temp.length(); i++) {
            //判断这个char是不是纯数字
            if (Character.isDigit(temp.charAt(i))) {
                //char先转string再转int
                find += Integer.parseInt(String.valueOf(temp.charAt(i)));
            }
        }
        return find;
    }

}
