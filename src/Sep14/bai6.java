package Sep14;

import java.util.Scanner;

/**
 * Chuyển một số nguyên sang số la mã
 */
public class bai6 {
    public static int romanToInteger(String roman) {

        int sum = 0 ;

        while (roman.length() > 0){
            for(int i = 0 ; i < tokens.length;i++){
                if(roman.startsWith(tokens[i])){
                    sum += value[i];
                    roman = roman.substring(tokens[i].length());
                    break;
                }
            }
        }
        return sum;
}
   private static String[] tokens = new String[]{
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
    static int[] value = new int[]{
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
            1000
    };
}
