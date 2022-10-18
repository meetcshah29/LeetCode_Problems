package Arrays_and_Strings;

public class FindPivotIndex {

    public static void main (String args[])
    {

    }

    public static int findPivot(int nums[])
    {
        int totalSum = 0;
        int leftSum = 0;
        for(int i: nums)
        { 
            totalSum += i;
        }

        for(int i = 0; i < nums.length; i++)
        {
            if(leftSum == (totalSum - leftSum - nums[i]))
            {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
