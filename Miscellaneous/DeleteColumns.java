package Miscellaneous;

public class DeleteColumns 
{

    public static void main(String args[])
    {

    }

    public static int deleteColumns(String str[])
    {
        int length = str[0].length();

        int count = 0;

        for(int column = 0; column < length; column++)
        {
            for(int row = 1; row < str.length; row++)
            {
                if(str[row].charAt(column) < str[row - 1].charAt(column))
                {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
    
}
