package Aug29;

import java.util.Scanner;

/***
 * Nhập vào chuỗi s, tìm số lượng ký tự phân biệt xuất hiện trong chuỗi.
 * Ví dụ nhập vào Hello thì in ra 4 vì có 4 ký tự phân biệt xuất hiện trong chuỗi là H e l o
 */
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot chuoi bat ky : ");
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char kytu = str.charAt(i);
            boolean flag = true;

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == kytu) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                count++;
            }
        }

        System.out.println("So luong ky tu phan biet la " + count);
    }
}
