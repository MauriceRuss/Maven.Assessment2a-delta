package rocks.zipcode.assessment2.fundamentals;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {

        return string1.concat(string2);
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        StringBuilder tempString = new StringBuilder(string1);
        StringBuilder revString = tempString.reverse();
        String answer = revString.toString();

        return answer;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String ans = string2.concat(string1);
        StringBuilder tempString = new StringBuilder(ans);
        StringBuilder revString = tempString.reverse();
        String revOne = revString.toString();
        return revOne;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        char[] charArray = string.toCharArray();
        char[] chars = charactersToRemove.toCharArray();
        String ans = string;

        for (int i = 0; i < charactersToRemove.length(); i++) {
            for(char j :charArray){
                if(j == chars[i]){
                    ans = ans.replace(j+"","");
                }
            }
        }
        return ans;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {

        String answer = reverse(removeCharacters(string,charactersToRemove));

        return answer;
    }
}
