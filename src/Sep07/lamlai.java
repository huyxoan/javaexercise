package Sep07;

/*
 * Viết chương trình nhập vào một chuỗi và tìm chuỗi con dài nhất có tất cả các ký tự không giảm
 */

import java.util.Scanner;

public class lamlai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot chuoi bat ky : ");
        String str = sc.nextLine();
        String max = "" ;
        for(int i = 0 ; i < str.length();i++){
            int j = i ;
            while (j < str.length()-1 && str.charAt(j) <= str.charAt(j+1)){
                j++ ;
            }
            if( j - i > max.length()){
                max = str.substring(i , j+1);
            }
        }
        System.out.println("Chuoi con dai nhat la : " +max);
    }
}
