package Sep6;

import java.util.Scanner;

/***
 *  Nhập số nguyên n, tính giai thừa của n
 */
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n : ");
        int n = sc.nextInt();
        System.out.println("ket qua la : " + giaithua(n));
    }

    static int giaithua(int n) {
        int giaithua = 1;
        if (n == 0 || n == 1) return giaithua;
        for (int i = 2; i <= n; i++) {
            giaithua *= i;
        }
        return giaithua;
    }
}
