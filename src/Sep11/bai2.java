package Sep11;
/***
 * Nhập vào một mảng số nguyên,
 * tìm vị trí của một giá trị bất kỳ rồi in ra vị trí, nếu không có thì in ra -1
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
        System.out.print("Nhap mot so bat ky : ");
        int m = sc.nextInt();
      /*  for (int i = 0; i < n; i++) {
            if (m == i){
                System.out.println(arr[i]);
                return;
            }else {
                System.out.println("-1");
            }

        } */
        int result = search(arr , n , m );
        if(result != -1 ){
            System.out.printf("So %d xuat hien tai vi tri %d", m, result);
        }else {
            System.out.printf(String.valueOf(result));
        }

    }
    static int search(int a[] , int n , int x ){
        for(int i = 0 ; i < n ; i++){
            if(a[i] == x) return i ;
        }
        return -1 ;
    }
}
