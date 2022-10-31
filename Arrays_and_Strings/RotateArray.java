package Arrays_and_Strings;

public class RotateArray 
{

    public static void main(String args[])
    {

    }

    public static void rotateArrayByK(int nums[], int k)
    {
        reverseArray(nums, 0, nums.length - 1);
        k = k % nums.length;
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, nums.length - 1);
    }

    public static void reverseArray(int nums[], int start, int end)
    {
        while(start < end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
}
