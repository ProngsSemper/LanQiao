package lanqiao;

import java.util.Calendar;

/**
 * @author Prongs
 * @date 2020/10/16
 */
public class 世纪末的星期天 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        for (int i = 1999; i < 10000; i += 100) {
            calendar.set(Calendar.YEAR, i);
            calendar.set(Calendar.MONTH, 11);
            calendar.set(Calendar.DAY_OF_MONTH, 31);
            if (calendar.get(Calendar.DAY_OF_WEEK) == 1) {
                System.out.println(i);
                break;
            }
        }
    }
}
