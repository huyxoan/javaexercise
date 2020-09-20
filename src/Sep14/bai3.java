package Sep14;

/***
 * Tính tổng 1! + 2! + 3! + ... + n!
 */
public class bai3 {
    public static int giathua(int n){
        int sum = 0 ;
        int p = 1 ;
        if(n == 1) return 1 ;
        for(int i = 1 ; i <= n ;i++){
             p *= i ;
             sum += p ;
        }
        return sum ;
    }
}
