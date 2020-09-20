package Sep13;

/***
 * Tính tổng của tất cả các phần tử trong mảng
 */
public class bai8 {
    public static int sum(int[]a ){
        int sum = 0 ;
        for(int i = 0 ; i < a.length;i++){
            sum += a[i];
        }
        return sum ;
    }
}
