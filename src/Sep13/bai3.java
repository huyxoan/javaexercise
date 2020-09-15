package Sep13;

/***
 * Kiểm tra một số có phải là chính phương
 */
public class bai3 {
    public static boolean CP(int n){
        double k = Math.sqrt(n);
        if(k == (int)k) return true ;
        return false ;
    }
}
