package Arrays;

import java.util.*;

public class CompleteTasks 
{

    public static void main(String args[])
    {

    }

    public static int minimumRounds(int tasks[])
    {
        Arrays.sort(tasks);

        int count = 0;

        for(int i = 0; i < tasks.length; i++)
        {
            int j = i + 1;

            while(j < tasks.length && tasks[j] == tasks[i])
            {
                j++;
            }

            if(j == i + 1)
            {
                return -1;
            }

            count += compute(j - i);

            i = j;
        }

        return count;
    }

    public static int compute(int n)
    {
        if(n % 3 == 0)
        {
            return n / 3;
        }

        if(n % 3 == 2)
        {
            return ((n - 2) / 3) + 1;
        }

        return ((n - 4) / 3) + 2
    }
    
}
