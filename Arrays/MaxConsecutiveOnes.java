package Arrays;

public class MaxConsecutiveOnes {

    public static void main(String args[])
    {
        
    }

    public static int maxOnes(int nums[])
    {
        int currentCount = 0;
        int maxCount = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 1)
            {
                currentCount++;
            }
            else
            {
                maxCount = Math.max(currentCount, maxCount);
                currentCount = 0;
            }
        }

        return Math.max(currentCount, maxCount);
    }
    
}
