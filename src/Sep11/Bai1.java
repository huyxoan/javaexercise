package Sep11;

/**
 * 1. Nhập vào một mảng số nguyên, đảo ngược mảng này mà không dùng mảng phụ rồi in ra
 */
public class Bai1 {
    public static void invert(int[] array){
        for(int i=0, j=array.length-1; i<j; i++, j--){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
