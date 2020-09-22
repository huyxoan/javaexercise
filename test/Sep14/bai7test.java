package Sep14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class bai7test {
    @Test
    public void test_toRoman (){
        Assertions.assertEquals(bai7.toRoman(74),"LXXIV");
        Assertions.assertEquals(bai7.toRoman(86),"LXXXVI");
    }
}
