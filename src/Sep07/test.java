package Sep07;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot chuoi bat ky : ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char kytu = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if (kytu < str.charAt(j)) {
                    sb.append(kytu);
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
