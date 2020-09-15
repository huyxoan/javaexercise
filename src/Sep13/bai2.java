package Sep13;

/***
 * Kiểm tra một số có phải là đối xứng
 */
public class bai2 {
    public static int songhich(int n) {
        int p = 0;
        while (n > 0) {
            p = p * 10 + n % 10;
            n /= 10;
        }
        return p;
    }

    public static boolean KT(int n) {
        return (n == songhich(n));
    }
}
