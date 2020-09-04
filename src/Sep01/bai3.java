package Sep01;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen : ");
        int n = sc.nextInt();
        for (int x = n; true; x++) {
            if (KT(x)) {
                System.out.println("Ket qua la : " + x);
                return;
            }
        }
    }

    private static boolean KT(int x) {
        if (x < 2) return false;
        for (int i = 2; 2 * i < x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}

