package Sep14;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so la ma: ");
        String input = sc.nextLine();

        int sum = 0;
        while (input.length() > 0) {
            for (int i = 0; i < token.length; i++) {
                if (input.startsWith(token[i])) {
                    sum = sum + values[i];
                    input = input.substring(token[i].length());
                    break;
                }
            }
        }

        System.out.println("Ket qua la: " + sum);
    }

    private static String[] token = new String[]{
            "IV",
            "IX",
            "XL",
            "XC",
            "CD",
            "CM",
            "I",
            "V",
            "X",
            "L",
            "C",
            "D",
            "M"
    };

    private static int[] values = new int[]{
            4, //"IV",
            9, //"IX",
            40, //"XL",
            90, //"XC",
            400, //"CD",
            900, //"CM",
            1, //"I",
            5, //"V",
            10, //"X",
            50, //"L",
            100, //"C",
            500, //"D",
            1000, //"M"
    };
}
