package Sep14;

/***
 *Tìm chuỗi con không giảm dài nhất trong chuỗi
 */
public class bai1 {
    public static String maxString(String str) {
        String chuoicon = "";
        for (int i = 0; i < str.length(); i++) {
            int j = i;
            while (j < str.length() && str.charAt(j) <= str.charAt(j + 1)) {
                j++;
            }
            if (j - i > chuoicon.length()) {
                chuoicon = str.substring(i, j + 1);
            }
        }
        return chuoicon ;
    }
}