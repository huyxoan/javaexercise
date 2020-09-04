package Sep01;

import java.util.Scanner;

public class lamlai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen : ");
        int n = sc.nextInt();
        while ( !doixung(n)){
            n++;
        }
        System.out.println("Ket qua la : " +n);
        /*
        for (int i = n; true; i++) {
            if (doixung(i)){
                System.out.println("Ket qua la : " +i);
                return ;
            }
        }

         */
    }
    static int  songhich(int n ){
        int a = 0 ;
        while (n>0){
            a = a*10 + n%10;
            n /= 10 ;
        }
        return a ;
    }
    static boolean doixung(int n){
        return n == songhich(n);
    }
}

}
