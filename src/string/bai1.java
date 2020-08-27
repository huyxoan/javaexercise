package string;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot chuoi bat ky : ");
        String str = sc.nextLine();
        int count = 0;

        for(int i = 0 ; i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                count ++ ;
            }
        }

        System.out.println("So ki tu la : " + count );
    }
}
