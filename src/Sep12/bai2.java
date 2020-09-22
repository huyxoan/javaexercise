package Sep12;

/***
 * Viết chương trình nhập vào cx1, cy1, r1, cx2, cy2, r2 tương ứng là tọa độ tâm và bán kính của hình tròn C1, C2.
 * Kiểm tra 2 hình tròn này có điểm chung hay không


public class bai2 {
    public static boolean Commonpoint(double cx1 , double cy1 , double r1 ,
                                     double cx2 , double cy2 , double r2 ) {

        double Distance = Common.distance(cx1 ,cy1,cx2,cy2);
        double Tong = r1 + r2 ;
        double Hieu = Math.abs(r1,r2);
        if(Distance == 0 && Hieu == 0) return true ;
        if(Tong == Distance || Hieu == Distance ) return true ;
        if(Tong > Distance && Hieu < Distance) return true ;
        if(Hieu > Distance) return false ;
        if(Tong < Distance) return false ;
    }

}
 */