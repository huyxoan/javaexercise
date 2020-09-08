package Sep05;


import java.util.Scanner;

/***
 * 3. Cho số nguyên x, tìm số nguyên tố nhỏ nhất mà y >= x và y đối xứng
 */
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen : "); // In ra dong chu Nhap so nguyen
        int n = sc.nextInt();

        for (int x = n; true; x++) {
            if (isPrime(x) && isDoiXung(x)) {
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

    private static int invert(int x) {
        int a = 0;
        while (x > 0) {
            a = 10 * a + x % 10;
            x /= 10;
        }
        return a;
    }

    private static boolean isDoiXung(int x) {
        return x == invert(x);
    }
}

