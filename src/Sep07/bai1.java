package Sep07;

import java.util.Scanner;

/***
 * Viết chương trình nhập vào một chuỗi và
 * kiểm tra các ký tự trong chuỗi có phải không giảm (tức là tăng dần hoặc ký tự sau = ký tự liền trước) hay không.
 */
public class bai1 {
    public static boolean checkNotDecreasing(String str) {
        for (int i = 1; i < str.length(); i++) {
            char kytu = str.charAt(i);
            if(kytu < str.charAt(i-1)) return false;
        }
        return true;
    }
}

