package Sep12;

/***
 * Viết chương trình nhập vào xa, ya, xb, yb, xc, yc, xd, yd là tọa độ của A, B, C, D
 *
 * Tính chu vi ,dien tich tứ giác ABCD
 */
public class bai5 {
    public static double dientich(double xa , double ya,
                             double xb , double yb,
                             double xc , double yc,
                             double xd,  double yd ){
        double a = Common.distance(xa,ya,xb,yb);
        double b = Common.distance(xb,yb,xc,yc);
        double c = Common.distance(xc,yc,xd,yd);
        double d = Common.distance(xa,ya,xd,yd);
        double p = (a + b + c + d)/2 ;
        return Math.sqrt((p-a)*(p-b)*(p-c)*(p-d));
    }
}
