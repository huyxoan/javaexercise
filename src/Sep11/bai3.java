package Sep11;

import javax.management.StringValueExp;
import java.util.Scanner;

/***
 * Nhập vào một mảng số nguyên không giảm,
 * tìm vị trí của một giá trị bất kỳ bằng phương pháp tìm nhị phân rồi in ra vị trí, nếu không có thì in ra -1
 */
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen n : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Nhap mot gia tri bat ky : ");
        int m = sc.nextInt();
        int result = binarySearch(arr, 0, n - 1, m);
        if (result != -1) {
            System.out.printf("So %d xuat hien tai vi tri %d", m, result);
        } else {
            System.out.printf(String.valueOf(result));
        }
    }

        static int binarySearch(int[] a , int left , int right , int x){
            if(right >= left){
                int mid = left + (right - left)/2;
                if(a[mid] == x ) return mid ;
                if(a[mid] > x){
                    return binarySearch(a,left,mid-1,x);
                }else{
                    return binarySearch(a,mid+1,right,x);
                }
            }
            return -1 ;
    }
}
