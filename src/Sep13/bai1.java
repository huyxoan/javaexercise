package Sep13;
/***
 *  Kiểm tra một số có phải là nguyên tố
 */

import java.util.Scanner;

public class bai1 {
    public static boolean isPrime(int n ){
       if(n <= 2) return false  ;
        for(int i = 2 ; i*i < n ; i++){
            if(n%i==0) return false ;
        }
        return true ;
    }
}
