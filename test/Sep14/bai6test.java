package Sep14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class bai6test {
    @Test
    public void test_romanToInteger (){
        Assertions.assertEquals(bai6.romanToInteger("LXXIV"), 74);
        Assertions.assertEquals(bai6.romanToInteger("LXXXVI"), 86);
        Assertions.assertEquals(bai6.romanToInteger("DCLXXXII"), 682);
    }
}
