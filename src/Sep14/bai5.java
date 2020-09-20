package Sep14;

/***
 * Tìm xem có bao nhiêu số fibonacci có giá trị >= m nhưng <= n
 */
public class bai5 {
    public static int fibo(int n){
        int i = 0 ;
        while (fibonacci(i) < n ){
            i++ ;
        }
        return fibonacci(i) ;
    }
    static int fibonacci(int n ){
        if(n <= 2 ) return n ;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
