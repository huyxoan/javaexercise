package Sep10;

import java.util.Scanner;

/***
 *  Viết chương trình nhập vào một mảng số nguyên,
 *  in ra giá trị lớn nhất có thể khi cộng liên tiếp nhiều phần tử mà giá trị đó phải là số nguyên tố
*/
public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("A[ " + i + " ] = ");
            arr[i] = sc.nextInt();
        }
        int summax = 0 ;
        /*
        int sum = 0 ;
        int max = 0 ;
        for(int i = 0 ; i < n; i++){
            sum += arr[i];
            if(sum > max && isPrime(sum)){
                max = sum ;
            }
        }
         */
        for (int i = 2 ; i < n; i++) {
           if(Tong( arr , n , i) > summax){
               summax = Tong(arr,n,i) ;
            }
        }
        System.out.println(summax);
    }

    static boolean isPrime(int n) {
        if (n <= 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static int Tong(int[] a, int n,int k) {
        int sum = 0;
        int max = 0 ;
        for (int i = 0; i <= n - k ; i++) {
            sum = 0 ;
            for(int j = i ; j < i + k ; j++) {
                sum = sum + a[j];
            }
           if(sum > max && isPrime(sum)){
               max = sum ;
            }
        }
        return max ;
    }
}
