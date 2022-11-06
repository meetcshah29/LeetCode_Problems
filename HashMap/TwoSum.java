package HashMap;

import java.util.*;

public class TwoSum {

    public static void main (String args[])
    {

    }

    public static twoSum(int nums[], int target)
    {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            int additiveComplement = target - nums[i];

            if(hashMap.containsKey(additiveComplement))
            {
                return new int[] {hashMap.get(additiveComplement), i};
            }

            hashMap.put(nums[i], i);
        }

        return null;
    }
    
}
