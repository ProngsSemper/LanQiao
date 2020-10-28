package lanqiao;

/**
 * @author Prongs
 * @date 2020/10/7
 * 把abcd...s共19个字母组成的序列重复拼接106次，得到长度为2014的串。
 * 接下来删除第1个字母（即开头的字母a），以及第3个，第5个等所有奇数位置的字母。
 * 得到的新串再进行删除奇数位置字母的动作。如此下去，最后只剩下一个字母，请写出该字母。
 */
public class GuessNumber {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdefghijklmnopqrs");
        for (int i = 1; i < 106; i++) {
            sb.append("abcdefghijklmnopqrs");
        }
        while (sb.length() > 1) {
            StringBuilder sb1 = new StringBuilder();
            for (int i = 1; i < sb.length(); i += 2) {
                //不用delete方法是因为删了之后下标就变了,把双数位的字符存起来当成新字符串下一个循环再截取
                sb1.append(sb.charAt(i));
            }
            sb = sb1;
        }
        System.out.println(sb);
    }
}
