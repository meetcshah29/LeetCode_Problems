package Arrays_and_Strings;

public class LargestNumberTwice {

    public static void main (String args[])
    {

    }

    public static int indexOfLargest(int nums[])
    {
        int largestNumber = -1;
        int secondLargestNumber = -1;
        int index = -1;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > largestNumber)
            {
                secondLargestNumber = largestNumber;
                largestNumber = nums[i];
                index = i;
            }
            else if(nums[i] > secondLargestNumber)
            {
                secondLargestNumber = nums[i];
            }
        }

        if(secondLargestNumber * 2 <= largestNumber)
        {
            return index;
        }

        return -1;
    }
    
}
