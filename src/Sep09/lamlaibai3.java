package Sep09;
/***
 *   3.Viết chương trình in ra các số xuất hiện trong một chuối, mỗi số in ra trên một dòng
 *  *
 *  * Ví dụ nếu nhập `abc 123 def` thì phải in ra
 */

import java.util.Scanner;

public class lamlaibai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot chuoi bat ky : ");
        String str = sc.nextLine();
        boolean KT = false;
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                num = num * 10 + str.charAt(i) - '0';
               KT = true ;
            } else {
                if (KT) {
                    System.out.println(num);
                    num = 0;
                  KT = false;
                }
            }
        }
        if (KT) {
            System.out.println(num);
        }
    }
}
