package Sep11;

import java.util.Scanner;

/***
 * Nhập vào một mảng, sắp xếp mảng này sao cho tất cả các số chẵn nằm bên trái,
 * số lẻ nằm bên phải (không quan trọng thứ tự của các số chẵn với nhau, số lẽ với nhau)
 */
public class tét {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen n : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((arr[i] % 2 != 0) && (arr[j] % 2 == 0) || (arr[i] % 2 == 0 && arr[j] % 2 == 0))
                    change(arr[i], arr[j]);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    {
                        if (arr[j] == 0)
                            break;
                    }if(arr[j] != 0){
                        change(arr[i], arr[j]);
                    }
                }
            }
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = i - 1; j > 0; j--) {
                if ((arr[i] > arr[j]) && arr[j] % 2 != 0)
                    change(arr[i], arr[j]);
            }
        }
    }


    static void change(int a, int b) {
        int c = a;
            a = b;
            b = c;
    }

}
