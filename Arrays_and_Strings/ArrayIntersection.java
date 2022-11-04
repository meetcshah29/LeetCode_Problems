package Arrays_and_Strings;

import java.util.*;

public class ArrayIntersection 
{

    public static void main (String args[])
    {

    }

    public static boolean binarySearch(int nums[], int target)
    {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(nums[mid] == target)
            {
                return true;
            }
            if(nums[mid] > target)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }

        return false;
    }

    public static int[] intersectionOfArrays(int nums1[], int nums2[])
    {
        int length1 = nums1.length;
        int length2 = nums2.length;
        Set <Integer> hashSet = new HashSet<>();

        if(length1 > length2)
        {
            Arrays.sort(nums2);
        }
        else
        {
            Arrays.sort(nums1);
        }

        if(length1 > length2)
        {
            for(Integer num : nums1)
            {
                if(binarySearch(nums2, num))
                {
                    hashSet.add(num);
                }
            }
        }
        else
        {
            for(Integer num : nums2)
            {
                if(binarySearch(nums1, num))
                {
                    hashSet.add(num);
                }
            }
        }

        int result [] = new int[hashSet.size()];

        int index = 0;

        for(Integer num : hashSet)
        {
            result[index] = num;
            index++;
        }

        return result;
    }
    
}
