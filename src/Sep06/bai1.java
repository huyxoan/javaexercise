package Sep06;

import java.util.Scanner;

/***
 *  Nhập số nguyên n, tìm tổng các ước số của n
 */
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot so nguyen  : ");
        int n = sc.nextInt();
        int s = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                s += i;
            }
        }

        System.out.println("Ket qua la " + s);
    }
}
