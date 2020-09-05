package Sep05;

import java.util.Scanner;

/*
        * 6. Nhập vào một chuỗi có thể chứa các số nguyên trộn lẫn với các ký tự khác. Tính tổng các số nguyên xuất hiện:
        * Ví dụ: chuỗi = "123 abcd 4.5 def 77" --> Kết quả là 123 + 4 + 5 + 77 = 209
        */

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot bat ky : " );
        String str = sc.nextLine();
        System.out.println(KT(str));

    }

    private static int KT(String str) {
        int number = 0;
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                number = number * 10 + str.charAt(i) - 48;
            } else {
                sum += number;
                number = 0;
            }
        }
        return sum + number;
    }
}
