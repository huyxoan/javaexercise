package Sep07;

import java.util.Scanner;

/***
 * Viết chương trình nhập vào một chuỗi, tìm chuỗi con đối xứng dài nhất

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot chuoi bat ky : ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        int start = 0 ;
        int max = 1 ;
        for(int i = 0 ; i < str.length();i++){
            int a = i ;
            int b = i ;
            int new = 0 ;
            while (a < str.length() && str.charAt(a) == str.charAt(a+1)){
                a++ ;
            }
            i = a + 1 ;
            while (b < str.length() && str.charAt(a+1) == str.charAt(b -1) && b > 0 ){
                b--;
                a++;
            }
             new = a - b + 1 ;
            if(new > max ){
                max = new ;
                start = i ;
            }
        }
            return str.substring(start , max );
        }
}
 */
