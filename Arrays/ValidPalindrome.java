package Arrays;

public class ValidPalindrome 
{
    public static void main(String args[])
    {

    }

    public static boolean validPalindrome(String s)
    {
         
        for(int startPointer = 0, endPointer = s.length() - 1; startPointer < endPointer; startPointer++, endPointer--)
        {
            while(startPointer < endPointer && !Character.isLetterOrDigit(s.charAt(startPointer)))
            {
                startPointer++;
            }
            while(startPointer < endPointer && !Character.isLetterOrDigit(s.charAt(endPointer)))
            {
                endPointer--;
            }
            
            if(Character.toLowerCase(s.charAt(startPointer)) != Character.toLowerCase(s.charAt(endPointer)))
            {
                return false;
            }
        }
        
        return true;
    } 

    
}
