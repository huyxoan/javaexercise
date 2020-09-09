package Sep07;
/***
 * Viết chương trình nhập vào một chuỗi, tìm chuỗi con đối xứng dài nhất
 */

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap mot chuoi bat ky : ");
        String str = sc.nextLine();
        String max = "" ;
        for(int i = 0 ; i < str.length();i++ ){
            int j = i ;
            while ( j < str.length()-1  && str.charAt(j) == str.charAt(str.length()-j-1)){
                j++ ;
            }
            if(j - i > max.length()){
                max = str.substring(i , j);
            }
        }
        System.out.println(max);
    }
}
