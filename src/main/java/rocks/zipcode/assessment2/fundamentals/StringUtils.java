package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding  - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {

        StringBuilder sb = new StringBuilder();
        int count = amountOfPadding - stringToBePadded.length();
        for (int i = 0; i < count; i++) {
            sb.append(' ');
        }
        sb.append(stringToBePadded);
        return sb.toString();
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding  - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {

        StringBuilder sb = new StringBuilder();
        sb.append(stringToBePadded);
        int count = amountOfPadding - stringToBePadded.length();
        for (int i = 0; i < count; i++) {
            sb.append(' ');
        }
        return sb.toString();
    }

    /**
     * @param stringToBeRepeated   - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfTimeToRepeat; i++) {
            sb.append(stringToBeRepeated);
        }
        return sb.toString();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        if (string == null) {
            return false;
        }
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z') && !(c == ' ')) {
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
        if (string == null) {
            return false;
        }
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {

        for (Character c : string.toCharArray()) {
            if (Character.isDigit(c) || Character.isAlphabetic(c) || Character.isSpaceChar(c)) {
                return false;
            }
        }
        return true;
    }


     //*********************************

      //  return (string == null) ? false : string.matches("[^A-Za-z0-9 ]");
        //********************************

//        if (isAlphaString(string) || isNumericString(string)) {
//            return false;
//        }
//        else
//            return true;


}


