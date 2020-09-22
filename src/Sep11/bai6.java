package Sep11;

import java.util.Scanner;

/***
 * Nhập vào một mảng, sắp xếp mảng này sao cho tất cả các số chẵn nằm bên trái,
 * số lẻ nằm bên phải (không quan trọng thứ tự của các số chẵn với nhau, số lẽ với nhau)
 */
public class bai6 {
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
                    //change(arr[k] ,arr[j]);
                    int tmp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = tmp;
                }
                i--;
            }
        }


        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                int min = i;
                for (int j = i + 1; j < n; j++)
                    if (arr[min] > arr[j] && arr[j] % 2 == 0) min = j;
                // change(arr[min] , arr[i]);
                int tmp = arr[min];
                arr[min] = arr[i];
                arr[i] = tmp;
            } else {
                int min = i;
                for (int j = i + 1; j < n; j++)
                    if (arr[min] < arr[j] && arr[j] % 2 != 0) min = j;
                // change(arr[min], arr[i]);
                int tmp = arr[min];
                arr[min] = arr[i];
                arr[i] = tmp;
            }

        }


        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }

    //static void change(int x, int y) {
    //  int q = x;
    //x = y;
    //y = q;
    //}
}