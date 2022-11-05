package Arrays_and_Strings;

import java.util.*;

public class HappyNumber 
{
    public static void main (String args[])
    {

    }

    public static boolean happyNumber(int n)
    {

        Set<Integer> hashSet = new HashSet<>();

        while(n != 1 && !hashSet.contains(n))
        {
            hashSet.add(n);
            n = getNumber(n);
        }

        return n == 1;

    }

    public static int getNumber(int n)
    {
        int total = 0;

        while(n > 0)
        {
            int number = n % 10;
            n = n / 10;
            total += (number * number);
        }

        return total;
    }
    
}
