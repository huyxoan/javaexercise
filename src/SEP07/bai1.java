package SEP07;

import java.util.Scanner;

/***
 * Viết chương trình nhập vào một chuỗi và
 * kiểm tra các ký tự trong chuỗi có phải không giảm (tức là tăng dần hoặc ký tự sau = ký tự liền trước) hay không.
 */
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot chuoi bat ky : ");
        String str = sc.nextLine();
        System.out.println("ket qua la " + KT(str));
    }

    public static boolean KT(String str) {
        for (int i = 0; i < str.length(); i++) {
            char kytu = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if ( str.charAt(j) < kytu) return false;
            }
        }
        return true;
    }
}

