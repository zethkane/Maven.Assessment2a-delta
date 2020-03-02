package rocks.zipcode.assessment2.arrays;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        Integer[] newArr = new Integer[integerArray.length + 1];
        for (int i = 0; i < newArr.length ; i++) {
            if (i < integerArray.length){
                newArr[i] = integerArray[i];
            }
            else newArr[i] = valueToBeAdded;
        }

        return newArr;
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        Integer[] newArr = new Integer[integerArray.length];
        for (int i = 0; i < integerArray.length ; i++) {
            if(i == indexToInsertAt){
                newArr[i] = valueToBeInserted;
            }
            else newArr[i] = integerArray[i];
        }
        return newArr;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        for (int i = 0; i < integerArray.length; i++) {
            if (i == indexToFetch){
                return integerArray[i];
            }

        }
        return null;

    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        Integer[] newArr = new Integer[integerArray.length];
        for (int i = 0; i < integerArray.length; i++) {
          if((integerArray[i]) % 2 == 0) {
              newArr[i] = integerArray[i] + 1;
          }
          else newArr[i] = integerArray[i] -1 ;

        }
        return newArr;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        Integer[] newArr = new Integer[integerArray.length];
        for (int i = 0; i < integerArray.length ; i++) {
            if ( (integerArray[i]) % 2 == 0){
                newArr[i] = integerArray[i] + 1;
            }
            else newArr[i] = integerArray[i];
        }
        return newArr;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        Integer[] newArr = new Integer[input.length];
        for (int i = 0; i < input.length ; i++) {
            if ( (input[i]) % 2 == 0){
                newArr[i] = input[i];
            }
            else newArr[i] = input[i] - 1;
        }
        return newArr;
    }
}
