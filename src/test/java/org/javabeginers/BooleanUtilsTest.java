package org.javabeginers;

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
            assertTrue(BooleanUtils.toBoolean(value));
        }
    }


    @Test
    public void testConvertToBooleanFromBoolean() {
        assertTrue(BooleanUtils.toBoolean(Boolean.TRUE));
        assertFalse(BooleanUtils.toBoolean(Boolean.FALSE));
    }


    @Test
    public void testConvertToBooleanFromInteger() {
        assertTrue(BooleanUtils.toBoolean(1));
        assertTrue(BooleanUtils.toBoolean(-1));
        assertFalse(BooleanUtils.toBoolean(0));
    }


    @Test
    public void testConvertToBooleanFromLong() {
        assertTrue(BooleanUtils.toBoolean(1L));
        assertTrue(BooleanUtils.toBoolean(-1L));
        assertFalse(BooleanUtils.toBoolean(0L));
    }


    @Test
    public void testConvertToBooleanFromOtherObjects() {
        assertFalse(BooleanUtils.toBoolean(new LinkedList<String>()));
        assertFalse(BooleanUtils.toBoolean(new Date()));
        assertFalse(BooleanUtils.toBoolean(new HashMap<String, String>()));
        assertTrue(BooleanUtils.toBoolean(new BigDecimal(3.14f)));
        assertTrue(BooleanUtils.toBoolean(new BigDecimal(.00001f)));
    }


    @Test
    public void testFalseConvertToBooleanFromString() {
        assertFalse(BooleanUtils.toBoolean("0"));
        assertFalse(BooleanUtils.toBoolean("False"));
        assertFalse(BooleanUtils.toBoolean("bla bla"));
        assertFalse(BooleanUtils.toBoolean(""));
    }

}
