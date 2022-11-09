package HashMap;

import java.util.*;

public class IntersectionOfTwoArrays 
{

    public static void main(String args[])
    {

    }

    public static int[] IntersectionOfTwoArrays(int nums1[], int nums2[])
    {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int length1 = nums1.length;
        int length2 = nums2.length;

        if(length1 < length2)
        {   
            for(int n: nums1)
            {
                hashMap.put(n, hashMap.getOrDefault(n, 0) + 1);
            }

            int index = 0;

            for(int n: nums2)
            {
                int count = hashMap.getOrDefault(n, 0);
                if(count > 0)
                {
                    nums1[index] = n;
                    index++;
                    hashMap.put(n, count - 1);
                }
            }

            return Arrays.copyOfRange(nums1, 0, index);
        }

        else
        {
            for(int n: nums2)
            {
                hashMap.put(n, hashMap.getOrDefault(n, 0) + 1);
            }

            int index = 0;

            for(int n: nums1)
            {
                int count = hashMap.getOrDefault(n, 0);
                if(count > 0)
                {
                    nums2[index] = n;
                    index++;
                    hashMap.put(n, count - 1);
                }
            }

            return Arrays.copyOfRange(nums2, 0, index);
        }
    }
    
}
