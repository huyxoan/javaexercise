package Sep13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class bai5test {
    @Test
    public void test(){
        Assertions.assertEquals(bai5.BCNN(40,15), 120);
        Assertions.assertEquals(bai4.BCNN(60,30),60);
    }
}
