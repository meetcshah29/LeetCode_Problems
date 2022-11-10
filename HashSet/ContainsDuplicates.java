package HashSet;

import java.util.*;

public class ContainsDuplicates 
{

    public static void main(String args[])
    {

    }

    public static boolean containsDuplicates(int nums[], int k)
    {
        Set<Integer> hashSet = new HashSet<>();

        for(int i = 0; i < nums.length; i++)
        {
            if(hashSet.contains(nums[i]))
            {
                return true;
            }

            hashSet.add(nums[i]);

            if(hashSet.size() > k)
            {
                hashSet.remove(nums[i - k]);
            }
        }

        return false;
    }
    
}
