package Arrays;

public class MoveZeros {

    public static void main (String args[])
    {

    }

    public static void moveZeros(int nums[])
    {
        int position = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != 0)
            {
                nums[position] = nums[i];
                position++;
            }
        }

        for(int j = position; j < nums.length; j++)
        {
            nums[j] = 0;
        }
    }
    
}
