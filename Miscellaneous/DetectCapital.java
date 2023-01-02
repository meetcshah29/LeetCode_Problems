package Miscellaneous;

public class DetectCapital
{

    public static void main(String args[])
    {

    }

    public static boolean detectCapital(String word)
    {
       int count = 0;

       for(int i = 0; i < word.length(); i++)
       {
            if(Character.isUpperCase(word.charAt(i)))
            {
                count++;
            }
       }

       if(count == 0 || count == word.length())
       {
            return true;
       }

       return (count == 1 && Character.isUpperCase(word.charAt(0)));
    }
    
}
