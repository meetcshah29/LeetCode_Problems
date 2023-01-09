package Arrays;

import java.util.*;

public class MaxPoints 
{

    public static void main(String args[])
    {

    }

    public static int maxPoints(int[][] points)
    {
        int n = points.length;

        if(n == 1)
        {
            return 1;
        }

        int count = 0;

        for(int i = 0; i < n; i++)
        {
            Map<Double, Integer> hashMap = new HashMap<>();

            for(int j = i + 1; j < n; j++)
            {
                double slope = calculateSlope(points[i], points[j])
                
                hashMap.put(slope, hashMap.getOrDefault(slope, 0) + 1);

                count = Math.max(count, hashMap.get(slope));
            }
        }

        return count + 1;
    }

    public static double calculateSlope(int [] p1, int [] p2)
    {
        int x1 = p1[0];
        int x2 = p2[0];
        int y1 = p1[1];
        int y2 = p2[1];

        if(y2 == y1)
        {
            return 0;
        }

        if(x2 == x1)
        {
            return Double.MAX_VALUE;
        }

        return (double) y2 - y1 / (double) x2 - x1;
    }
    
}
