import java.util.Scanner;
/*
Bài tập Java - Liệt kê số lần xuất hiện của các phần tử trong một mảngBài tập Java - Sắp xếp mảng theo thứ tự giảm dần
*/

public class sep06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot so nguyen  : ");
        int n = sc.nextInt();
        int s = 0 ;
        for(int i = 0 ; i < n ; i++ ){
            if(n%i==0){
                s += i ;
            }
        }
        System.out.println("Ket qua la " +s);
    }
}
