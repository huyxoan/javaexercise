package Sep01;

import java.util.Scanner;


/***
 * 3. Cho số nguyên x, tìm số nguyên tố nhỏ nhất mà y >= x
 */
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen : "); // In ra dong chu Nhap so nguyen
        int n = sc.nextInt();

        for (int x = n; true; x++) {
            if (isPrime(x)) {
                System.out.println("Ket qua la : " + x);
                return;
            }
        }
    }

    private static boolean isPrime(int x) {
        if (x < 2) return false;

        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }

        return true;
    }

}


