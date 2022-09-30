package Arrays;

public class ValidMountainArray {
    
    public static void main (String args [])
    {

    }

    public static boolean mountainArray(int nums[])
    {
        int start = 0;
        int finish = nums.length;

        while(start + 1 < finish && nums[start] < nums[start + 1])
        {
            start++;
        }

        if(start == 0 || start == nums.length - 1)
        {
            return false;
        }

        while(start + 1 < finish && nums[start] > nums[start + 1])
        {
            start++;
        }

        return start == finish - 1;
    }
}
