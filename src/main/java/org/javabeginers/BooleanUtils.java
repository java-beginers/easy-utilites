package main.java.org.javabeginers;

/**
 * Класс утилит для работы с логическим типом данных.
 */


public class BooleanUtils {
    static String TrueArray[] = {"1", "true", "yes", "on"};

    public static boolean convertToBoolean(Object value) {
        boolean returnValue = false;
        String objvalue = value.toString();
        for(int i = 0; i < TrueArray.length; i++) {
            if(objvalue.equalsIgnoreCase(TrueArray[i])) {
                returnValue = true;
                break;
            }
        }
        return returnValue;
    }

}
