package lanqiao;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Prongs
 * @date 2020/10/11
 * 一个字符串的非空子串是指字符串中长度至少为 1 的连续的一段字符组成的串。
 * 例如，字符串aaab 有非空子串a, b, aa, ab, aaa, aab, aaab，一共 7 个。
 * 注意在计算时，只算本质不同的串的个数。
 * 请问，字符串0100110001010001 有多少个不同的非空子串？
 */
public class DifferentZiChuan {
    public static void main(String[] args) {
        String str = "0100110001010001";
        Set<String> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                set.add(str.substring(i, j));
            }
        }
        System.out.println(set.size());
    }
}
