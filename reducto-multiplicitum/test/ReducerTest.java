import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReducerTest {
    Reducer reducer = new Reducer();

    @Test
    void testSumDigProd() {
        assertEquals(0, reducer.sumDigProd(0));
        assertEquals(9, reducer.sumDigProd(9));
        assertEquals(7, reducer.sumDigProd(9, 8));
        assertEquals(6, reducer.sumDigProd(16, 28));
        assertEquals(1, reducer.sumDigProd(111111111));
        assertEquals(2, reducer.sumDigProd(1,2,3,4,5,6));
        assertEquals(6, reducer.sumDigProd(8, 16, 89, 3));
        assertEquals(6, reducer.sumDigProd(26, 497, 62, 841));
        assertEquals(6, reducer.sumDigProd(17737, 98723, 2));
        assertEquals(8, reducer.sumDigProd(123, -99));
        assertEquals(8, reducer.sumDigProd(167, 167, 167, 167, 167, 3));
        assertEquals(2, reducer.sumDigProd(98526, 54, 863, 156489, 45, 6156));

    }
}