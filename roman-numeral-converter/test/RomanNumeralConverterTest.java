import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralConverterTest {
    RomanNumeralConverter rnc = new RomanNumeralConverter();
    @Test
    void testConvertRomanNumeral(){
        assertEquals("MMVI", rnc.convertRomanNumeral(2006));
        assertEquals("MCMXLIV", rnc.convertRomanNumeral(1944));
    }
}