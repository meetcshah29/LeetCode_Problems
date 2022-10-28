package Arrays_and_Strings;

public class TwoSum2 
{

    public static void main (String args[])
    {

    }

    public static int[] twoSum(int numbers[], int target)
    {
        int startPointer = 0;
        int endPointer = numbers.length - 1;
        int pointers [] = new int[2];
        
        while(startPointer < endPointer)
        {
            int sum = numbers[startPointer] + numbers[endPointer];
            
            if(sum == target)
            {
                pointers[0] = startPointer + 1;
                pointers[1] = endPointer + 1;
                return pointers;
            }
            else if (sum < target)
            {
                ++startPointer;
            }
            else
            {
                --endPointer;
            }
        }
        
        pointers[0] = -1;
        pointers[1] = -1;
        
        return pointers;
    }
    
}
