package Sep06;

import java.util.Scanner;

/***
 *  Nhập số thực n, tính căn bậc 2 của n bằng phương pháp chia đôi với độ chính xác 0.00001,
 */
public class bai4 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot so thuc : ");
        double n = sc.nextDouble();
        sc.close();
        System.out.println("Ket qua can bac 2 cua so " + n + " la " + square(n));*/

        //System.out.println(square(3));
        System.out.println(chiadoi(1));
    }

    static double square(double x) {
        double a = 0;
        double b = x / 2;
        do {
            a = b;
            b = a/2 + x / (a * 2);
        } while (a - b != 0);

        return b;
    }

    static double chiadoi(double x){
        double a = 0;
        double b = x;

        if(b < 1){
            b = 1;
        }

        while (b - a >= 0.0000000001){
            System.out.println(a + "  " + b);
            double middle = (a + b)/2;
            if(middle * middle < x){
                a = middle;
            }else{
                b = middle;
            }
        }

        return b;
    }
}
