package Sep09;
/**
 * Viết chương trình sửa lỗi chữ hoa chữ thường theo quy tắc: ký tự bắt đầu câu phải viết hoa, nếu không thì phải viết thường.
 * Quy ước các câu sẽ phân biệt nhau bởi dấu chấm và chấm hỏi
 */

import java.util.Scanner;
public class lamlaibai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot chuoi bat ky : ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        boolean statement = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '.' || ch == '?') {
                statement = true;
            }
            if (Character.isLetter(ch)) {
                if (statement) {
                    sb.append(Character.toUpperCase(ch));
                    statement = false;
                } else {
                    sb.append(Character.toLowerCase(ch));
                }
            } else {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}

