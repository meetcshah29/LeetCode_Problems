package Arrays;

public class MaxConsecutiveOnes2 {

    public static void main(String args[])
    {

    }

    public static int maxConsecutiveOnes2(int nums[])
    {
        int sequence = 0;
        int startPointer = 0;
        int endPointer = 0;
        int totalZeroes = 0;
        
        while(endPointer < nums.length)
        {
            if(nums[endPointer] == 0)
            {
                totalZeroes++;
            }
            
            while(totalZeroes == 2)
            {
                if(nums[startPointer] == 0)
                {
                    totalZeroes--;
                }
                startPointer++;
            }
            
            sequence = Math.max(sequence, endPointer - startPointer + 1);
            
            endPointer++;
        }
        
        return sequence;
    }
    
}
