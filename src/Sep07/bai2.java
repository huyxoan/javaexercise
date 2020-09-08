package Sep07;

import java.util.Scanner;

/*
 * Viết chương trình nhập vào một chuỗi và tìm chuỗi con dài nhất có tất cả các ký tự không giảm
*/

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot chuoi bat ky : ");
        String str = sc.nextLine();
        for(int i = 0 ; i < str.length();i++) {
            int start = 0 ;
            int max = 1 ;
            int j = i ;
            while (str.charAt(j) < str.charAt(j+1)){
                j++ ;
                break;
                }
            int new = j - i + 1 ;
            if(new > max ){
                max = new ;
                start = i ;
            }
            return str.substring(start , max )
            }
    }
    }







