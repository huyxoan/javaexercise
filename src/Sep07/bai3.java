package Sep07;

import java.util.Scanner;

/***
 * . Viết chương trình nhập vào một số nguyên rồi kiểm tra các chữ số trong sô có phải tăng dần hay không (không được phép chuyển về kiểu String)
 */
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot so nguyen : ");
        int n = sc.nextInt();
        System.out.println(KT(n));
    }

    static boolean KT(int n) {
        while (n > 0) {
            int p = n % 10;
            int p1 = (n / 10) % 10;
            n /= 10;
            if (p < p1) return false;
        }
        return true;
    }
}
