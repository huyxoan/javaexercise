package Sep09;

import java.util.Scanner;

/***
 * Một chuỗi IP address luôn có dạng a.b.c.d trong đó 0 <= a, b, c, d <= 255.
 * Nhập vào một chuỗi IP address, kiểm tra xem nó có hợp lệ hay không
 */
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot chuoi bat ky: ");
        String str = sc.nextLine();
        System.out.println(KT(str));
    }

    static boolean KT(String ipAddress) {
        String[] numbers = ipAddress.split("\\.");

        if (numbers.length != 4) {
            return false;
        }

        for (int i = 0; i < numbers.length; i++) {
            int num = 0;
            String number = numbers[i];

            for (int j = 0; j < number.length(); j++) {
                if (Character.isDigit(number.charAt(j))) {
                    num = 10 * num + number.charAt(j) - '0';
                } else {
                    return false;
                }
            }
            if (num > 255) {
                return false;
            }
        }

        return true;
    }
}

//CHEP 5 LAN

