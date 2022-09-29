package Arrays;

public class RemoveDuplicates {

    public static void main (String args[])
    {

    }

    public static int removeDuplicates(int nums[])
    {
        int pointer = 1;

        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] != nums[i - 1])
            {
                nums[pointer] = nums[i];
                pointer++;
            }
        }

        return pointer;
    }
    
}
