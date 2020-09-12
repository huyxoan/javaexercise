package Sep09;
/***
 *   Một chuỗi IP address luôn có dạng a.b.c.d trong đó 0 <= a, b, c, d <= 255.
 *   Nhập vào một chuỗi IP address, kiểm tra xem nó có hợp lệ hay không
 */

import java.util.Scanner;

public class lamlaibai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot chuoi bat ky : ");
        String str = sc.nextLine();
        System.out.println(KT(str));
        }
        static boolean KT(String a){
        String[] number = a.split("\\.");
        if(number.length != 4){
            return false ;
        }
        for(int i = 0 ; i < number.length ; i++ ) {
            int num = 0;
            String numbers = number[i];
            for (int j = 0; j < numbers.length(); j++) {
                if (Character.isDigit(numbers.charAt(j))) {
                    num = num * 10 + numbers.charAt(j) - '0';
                } else {
                    return false;
                }
            }
            if (num > 255) {
                return false;
            }
        }
        return true ;
    }
}
