package Sep08;
/***
 * *  Nhập số nguyên n, in ra số nguyên tố thứ n.
 */

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen : ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isExist(i)) {
                count++;
            }
        }
        System.out.println("Tai vi tri " + count);
    }

    static boolean isExist(int a) {
        if (a < 2) return false;
        if (a == 2 || a == 3) return true ;
        if (a % 2 == 0 || a % 3 == 0) return false;
        for (int i = 2; i * i < a; i++) {
            if (a % i == 0) return false;
        }
        return true;
    }
}
