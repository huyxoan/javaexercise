package Sep09;

import java.util.Scanner;

/***
 * 3.Viết chương trình in ra các số xuất hiện trong một chuối, mỗi số in ra trên một dòng
 *
 * Ví dụ nếu nhập `abc 123 def` thì phải in ra
*/
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot chuoi bat ky : ");
        String str = sc.nextLine();

        boolean hasNumber = false;
        int number = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                number = number * 10 + str.charAt(i) - '0';
                hasNumber = true;
            } else {
                if (hasNumber) {
                    System.out.println(number);
                    hasNumber = false;
                    number = 0;
                }
            }
        }

        if (hasNumber) {
           System.out.println(number);
        }
    }
}

// CHEP 5 LAN

