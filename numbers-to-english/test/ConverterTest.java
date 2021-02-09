import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {
    Converter converter = new Converter();

    @Test
    void testConvert() {
        assertEquals("zero", converter.convert(0));
        assertEquals("eighteen", converter.convert(18));
        assertEquals("one hundred twenty six", converter.convert(126));
        assertEquals("nine hundred nine", converter.convert(909));

        assertEquals("zero", converter.convert(0));
        assertEquals("twenty six", converter.convert(26));
        assertEquals("five hundred nineteen", converter.convert(519));
        assertEquals("one hundred six", converter.convert(106));
        assertEquals("nine hundred ninety nine", converter.convert(999));
    }
}