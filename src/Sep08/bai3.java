package Sep08;
/***
 *  Nhập số nguyên n, kiểm tra xem tổng các chữ số của n có phải là một số nguyên tố
 */

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot so nguyen : ");
        int n = sc.nextInt();
        int p = 0;
        while (n > 0) {
            p = p + n % 10;
            n /= 10;
        }
        if (KT(p)) {

            System.out.println("La so nguyen to ");
        } else {
            System.out.println("Khong la so nguyen to ");
        }
    }

    /*  for(int i = 1 ; i*i < p; i++){
          if(p%i==0) {
              System.out.println("Khong phai so nguyen to ");
          } else{
              System.out.println("la so nguyen to");
          }
      }
     */
    static boolean KT(int a) {
        if (a < 2) return false;
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) return false;
        }
        return true;
    }
}

