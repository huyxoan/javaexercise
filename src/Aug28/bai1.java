package Aug28;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot chuoi bat ky : ");
        String str = sc.nextLine();
        String[] str1 = str.split(" ");
        int max = 0;
        int index = 0 ;
        for(int i = 0;i < str1.length(); i++) {
            int b = str1[i].length();
            if(b>max){
                max = b ;
                index = i ;
            }
        }
        System.out.print("Tu dai nhat la : " + str1[index]);
    }
}

