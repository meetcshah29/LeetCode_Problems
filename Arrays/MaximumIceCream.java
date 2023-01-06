package Arrays;

import java.util.*;

public class MaximumIceCream 
{

    public static void main(String args[])
    {

    }

    public static int maximumIceCreamBars(int costs[], int coins)
    {
        Arrays.sort(costs);

        int n = costs.length;

        int iceCream = 0;

        while(iceCream < n && costs[iceCream] <= coins)
        {
            coins -= costs[iceCream];

            iceCream++;
        }

        return iceCream;
    }
    
}
