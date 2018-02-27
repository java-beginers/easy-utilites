package org.javabeginers;

public class StringUtils {

    public static boolean isBlank(String source) {
        if (source == null) {
            return true;
        }
        return source.trim().isEmpty();
    }

    public static boolean isNotBlank(String source) {
        return ! isBlank(source);
    }
}
