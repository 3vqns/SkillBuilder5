import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class provides various Skill Builder 5 - Array
 * exercises.
 *
 * @author Evans
 * @version 3/6/24
 */
public class SkillBuilder5
{
    /**
     * Calculates the prefix average of array data and returns the prefix average
     * in a new array.  The parameter data is never touched and left intact.
     *
     * @param data array of double values on which to calculate the prefix average.
     * @return returns an array containing the prefix average values calculated
     *         from data.
     */
    public static double[] prefixAverage(double[] data)
    {
        double[] avg = new double [data.length];
        double q = 0;
        for(int index = 0; index < data.length; index ++){
            q += data[index];
            avg[index] = q / (index + 1);
        }

        return avg;
    }


    /**
     * Finds the location in array anArray where value is located.  If anArray
     * does not contain an element equal to value a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param searchValue value to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the value in the array; -1 otherwise.
     */
    public static int  indexOf(int searchValue, int[] anArray)
    {
        int answer = -1;
        for (int index = 0; index < anArray.length; index ++) {
            if (searchValue == anArray[index]) {
                answer = index;
                break;
            }
        }
        return answer;
    }

    /**
     * Finds the location in array anArray where string s is located.  If anArray
     * does not contain an element equal to s a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param s a string to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the string s in the array; -1 otherwise.
     */
    public static int  indexOf(String s, String[] anArray)
    {
        int answer = -1;
        for (int index = 0; index < anArray.length; index ++) {
            if (s.equals(anArray[index])) {
                answer = index;
                break;
            }
        }
        return answer;
    }

    /**
     * Finds all occurrence of string s in anArray and removes them, returning
     * a new array with all occurrences of s removed.
     * @param s string to search for in array
     * @param anArray array in which to search and remove s
     * @return An array with all occurrences of s removed.
     */
    public static String[] remove(String s, String[] anArray) {
        int count = 0;
        // the for-loop finds the length that our removed version will have
        for(int index = 0; index < anArray.length; index++) {
            if (!s.equals(anArray[index])) {
                count++;
            }
        }
        int newIndex = 0;
        String[] removed = new String[count];
        // this for-loop adds the contents of the array to the removed version
        for(int index = 0; index < anArray.length; index ++){
            if (!s.equals(anArray[index])){
                removed[newIndex] = anArray[index];
                // new index only updates if s isn't anArray[index]
                newIndex ++;
            }

        }
        return removed;
    }

    /**
     * Reverses an array of integers.
     * @param anArray the array whose contents should be reversed.
     */
    public static void reverse(int[] anArray) {
        int len = anArray.length;
        //the condition is len / 2 because we are swapping 2 at a time
        for (int index = 0; index < len / 2; index++) {
            // temporarily holds the number at anArray[index]
            int temp = anArray[index];
            //swap anArray[index] with its equivalent in the reversed version
            anArray[index] = anArray[len - index - 1];
            anArray[len - index - 1] = temp;
        }
    }
    
}
