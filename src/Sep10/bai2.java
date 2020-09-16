package Sep10;
/***
 *  Viết chương trình nhập vào một mảng số nguyên, In ra giá trị lớn nhất khi viết ngược lại


*/
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen n : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        int b[] = new int[n];
        int max = 0 ;
               for(int i = 0 ; i < n ; i++){
                   b[i] = inverse(arr[i]);
                   }
               for(int i = 0 ; i < b.length ; i++){
                   if(b[i] > max ){
                       max = b[i] ;
                   }
               }
        System.out.println(inverse(max));

        }

   public static int inverse(int n) {
        int p = 0;
        while (n > 0) {
            p = p * 10 + n % 10;
            n /= 10;
        }
        return p;
    }
}

