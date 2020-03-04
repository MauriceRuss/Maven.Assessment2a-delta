package rocks.zipcode.assessment2.fundamentals;


/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
//        String padded = String.format(amountOfPadding, stringToBePadded);
        if (stringToBePadded.length() >= amountOfPadding) {
            return stringToBePadded;
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < amountOfPadding - stringToBePadded.length()) {
            sb.append(" ");
        }
        sb.append(stringToBePadded);
        return sb.toString();
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        return String.format("%1$-" + amountOfPadding, stringToBePadded);
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        int n = numberOfTimeToRepeat;
        String in = stringToBeRepeated;

        String result = "";
        for (int i = 0; i < n; ++i) {
            result += in;
        }
        return result;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        char[] charArray = string.toCharArray();
        for(Character c : charArray){
            if((!Character.isAlphabetic(c)) && (!c.toString().equals(" "))){
                return false;
            }
        }
       return true;
    }


    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        return ((string != null)
                && (!string.equals(""))
                && (string.matches("^[0-9]*$")));
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        char[] charArray = string.toCharArray();
        for(Character s : charArray) {
            if( Character.isDigit(s) || Character.isAlphabetic(s)) {
                return false;
            }
        }
        return true;
    }
}
