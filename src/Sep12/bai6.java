package Sep12;

public class bai6 {
    public static double chuvi(double xa, double ya,
                               double xb, double yb,
                               double xc, double yc,
                               double xd, double yd) {
        double a = Common.distance(xa, ya, xb, yb);
        double b = Common.distance(xb, yb, xc, yc);
        double c = Common.distance(xc, yc, xd, yd);
        double d = Common.distance(xa, ya, xd, yd);
        return a + b + c + d;
    }
}
