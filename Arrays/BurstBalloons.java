package Arrays;

import java.util.*;

public class BurstBalloons 
{

    public static void main(String args[])
    {

    }

    public static int findMinArrowShots(int[][] points) 
    {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int arrows = 1;

        int previous = 0;

        for(int current = 1; current < points.length; current++)
        {
            if(points[current][0] > points[previous][1])
            {
                arrows++;
                previous = current;
            }
        }

        return arrows;
    }
    
}
