package Sep13;

/**
 * Tìm số nguyên tố lớn nhất trong mảng số nguyên
 */
public class bai10 {
    public static int songuyento(int[] a ){
        int max = 0 ;
        for(int i = 0 ; i < a.length ;i++){
            if(a[i] > max && isExist(a[i])){
                max = a[i] ;
            }
        }
        return max ;
    }
    static boolean isExist(int n ){
        if(n <= 2) return false ;
        for(int i = 2 ; i*i < n ;i++){
            if(n%i==0) return false ;
        }
        return true ;
    }
}
