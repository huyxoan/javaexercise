package Sep09;

import java.util.Scanner;

/***
 * 1. Viết chương trình kiểm tra một chuỗi có phải là gần đối xứng hay không.
 * Chuỗi được gọi là gần đối xứng nếu ta xóa 1 ký tự từ chuỗi thì ta sẽ có được 1 chuỗi đối xứng.
 *
 * Ví dụ `abcb` là chuỗi bán đối xứng vì bỏ đi chữ `a` thì ta được chuỗi đối xứng `bcb`,
 * tương tự `abca` cũng bán đỗi xứng vì bỏ đi chữ `b` thì ta được `aca` là đối xứng
 * abcbax
 * bcb
 */
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot chuoi bat ky : ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            String after = str.substring(0, i) + str.substring(i + 1);
            if (checkDoiXung(after)) {
                System.out.println("Chuoi phu hop");
                return;
            }
        }

        System.out.println("Chuong ko phu hop");
    }

    static boolean checkDoiXung(String a) {
        for (int i = 0, j = a.length() - 1; i < j; i++, j--) {
            if (a.charAt(i) != a.charAt(j)) return false;
        }
        return true;
    }
}

//// CHEP 5 LAN

