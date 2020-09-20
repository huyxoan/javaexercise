package Sep13;

/***
 *  Kiểm tra một chuỗi là đối xứng
 */
public class bai7 {
    public static boolean doixung(int[] a){
        for(int i =0,j= a.length -1 ;  i < j;i++,j--){
            if(a[i] != a[j]) return false ;
        }
        return true ;
    }
}
