package Sep11;

import java.util.Scanner;

/***
 * Nhập vào một mảng, sắp xếp mảng này theo thứ tự tăng dần của số ước số
 */
public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen n : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (demuocso(arr[i]) >= demuocso(arr[j])) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Mang da sap xep lai la : ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    static int demuocso(int n) {
        int dem = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                dem++;
            }
        }
        return dem;
    }
}
