package Sep08;
/***
 *  Nhập số nguyên n, in ra số nguyên tố thứ n.
 */
import java.util.Scanner;

public class test {
    public static int main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n : ");
        int n = sc.nextInt();
        int count = 1 ;
        if(n < 2) return 0 ;
        for(int i = 2 ; i*i < n ; i++){
            if(n % i == 0){
                count++ ;
        }
        }
        System.out.println(count );
        return n;
    }
    }

