package Arrays;

import java.util.*;

public class SortedSquaredArray {

    public static void main (String args[])
    {

    }

    public static int[] squareSortedArray(int nums[])
    {
        int startPointer = 0;
        int endPointer = nums.length - 1;
        int sortedSquaredArray [] = new int[endPointer + 1];
        
        for(int writePointer = endPointer; writePointer >= 0; writePointer--)
        {
            if(Math.abs(nums[startPointer]) > Math.abs(nums[endPointer]))
            {
                sortedSquaredArray[writePointer] = nums[startPointer] * nums[startPointer];
                startPointer++;
            }
            else
            {
                sortedSquaredArray[writePointer] = nums[endPointer] * nums[endPointer];
                endPointer--;
            }
        }
        
        return sortedSquaredArray;
    }
    
}
