package Arrays_and_Strings;

public class SingleNumber {

    public static void main(String args[])
    {

    }

    public static int singleNumber(int nums[])
    {
        int index = 0;

        for(int x: nums)
        {
            index = index ^ x;
        }

        return index;
    }
    
}
