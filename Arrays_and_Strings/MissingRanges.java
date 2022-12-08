package Arrays_and_Strings;

import java.util.*;

public class MissingRanges 
{

    public static void main(String args[])
    {

    }

    public static List<String> findMissingRanges(int[] nums, int lower, int upper) 
    {
        List<String> result = new ArrayList<String>();

        String range = "";

        int headPointer = 0; 
        int tailPointer = 0;

        for (int i = 0; i <= nums.length; i++) 
        {
            if (i > 0) 
            {
                headPointer = nums[i - 1];
            }
            else 
            {
                headPointer = lower - 1;
            }

            if (i < nums.length) 
            {
                tailPointer = nums[i];
            }
            else 
            {
                tailPointer = upper + 1;
            }

            range = getMissingRange(headPointer, tailPointer);

            if (range != null)
            { 
                result.add(range);
            }
        }

        return result;
    }

    public static String getMissingRange(int start, int end) 
    {

        if (start == end) 
        {
            return null;
        }

        StringBuilder result = new StringBuilder();

        if (start + 1 == end) 
        {
            return null;
        }

        if (start + 1 == end - 1) {
            return String.valueOf(start + 1);
        }

        result.append(start + 1);
        result.append("->");
        result.append(end - 1);

        return result.toString();
    }
    
}
