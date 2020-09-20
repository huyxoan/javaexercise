package Sep13;

/***
 * Tìm số chẵn lớn nhất trong mảng số nguyên
 */
public class bai9 {
    public static int maxchan(int[] a){
        int max = 0 ;
        for(int j = 0 ; j < a.length;j++){
            if(a[j] > max && a[j]%2==0){
                max = a[j];
            }
        }
        return max ;
    }
}
