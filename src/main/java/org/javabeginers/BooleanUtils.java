package org.javabeginers;

/**
 * Класс утилит для работы с логическим типом данных.
 */
public class BooleanUtils {
    private static String TRUE_VALUES[] = {"1", "true", "yes", "on", "y", "t"};

    /**
     * Преобразует объект в логическое значение примитивного типа boolean
     * @param value Любой объект, либо null
     * @return {@code true} если число не равно 0,
     * либо строковое представление объекта соответствует одной из предопределенных констант. Иначе {@code false}
     */
    public static boolean toBoolean(Object value) {
        if (value == null) {
            return false;
        }
        if (value instanceof Number) {
            Number number = (Number) value;
            return 0 != number.doubleValue();
        }
        String objvalue = value.toString();
        for (String trueValue : TRUE_VALUES) {
            if (trueValue.equalsIgnoreCase(objvalue)) {
                return true;
            }
        }
        return false;
    }

}
