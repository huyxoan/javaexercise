package Sep08;
/***
 *  Nhập số nguyên n, in ra số nguyên tố thứ n.
 */

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen : ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.println("Tai vi tri " + count);
    }

    private static boolean isPrime(int a) {
        if (a < 2) return false;
        if (a == 2 || a == 3) return true;
        if (a % 2 == 0 || a % 3 == 0) return false;
        for (int i = 5; i * i < Math.sqrt(a); i += 6) {
            if (a % i == 0 || a % (i + 2) == 0) return false;
        }
        return true;
    }
}
