package Sep01;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a1 = ");
        double a1 = sc.nextDouble();
        System.out.println("Nhap b1 = ");
        double b1 = sc.nextDouble();
        System.out.println("Nhap c1 = ");
        double c1 = sc.nextDouble();
        System.out.println("Nhap a2 = ");
        double a2 = sc.nextDouble();
        System.out.println("Nhap b2 = ");
        double b2 = sc.nextDouble();
        System.out.println("Nhap c2 = ");
        double c2 = sc.nextDouble();
        double x = 0;
        double y = 0;
        double D = a1 * b2 - a2 * b1;
        double Dx = c1 * b2 - c2 * b1;
        double Dy = a1 * c2 - a2 * c1;
        if (D == 0) {
            if (Dx*Dx + Dy*Dy == 0) {//Dx == 0 && Dy == 0
                System.out.println("Phuong trinh vo so nghiem ");
            } else {
                System.out.println("Phuong trinh vo nghiem ");
            }
        } else {
            x = Dx / D;
            y = Dy / D;
        }

        System.out.println("Nghiem cua phuong trinh la : " + "x = " + x + " y = " + y);
    }
}

