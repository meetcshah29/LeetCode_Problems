package Arrays;

public class FindMissingNumbers {

    public static void main (String args[])
    {

    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        for(int i = 0; i < nums.length; i++)
        {
            int pointer = Math.abs(nums[i]) - 1;
            
            if(nums[pointer] > 0)
            {
                nums[pointer] *= -1;
            }
        }
        
        List<Integer> result = new LinkedList<Integer>();
        
        for(int i = 1; i <= nums.length; i++)
        {
            if(nums[i - 1] > 0)
            {
                result.add(i);
            }
        }
        
        return result;   
    }
    
}
