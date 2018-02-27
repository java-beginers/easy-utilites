package org.javabeginers;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {

    @Test
    public void testIsBlank() {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank(" "));
        assertTrue(StringUtils.isBlank("        "));
    }

    @Test
    public void testIsNotBlank() {
        assertTrue(StringUtils.isNotBlank("1"));
        assertTrue(StringUtils.isNotBlank("1 2"));
        assertTrue(StringUtils.isNotBlank("     1   "));
        assertFalse(StringUtils.isNotBlank("        "));
    }

}