package Arrays_and_Strings;

import java.util.*;

public class LongestCommonPrefix 
{

    public static void main(String args[])
    {

    }
    
    public static String longestPrefix(String strs[])
    {
        if (strs == null || strs.length == 0)
        {
            return "";
        }
        
        int smallestStringLength = Integer.MAX_VALUE;
        
        for (String str : strs)
        {
            smallestStringLength = Math.min(smallestStringLength, str.length());
        }
        
        int low = 1;
        int high = smallestStringLength;
        
        while (low <= high) 
        {
            int middle = (low + high) / 2;
            if (isCommonPrefix(strs, middle) == true)
            {
                low = middle + 1;
            }
            else
            {
                high = middle - 1;
            }
    }
    return strs[0].substring(0, (low + high) / 2);
    }

    private boolean isCommonPrefix(String[] strs, int len)
    {
        String str1 = strs[0].substring(0,len);
        for (int i = 1; i < strs.length; i++)
        {
            if (!strs[i].startsWith(str1))
            {
                return false;
            } 
        }
        return true;
    }
}
