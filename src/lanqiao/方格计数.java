package lanqiao;

/**
 * @author Prongs
 * @date 2020/10/12
 */
public class 方格计数 {
    public static void main(String[] args) {
        int count=0;
        int d = 1000;
        for (int i=1;i<=1000;i++){
            for (int j = 1;j<=1000;j++){
                if (i*i+j*j<=d*d){
                    count++;
                }
            }
        }
        System.out.println(count*4);
    }
}
