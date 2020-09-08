package Sep05;

import java.util.Scanner;

public class test {
    public static double squareRoot( double number) {
        double temp;

        double sr = number / 2;

        do {
            temp = sr;
            sr = (temp + (number / temp)) / 2;
        } while ((temp - sr) != 0);

        return sr;
    }
    public static void main(String[] args)
    {
        System.out.print("Nhập vào số num:");
        Scanner scanner = new Scanner(System.in);
         double num = scanner.nextDouble();
        scanner.close();
        System.out.println("Căn bậc hai của "+ num+ " là: "+squareRoot(num));
    }
}
