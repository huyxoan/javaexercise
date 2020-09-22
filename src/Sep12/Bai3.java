package Sep12;

/***
 * 3. Viết chương trình nhập vào xa, ya, xb, yb, xc, yc là tọa độ của các điểm A, B, C.
 *
 * - Tính chu vi tam giác ABC
 * - Tính diện tích tam giác ABC

public class Bai3 {
    public static double chuvi(double xa, double ya,
                               double xb, double yb,
                               double xc, double yc) {

        double a = Common.distance(xb, yb, xc, yc);
        double b = Common.distance(xa, ya, xc, yc);
        double c = Common.distance(xb, yb, xa, ya);

        return a + b + c;
    }

    public static double chuvi(double xa, double ya,
                               double xb, double yb,
                               double xc, double yc) {

        double a = Common.distance(xb, yb, xc, yc);
        double b = Common.distance(xa, ya, xc, yc);
        double c = Common.distance(xb, yb, xa, ya);

        double p = (a + b + c) / 2;
        return Math.sqrt(p(p - a) (p - b)(p - c));

    }
}
 */