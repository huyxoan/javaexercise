package Sep12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CommonTest {
    @Test
    public void test_distance(){
        Assertions.assertEquals(Common.distance(1, 1, 2, 2), 1.414, 0.001);
        Assertions.assertEquals(Common.distance(1, 1, 4, 5), 5, 0.001);
    }
}
