package Sep14;

/****
 * Tính số fibonacci thứ n
 */
public class bai4 {
    public static int fibomacci(int n){
        if(n <= 2 ) return 1 ;
        return fibomacci(n-1) + fibomacci(n-2) ;
    }
}
