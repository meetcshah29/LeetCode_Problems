package Miscellaneous;

public class SearchInsertPosition 
{

    public static void main (String args[])
    {

    }

    public static int searchTarget(int nums[], int target)
    {
        int low = 0;
        int high = nums.length - 1;
        int mid = (low + high) / 2;

        while(low <= high)
        {
            mid = (low + high) / 2;

            if(target == nums[mid])
            {
                return mid;
            }
            else if(target > nums[mid])
            {
                low = mid + 1;
            }
            else if(target < nums[mid])
            {
                high = mid - 1;
            }
        }

        return low;
    }
    
}
