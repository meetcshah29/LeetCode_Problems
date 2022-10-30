package Arrays_and_Strings;

import java.util.*;

public class MinimumSubArraySum {

    public static void main(String args[])
    {

    }

    public static int subArraySum(int target, int nums[])
    {
        if(nums == null || nums.length == 0)
        {
            return 0;
        }

        int slowPointer = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;

        for(int fastPointer = 0; fastPointer < nums.length; fastPointer++)
        {
            sum += nums[fastPointer];

            while(sum >= target)
            {
                result = Math.min(result, fastPointer + 1 - slowPointer);
                sum -= nums[slowPointer];
                slowPointer++;
            }
        }

        if(result == Integer.MAX_VALUE)
        {
            return 0;
        }

        return result;
    }
    
}
