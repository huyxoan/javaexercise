package Sep11;

import java.util.Scanner;

/***
 * Nhập vào một mảng, sắp xếp mảng này theo thứ tự tăng dần
 */
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen n : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n -1 ; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
            System.out.println("Mang duoc sap xep tang dan " );
            show(arr,n);
        }

        static void show(int[] a, int n) {
            for (int i = 0; i < n; i++) {
              System.out.println(a[i]);
        }
    }
}