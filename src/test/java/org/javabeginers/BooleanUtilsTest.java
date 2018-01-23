package test.java.org.javabeginers;

import main.java.org.javabeginers.BooleanUtils;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Тестовый класс для проверки BooleanUtils
 */
public class BooleanUtilsTest {

    @Test
    public void testTrueConvertToBooleanFromString() {
        String[] testValues = new String[] {
                "1", "True", "true", "TRUE", "yes", "YES", "Yes", "t", "T", "y", "Y"};
        for (String value : testValues) {
            assertTrue(BooleanUtils.convertToBoolean(value));
        }
    }


    @Test
    public void testConvertToBooleanFromBoolean() {
        assertTrue(BooleanUtils.convertToBoolean(Boolean.TRUE));
        assertFalse(BooleanUtils.convertToBoolean(Boolean.FALSE));
    }


    @Test
    public void testConvertToBooleanFromInteger() {
        assertTrue(BooleanUtils.convertToBoolean(1));
        assertTrue(BooleanUtils.convertToBoolean(-1));
        assertFalse(BooleanUtils.convertToBoolean(0));
    }


    @Test
    public void testConvertToBooleanFromLong() {
        assertTrue(BooleanUtils.convertToBoolean(1L));
        assertTrue(BooleanUtils.convertToBoolean(-1L));
        assertFalse(BooleanUtils.convertToBoolean(0L));
    }


    @Test
    public void testConvertToBooleanFromOtherObjects() {
        assertFalse(BooleanUtils.convertToBoolean(new LinkedList<String>()));
        assertFalse(BooleanUtils.convertToBoolean(new Date()));
        assertFalse(BooleanUtils.convertToBoolean(new HashMap<String, String>()));
        assertFalse(BooleanUtils.convertToBoolean(new BigDecimal(3.14f)));
    }


    @Test
    public void testFalseConvertToBooleanFromString() {
        assertFalse(BooleanUtils.convertToBoolean("0"));
        assertFalse(BooleanUtils.convertToBoolean("False"));
        assertFalse(BooleanUtils.convertToBoolean("bla bla"));
        assertFalse(BooleanUtils.convertToBoolean(""));
    }

}
