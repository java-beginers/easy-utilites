package test.java.org.javabeginers;

import main.java.org.javabeginers.BooleanUtils;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Тестовый класс для проверки BooleanUtils
 */
public class BooleanUtilsTest {

    @Test
    public void testConvertToBoolean() {
        assertTrue(BooleanUtils.convertToBoolean("1"));
        assertFalse(BooleanUtils.convertToBoolean("0"));
        assertFalse(BooleanUtils.convertToBoolean("False"));
        assertFalse(BooleanUtils.convertToBoolean("bla bla"));
    }

}
