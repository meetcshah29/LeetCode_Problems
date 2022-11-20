package Miscellaneous;

public class LengthOfLastWord 
{

    public static void main(String args[])
    {

    }

    public static int lastWordLength(String s)
    {
        int count = 0;
        int pointer = s.length() - 1;

        while(pointer >= 0 && s.charAt(pointer) == ' ')
        {
            pointer--;
        }

        while(pointer >= 0 && s.charAt(pointer) != ' ')
        {
            pointer--;
            count++;
        }

        return count;
    }
    
}
