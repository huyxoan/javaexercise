package Sep05;
/***
 * Nhập vào chuỗi s, tìm số lượng ký tự phân biệt xuất hiện trong chuỗi.
 * Ví dụ nhập vào Hello thì in ra 4 vì có 4 ký tự phân biệt xuất hiện trong chuỗi là H e l o
 */
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot chuoi bat ky : ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char kytu = str.charAt(i);
            boolean KT = true;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == kytu) {
                    KT = false;
                    break;
                }
            }
            if (KT) {
                System.out.println(KT);
            }
        }
    }
}
