package Sep07;
/***
 *  Viết chương trình nhập vào một chuỗi và kiểm tra chuỗi đó có đối xứng hay không
 */

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot chuoi bat ky : ");
        String str = sc.nextLine();
                System.out.println(hoanvi(str));
            }


    static boolean hoanvi(String a) {
        for (int i = 0; i < a.length()/2; i++) {
                if(a.charAt(i) != a.charAt(a.length()-i-1)) return false ;
            }
                return true;
    }
}


