package Arrays;

public class DuplicateZeros {

    public static void main (String args[])
    {

    }

    public static void duplicateZeros(int nums[])
    {
        int length = nums.length - 1;
        int duplicates = 0;

        for(int i = 0; i <= length - duplicates; i++)
        {
            if(nums[i] == 0)
            {
                if(i == (length - duplicates))
                {   
                nums[length] = 0;
                length--;
                break;
                }

                duplicates++;
            }
        }

        int finalPosition = length - duplicates;

        for(int i = finalPosition; i >= 0; i--)
        {
            if(nums[i] == 0)
            {
                nums[i + duplicates] = 0;
                duplicates--;
                nums[i + duplicates] = 0;
            }
            else
            {
                nums[i + duplicates] = nums[i]; 
            }
        }
    }
    
}
