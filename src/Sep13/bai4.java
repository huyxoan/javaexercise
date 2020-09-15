package Sep13;

/***
 * Tìm ước chung lớn nhất của 2 số nguyên
 */
public class bai4 {
    public static int UCLN(int a, int b) {
        if (b == 0) return a;
        return UCLN(b, a % b);
    }

    public static int BCNN(int x, int y) {
        return (x * y) / UCLN(x, y);
    }
}
