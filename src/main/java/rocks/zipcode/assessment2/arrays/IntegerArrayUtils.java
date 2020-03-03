package rocks.zipcode.assessment2.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray   - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        Integer[] addedInt = new Integer[integerArray.length + 1];
        for (int i = 0; i < integerArray.length; i++) {
            addedInt[i] = integerArray[i];
            addedInt[integerArray.length] = valueToBeAdded;
        }
        return addedInt;
    }

    /**
     * @param integerArray      - array to be manipulated
     * @param indexToInsertAt   - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        Integer[] replace = new Integer[integerArray.length + 1];
        for (int i = 0; i < integerArray.length; i++) {
            if (i < indexToInsertAt - 1) ;
            replace[i] = integerArray[i];
            if (i == indexToInsertAt - 1) ;
            replace[i] = valueToBeInserted;
        }
        return replace;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        int gottenInt = 0;
        for (int i = 0; i < integerArray.length; i++) {
            gottenInt = (int) Array.get(integerArray, indexToFetch);
        }
        return gottenInt;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        Integer[] evenArray = new Integer[integerArray.length];
        for(int i = 0; i < integerArray.length; i++){
            if(integerArray[i]%2 == 0){
                integerArray[i] = 0;
                integerArray[i] = integerArray[i +1];
                evenArray = integerArray;
            }
        }
        //Integer[] evenArray = new Integer[evenArray.length];
        int n = 0;

        for(int j : evenArray){
            evenArray[n] = j +1;
            n++;
        }


        return evenArray;

    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        return null;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        return null;
    }
}
