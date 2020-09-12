package Sep11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Bai1Test {
    @Test
    public void test_inverse(){
        int[] array = new int[]{1, 2, 4, 5, 6};
        Bai1.invert(array);

        Assertions.assertArrayEquals(array, new int []{6, 5, 4, 2, 1});
    }
}
