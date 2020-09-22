package Sep13;

public class bai5 {
    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
    public static int BCNN(int x , int y){

        return (x*y) / USCLN(x,y) ;
    }
}
