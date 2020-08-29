import java.util.Scanner;

public class tesst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot chuoi bat ky : ");
        String str = sc.nextLine();
        System.out.print("Cac ki tu trong chuoi la : ");

        boolean flag = true ;
        for(int i =0;i<str.length();i++){
            char kytu = str.charAt(i);

            for(int j =i+1;j<str.length();j++) {
                if (str.charAt(j) == kytu) {
                    flag = false;
                }
                if (flag) {
                    System.out.print(kytu);
                }
            }
        }

    }
}
