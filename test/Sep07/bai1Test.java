package Sep07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class bai1Test {
    @Test
    public void test(){
        Assertions.assertTrue(bai1.checkNotDecreasing("12345"));
        Assertions.assertTrue(bai1.checkNotDecreasing("1"));
        Assertions.assertTrue(bai1.checkNotDecreasing(""));
        Assertions.assertTrue(bai1.checkNotDecreasing("1123445"));

        Assertions.assertFalse(bai1.checkNotDecreasing("10"));
        Assertions.assertFalse(bai1.checkNotDecreasing("1012345"));
        Assertions.assertFalse(bai1.checkNotDecreasing("1234012345"));
    }
}
