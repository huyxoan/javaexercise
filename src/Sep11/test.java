package Sep11;
/***
 * Nhập vào một mảng, sắp xếp mảng này sao cho tất cả các số chẵn nằm bên trái,
 * số lẻ nằm bên phải (không quan trọng thứ tự của các số chẵn với nhau, số lẽ với nhau)
 */

import java.util.Scanner;

public class test {
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
            if (arr[i] % 2 == 0) {
                int k = i;
                for (int j = 0; j < n; j++) {
                    change(arr[k], arr[j]);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                int k = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[k] > arr[j] && arr[j] % 2 == 0) {
                        k = j;
                        change(arr[k], arr[i]);
                    }
                }
            } else {
                int k = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[k] < arr[j] && arr[j] % 2 != 0) {
                        k = j;
                        change(arr[k], arr[i]);
                    }
                }
            }
        }
        System.out.println("Mang sau khi sap xep la : ");
        for (int i = 0; i < n; i++) {
            System.out.println("%d  " + arr[i]);
        }
    }

    static void change(int x, int y) {
        int q = x;
        x = y;
        y = q;
    }
}
