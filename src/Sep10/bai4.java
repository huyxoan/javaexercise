package Sep10;

import java.util.Scanner;

/***
 * Viết chương trình nhập vào một mảng số nguyên,
 * in ra giá trị lớn nhất khi cộng nhiều phần tử liên tiếp với nhau
*/
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int summax = 0 ;
        for (int i = 0; i < n; i++) {
            System.out.print("A[ " + i + " ] = ");
            arr[i] = sc.nextInt();
        }
        for (int i = 2; i < n ; i++) {
           if(Tong(arr,n,i)> summax){
               summax = Tong(arr,n,i);
           }
        }
        System.out.println(summax);
    }

    static int Tong(int[] a, int n, int k) {
        int max = 0 ;
        int s = 0 ;
        for(int j=0;j<=n-k;j++)
        {
            s=0;
            for(int i=j;i<j+k;i++)
            {
                s=s+a[i];
            }
            if(s>max)
            {
                max=s;
            }
        }
        return max ;
    }
}

