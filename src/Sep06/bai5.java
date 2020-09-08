package Sep06;
/***
 * . Nhập vào hai số a, b. Kiểm tra xem 2 số a, b có phải là 2 số nguyên tố cùng nhau hay không.
 */

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a : ");
        int a = sc.nextInt();
        System.out.println("Nhap b : ");
        int b = sc.nextInt();
        int dem = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0 && b % i == 0) {
                dem++;
            }
        }
        if (dem > 1) {
            System.out.println(" La hai so nguyen to cung nhau  ");
        } else {
            System.out.println("Khong phai la hai so nguyen to cung nhau");
        }
    }
}


