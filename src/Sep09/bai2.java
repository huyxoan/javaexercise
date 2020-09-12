package Sep09;

import java.util.Scanner;

/*
. Viết chương trình sửa lỗi chữ hoa chữ thường theo quy tắc: ký tự bắt đầu câu phải viết hoa, nếu không thì phải viết thường.
  Quy ước các câu sẽ phân biệt nhau bởi dấu chấm và chấm hỏi
Ví dụ:
abc. def ghi --> Abc. Def ghi
ABC? def ghi. xYZ --> Abc? Def ghi. Xyz
*/
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot chuoi bat ky : ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        boolean startSentence = true;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '.' || ch == '?'){
                startSentence = true;
            }

            if(Character.isDigit(ch) || Character.isLetter(ch)){
                if(startSentence){
                    sb.append(Character.toUpperCase(ch));
                    startSentence = false;
                }else{
                    sb.append(Character.toLowerCase(ch));
                }
            }else{
                sb.append(ch);
            }
        }

        System.out.println(sb);
    }
}

// CHEP 5 LAN
