package Sep05;

import java.util.Scanner;

public class ChuoiXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi lon: ");
        String big = sc.nextLine();

        System.out.print("Nhap chuoi be: ");
        String small = sc.nextLine();

        int count = 0;

        for (int i = 0; i <= big.length() - small.length(); i++) {
            if (isAppearAt(big, small, i)) {
                count++;
            }
        }

        System.out.println("Xuat hien " + count + " lan");
    }

    private static boolean isAppearAt(String a, String b, int index) {
        for (int i = 0; i < b.length(); i++) {

            if (Character.toLowerCase(a.charAt(i + index)) == Character.toLowerCase(b.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}
