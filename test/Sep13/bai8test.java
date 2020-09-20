package Sep13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class bai8test {
    @Test
    public void test() {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 6};

        Assertions.assertEquals(bai8.sum(a),27);
    }
}
