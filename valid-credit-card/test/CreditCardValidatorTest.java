import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardValidatorTest {
    CreditCardValidator cv = new CreditCardValidator();
    @Test
    void testValidateCreditCard() {
        assertEquals(false, cv.validateCard(79927398714L));
        assertEquals(false, cv.validateCard(79927398713L));
        assertEquals(true, cv.validateCard(709092739800713L));
        assertEquals(false, cv.validateCard(1234567890123456L));
        assertEquals(true, cv.validateCard(12345678901237L));
        assertEquals(true, cv.validateCard(5496683867445267L));
        assertEquals(false, cv.validateCard(4508793361140566L));
        assertEquals(true, cv.validateCard(376785877526048L));
        assertEquals(false, cv.validateCard(36717601781975L));
    }
}