package Sep01;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n : ");
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
    static int fibo(int n ){
        if(n<=2 ) return 1 ;
        else return fibo(n-1) +fibo(n-2);
    }
}
