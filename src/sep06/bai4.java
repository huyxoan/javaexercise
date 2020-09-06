package sep06;

import java.util.Scanner;

/***
 *  Nhập số thực n, tính căn bậc 2 của n bằng phương pháp chia đôi với độ chính xác 0.00001,
 */
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot so thuc : ");
        double n = sc.nextDouble();
        sc.close();
        System.out.println("Ket qua can bac 2 cua so " + n + " la " + square(n));
    }

    static double square(double x) {
        double a;
        double b = x / 2;
        do {
            a = b;
            b = (a + (x / a)) / 2;
        } while (a - b != 0);
        return b;
    }
}
