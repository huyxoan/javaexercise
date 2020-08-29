package Aug29;

import java.util.Scanner;

/***
 * Nhập vào chuỗi s, trả về chuỗi mới bằng cách gấp đôi
 * từng ký tự một. Ví dụ abcd thành aabbccdd, Hello123
 * thành HHeelloo112233
 */
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap mot chuoi bat ky : ");
        String str = sc.nextLine();

        StringBuffer sb = new StringBuffer();
        for(int i = 0 ;i<str.length();i++){
            char kytu = str.charAt(i);
            sb.append(kytu);
            sb.append(kytu);
        }

        System.out.println(sb);
    }
}
