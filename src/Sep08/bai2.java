package Sep08;

import java.util.Scanner;

/***
 * Nhập một số nguyên n, kiểm tra xem n có phải có dạng 2^n hay không.
 */
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot so nguyen : ");
        int n = sc.nextInt();
        System.out.println(isExist(n));
    }

    static boolean isExist(int a) {
        double k = Math.log(a) / Math.log(2.0);
        return k != (int) k;
    }
}

