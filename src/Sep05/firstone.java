package Sep05;
/***
 * Nhập vào chuỗi s, trả về chuỗi mới bằng cách gấp đôi
 * từng ký tự một. Ví dụ abcd thành aabbccdd, Hello123
 * thành HHeelloo112233
 */

import java.util.Scanner;

public class firstone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot chuoi bat ky : ");
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i<str.length();i++){
            char kytu = str.charAt(i);
            sb.append(kytu);
            sb.append(kytu);
        }
        System.out.println("Ket qua la : " +sb);
    }
}
