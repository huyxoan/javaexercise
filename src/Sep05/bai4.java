package Sep05;

import java.util.Scanner;

/***
 * Nhập vào chuỗi s và số tự nhiên n, trả về chuỗi mới bằng cách nhân bản
 * từng ký tự trong chuỗi s lên n lần. Ví dụ nhập chuỗi s = abc và n=3 thì
 * cần in ra aaabbbccc
 */
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap mot chuoi bat ky : ");
        String str = sc.nextLine();

        System.out.print("Nhap mot so bat ky : ");
        int n = sc.nextInt();

        StringBuffer sb = new StringBuffer();

        for(int i=0;i<str.length();i++){
            char kytu = str.charAt(i);
            for(int j=0;j<n;j++){
                sb.append(kytu);
            }
        }

        System.out.println(sb);

    }
}
