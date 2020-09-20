package Sep13;

/***
 * Tìm số lần xuất hiện của một chuỗi trong 1 chuỗi khác
 */
public class bai6 {
    public static int isExist(String a, String b) {
        int count = 0;
        for (int i = 0; i <= a.length() - b.length(); i++) {
            if (Appear(a, b, i)) {
                count = count + 1;
            }
        }
        return count;

    }

    public static boolean Appear(String x, String y, int index) {
        for (int i = 0; i < y.length(); i++) {
            if (x.charAt(i + index) != y.charAt(i)) return false;
        }
        return true;
    }
}


