package Sep13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class bai10test {
    @Test
    public void test(){
        int[] a = new int[]{1,7,8,4,6,3,5,6};
        Assertions.assertEquals(bai10.songuyento(a),7);

    }
}
