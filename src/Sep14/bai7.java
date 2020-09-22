package Sep14;

import java.util.Scanner;

public class bai7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot so nguyen nho hon 4000 : ");
        int n = sc.nextInt();
        System.out.println("Gia tri cua so la ma la : " + toRoman(n));
    }

    public static String toRoman(int i){
        int hangdonvi = i%10;
        int hangchuc = (i%100)/10;
        int hangtram = (i%1000)/100;
        int hangnghin = (i%10000)/1000;
        return (romanLogic(hangnghin, "M","","")+
                romanLogic(hangtram,"C","D","M")+
                romanLogic(hangchuc,"X","L","C")+
                romanLogic(hangdonvi,"I","V","X"));
    }

  public static String romanLogic(int i, String ones, String fives, String tens){
        String result = "";
        if (i == 0){
            return result;
        } else {
            if ((i>=4)&&(i<=8)){
                result += fives;
            }
            if (i==9){
                result += tens;
            }
            if(i%5 < 4){
                while(i%5 > 0){
                    result += ones;
                    i--;
                }
            }
            if(i%5 == 4){
                result = ones + result;
            }
        }
        return result;
    }
}
