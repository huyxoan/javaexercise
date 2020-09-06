package sep06;

import java.util.Scanner;

/***
 *  Nhập số nguyên n, tìm tích các chữ số trong n
 */

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot so nguyen n : ");
        int n = sc.nextInt();

        int p = 1;
        while (n > 0) {
            p *= n % 10;
            n /= 10;
        }

        System.out.println("Ket qua la " + p);
    }
}

