package Miscellaneous;

import java.util.*;

public class SquareRoot 
{

    public static void main(String args[])
    {

    }

    public static int squareRoot(int x)
    {
        if(x < 2)
        {
            return x;
        }

        int left = Math.pow(Math.E, 0.5 * Math.log(x));
        int right = left + 1;

        return (long) right * right > x ? left : right;
    }
    
}
