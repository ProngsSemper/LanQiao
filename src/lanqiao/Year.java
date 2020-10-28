package lanqiao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author Prongs
 * @date 2020/9/29
 */
public class Year {
    public static TreeSet<Integer> treeSet = new TreeSet<>();
    public static List<Integer> list = new ArrayList<>();

    public static void find(String year, String month, String day) {
        int y = Integer.parseInt(year);
        int m = Integer.parseInt(month);
        int d = Integer.parseInt(day);
        if (y > 59) {
            y = y + 1900;
        } else {
            y = y + 2000;
        }
        if (((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0 && y % 100 == 0)) && m == 2 && d <= 29 && d > 0) {
            treeSet.add(Integer.parseInt("" + y + month + day));
        }
        if (y % 4 != 0 && m == 2 && d > 0 && d <= 28) {
            treeSet.add(Integer.parseInt("" + y + month + day));
        }
        if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && d > 0 && d <= 31) {
            treeSet.add(Integer.parseInt("" + y + month + day));
        }
        if ((m == 4 || m == 6 || m == 9 || m == 11) && d > 0 && d <= 30) {
            treeSet.add(Integer.parseInt("" + y + month + day));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] s = str.split("/");
        find(s[0], s[1], s[2]);
        find(s[2], s[0], s[1]);
        find(s[2], s[1], s[0]);
        list.addAll(treeSet);
        for (Integer integer : list) {
            String result = integer + "";
            System.out.println(result.substring(0, 4) + "-" + result.substring(4, 6) + "-" + result.substring(6, 8));
        }
    }
}
