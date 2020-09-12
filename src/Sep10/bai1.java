package Sep10;

import java.util.Scanner;

/***
 *  Viết chương trình nhập vào một mảng số nguyên, kiểm tra mảng có phải có giá trị tăng dần không
 */
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhap so nguyen n : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i <= n ; i++){
   //         System.out.println("A[ +" i " + ] = " );
            arr[i] = sc.nextInt() ;
         }
    }
}
