package Sep10;

import java.util.Scanner;

/***
 * Viết chương trình nhập vào một mảng số nguyên,
 * in ra giá trị lớn nhất có thể khi đem 2 giá trị liền kề nhân với nhau.
 */
public class bai3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("A[ " + i + " ] = ");
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < n - 1; i++) {
                if (arr[i] * arr[i+1] > max) {
                    max = arr[i] * arr[i+1];
                }
        }
        System.out.println(max);
    }
}
