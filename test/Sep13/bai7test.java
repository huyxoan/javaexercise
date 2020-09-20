package Sep13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class bai7test {
    @Test
    public void test(){
        int[] a = new int[]{131};
        Assertions.assertTrue(bai7.doixung(a), String.valueOf(131));
    }
}
