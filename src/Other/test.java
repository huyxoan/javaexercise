package Other;

import java.util.Scanner;

public class test {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap a: ");
            String a = sc.nextLine();

            System.out.print("Nhap b: ");
            String b = sc.nextLine();

            int count = 0;
            for(int i = 0; i<b.length(); i++){
                if(isExistAt(a, b, i)){
                    count++;
                }
            }

            System.out.println("Xuat hien so lan la  " + count);
        }

        //a 1234
        //b 5567622
        //index = 2
        static boolean isExistAt(String a, String b, int index){
            for(int j=0; j<a.length(); j++){
                if(j + index >= b.length()){
                    return false;
                }
                if(a.charAt(j) != b.charAt(index + j)){
                    return false;
                }
            }
            return true;
        }
    }

