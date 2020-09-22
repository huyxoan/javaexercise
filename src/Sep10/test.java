package Sep10;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("So phan tu: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Array[" + i + "] = ");
            array[i] = sc.nextInt();
        }
        int c = 0;
        for (int i = 0 ; i < n; i++) {
            if (array[i] % 2 == 0) {
                c++;
            }
        }


        int[] ch = new int[c];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                ch[j] = array[i];
                j++ ;
            }
        }

        System.out.println("Cac phan tu mang chan la : ");
        for (int i = 0; i < c; i++) {
            System.out.printf("%d  ",ch[i]);
        }
    }
}
