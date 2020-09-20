package Sep13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class bai9test {
    @Test
    public void test(){
        int[] arr = new int[]{1,2,3,4,5,6,7};
        Assertions.assertEquals(bai9.maxchan(arr),6);
    }
}
