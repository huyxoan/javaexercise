package Sep14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class bai1test {
    @Test
    public void test(){
        String str = "1234567abc";
        Assertions.assertEquals(bai1.maxString(str),"1234567");
    }
}