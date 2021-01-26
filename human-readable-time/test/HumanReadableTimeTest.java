import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanReadableTimeTest {

    @Test
    void convert() {
        assertEquals("00:00:00", HumanReadableTime.convert(0));
        assertEquals("00:00:05", HumanReadableTime.convert(5));
        assertEquals("00:01:00", HumanReadableTime.convert(60));
        assertEquals("23:59:59", HumanReadableTime.convert(86399));
        assertEquals("99:59:59", HumanReadableTime.convert(359999));
        assertEquals(null, HumanReadableTime.convert(360000));
    }
}