package Sep06;
/***
 * . Nhập vào hai số a, b. Kiểm tra xem 2 số a, b có phải là 2 số nguyên tố cùng nhau hay không.
 */

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a : ");
        int a = sc.nextInt();
        System.out.print("Nhap b : ");
        int b = sc.nextInt();

        while (a > 0 && b > 0){
            if(a > b){
                a %= b;
            }
            else{
                b %= a;
            }

            System.out.println(a + "   " + b);
        }


        if (a + b == 1) {
            System.out.println(" La hai so nguyen to cung nhau  ");
        } else {
            System.out.println("Khong phai la hai so nguyen to cung nhau");
        }
    }
}


