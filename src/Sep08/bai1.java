package Sep08;

import java.util.Scanner;

/***
 *Viết chương trình nhập vào một số nguyên n, dùng lệnh System.out.print (và println) để in ra hình vuông
 */
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen : ");
        int n = sc.nextInt();
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                if (i == 0 || j == 0 || i == (n - 1) || j == ( n - 1)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
