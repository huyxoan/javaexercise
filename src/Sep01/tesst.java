package Sep01;

import java.util.Scanner;

public class tesst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot chuoi bat ky : ");
        String str = sc.nextLine();
        System.out.print("Cac ki tu trong chuoi la : ");

        for (int i = 0; i < str.length(); i++) {//100
            if (!isFound(str, i - 1, str.charAt(i))) {//sai 10 lan
                System.out.print(str.charAt(i));// in ra 90
            }
        }
    }

    static boolean isFound(String s, int lastIndex, char ch){
        for(int i=0;i<= lastIndex; i++){
            if(s.charAt(i) == ch){
                return true;
            }
        }
        return false;
    }

    static boolean isFoundDeQuy(String s, int lastIndex, char ch){
        if(lastIndex < 0) return false;
        return s.charAt(lastIndex) == ch || isFound(s, lastIndex-1, ch);
    }
}


