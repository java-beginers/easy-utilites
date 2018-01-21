package main.java.org.javabeginers;

/**
 * Класс утилит для работы с логическим типом данных.
 */
public class BooleanUtils {
    public static boolean convertToBoolean(String value) {
        boolean returnValue = false;
        if ("1".equalsIgnoreCase(value) || "yes".equalsIgnoreCase(value) ||
                "true".equalsIgnoreCase(value) || "on".equalsIgnoreCase(value))
            returnValue = true;
        return returnValue;
    }

}
