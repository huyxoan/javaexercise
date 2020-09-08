package Sep08;
/***
 * Nhập số nguyên n, tính tổng của tất cả các số nhỏ hơn hoặc bằng n
 */

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen : ");
        int n = sc.nextInt();
        int sum = 0 ;
        for(int i = 0 ; i <= n ; i++){
            sum += i ;
        }
        System.out.println("Tong la " +sum);
    }
}
