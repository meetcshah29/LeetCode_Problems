package HashMap;

import java.util.*;

public class MinimumIndexSum 
{

    public static void main(String args[])
    {

    }

    public static String[] commonElementIndexSum(String [] list1, String [] list2)
    {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        for(int i = 0; i < list1.length; i++)
        {
            hashMap.put(list1[i], i);
        }

        List<String> result = new ArrayList<>();

        int sum = Integer.MAX_VALUE;
        int totalSum = 0;

        for(int i = 0; i < list2.length && i <= sum; i++)
        {
            if(hashMap.containsKey(list2[i]))
            {
                totalSum = i + hashMap.get(list2[i]);
                if(totalSum < sum)
                {
                    result.clear();
                    result.add(list2[i]);
                    sum = totalSum;
                }
                else if(totalSum == sum)
                {
                    result.add(list2[i]);
                }
            }
        }

        return result.toArray(new String[result.size()]);
    }
    
}
