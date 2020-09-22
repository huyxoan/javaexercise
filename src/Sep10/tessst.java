package Sep10;

import java.util.Scanner;

public class tessst {
    public static void main(String[] args) {
        int[] a = new int[]{1,3,2,-2,-5,-4,9,1};
        int k = 3 ;
        int sum = 0 ;
        int max = 0 ;
        for(int i = 0 ; i <= a.length - k ; i++){
            sum = 0 ;
            for(int j = i ; j < i + k ; j++){
                sum = sum + a[j];
            }
            if(sum > max){
                max = sum ;
            }
        }
        System.out.println(max);
    }
}
