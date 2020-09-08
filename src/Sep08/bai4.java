package Sep08;
/***
 *  Nhập số nguyên n, in ra số nguyên tố thứ n.
 */

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen :  ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu :  " );
        for(int i = 0 ; i < n ; i++){
            System.out.printf("arr[%d]= " , i );
            arr[i] = sc.nextInt();
        }
        System.out.print("Nhap so nguyen to can tim : ");
        int m = sc.nextInt();
        int a = 0 ;
        int b = n - 1 ;
        while (b >= a){
            int c = (a+b)/2 ;
            if(arr[c] == m ){
                System.out.println("Tim thay phan tu " + m + " tai vi tri " + c);
                return;
            }else if(arr[c] < m){
                a = c + 1 ;
            } else {
                b = c - 1 ;
            }
        }
        System.out.println("Khong tim thay phan tu nao ");
    }
}
