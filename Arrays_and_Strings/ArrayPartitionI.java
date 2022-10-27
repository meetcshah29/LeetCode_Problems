package Arrays_and_Strings;

import java.util.*;

public class ArrayPartitionI 
{
    public static void main (String args[])
    {

    }

    public static arrayPairing(int [] nums)
    {
        Arrays.sort(nums);
        
        int maxSum = 0;
        
        for(int i = 0; i < nums.length; i += 2)
        {
            maxSum += nums[i];
        }
        
        return maxSum;
    }
}
