package Miscellaneous;

public class ClimbingStairs 
{

    public static void main(String args[])
    {

    }

    public static int climbingStairs(int n)
    {
        if(n == 1)
        {
            return 1;
        }

        int a = 1;
        int b = 2;

        for(int i = 3; i <= n; i++)
        {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
    
}
