import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {
    Converter converter = new Converter();

    @Test
    void testToCamelCase() {
        assertEquals("helloEdabit", converter.toCamelCase("hello_edabit"));
        assertEquals("isModalOpen", converter.toCamelCase("is_modal_open"));
    }

    @Test
    void testToSnakeCase() {
        assertEquals("hello_edabit", converter.toSnakeCase("helloEdabit"));
        assertEquals("get_color", converter.toSnakeCase("getColor"));
    }

}