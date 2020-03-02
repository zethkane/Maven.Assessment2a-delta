package rocks.zipcode.assessment2.arrays;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        String[] newArr = new String[endingIndex];
        for (int i = startingIndex; i < newArr.length; i++) {
            newArr[i] = arrayToBeSpliced[i];
        }
        return newArr;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        String[] newArr = new String[arrayToBeSpliced.length - startingIndex];
        if (startingIndex == 0){
            for (int i = startingIndex; i  < newArr.length ; i++) {

            newArr[i] = arrayToBeSpliced[i];}

        }
        else
            for (int i = startingIndex; i < newArr.length + 1; i++) {
                newArr[i - 1] = arrayToBeSpliced[i];
            }
        return newArr;
    }
}
