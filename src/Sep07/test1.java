package Sep07;

import java.util.Scanner;

/***
 * Viết chương trình nhập vào một chuỗi, tìm chuỗi con đối xứng dài nhất
*/


public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot chuoi bat ky : ");
        String str = sc.nextLine();


        String max = "" ;
        for(int i = 0 ; i < str.length();i++){
            int a = i ;
            int b = i ;
            while (a < str.length()-1 && str.charAt(a) == str.charAt(a+1)){
                a++ ;
            }
            i = a + 1 ;
            while (b < str.length()-1 && str.charAt(a+1) == str.charAt(b -1) ){
                b--;
                a++;
            }
            if(a-b > max.length()){
                max = str.substring(b,a+1);
            }
        }
        System.out.println(max);
        }
}

