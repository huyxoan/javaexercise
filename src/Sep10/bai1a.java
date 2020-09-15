package Sep10;

import java.util.Scanner;

/***
 *  Viết chương trình nhập vào một mảng số nguyên, kiểm tra mảng có phải có giá trị tăng dần không
 */
public class bai1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("A[ " + i + " ] = ");
            arr[i] = sc.nextInt();
        }
        if (KT(arr, n)) {
            System.out.println("Mang co gia tri tang dan ");
        } else {
            System.out.println("Mang khong tang dan");
        }
    }

    static boolean KT(int b[], int p) {
        for (int i = 0; i < p - 1; i++) {
            if (b[i] > b[i + 1]) return false;
        }
        return true;
    }
}
