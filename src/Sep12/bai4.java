package Sep12;

/***
 * Viết chương trình nhập vào xa, ya, xb, yb, xc, yc, xd, yd là tọa độ của A, B, C, D.
 * Xác định xem tam giác ABC có chứa điểm D hay không
 */
public class bai4 {
    public static boolean KT(double xa , double ya ,
                            double xb , double yb ,
                            double xc , double yc ,
                            double xd , double yd ) {


        double a = Common.distance(xa,ya,xb,yb) ;
        double b = Common.distance(xb,yb,xc,yc);
        double c = Common.distance(xa,ya,xc,yc) ;
        if( a >= b + c || b >= a + c || c >= a + b ) return false ;
        else{
            double x = (xd-xa)*(xb-xa)-(yd-ya)*(yb-ya);
            double y = (xd-xb)*(xc-xb)-(yd-yb)*(yc-yb);
            double z = (xd-xc)*(xa-xc)-(yd-yc)*(ya-yc);
            if(x*y*z > 0 ) return false ;
        }
        return true ;
    }
}
