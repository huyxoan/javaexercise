package Sep01;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NHap so nguyen n : ");
        int n = sc.nextInt();
        int a = 1 ;
        int b = 1 ;
        int temp = 2 ;
        while (n <=2){
            System.out.println("Moi ban nhap lai : ");
            return ;
        }
        for (int i=3;i<n;i++){
            int c = a + b ;
            temp += c ;
              a = b ;
              b = c ;
        }
        System.out.println("Ket qua la : " +temp );
    }
}
