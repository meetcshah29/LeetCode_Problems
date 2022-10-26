package Arrays_and_Strings;

public class ReverseString {

    public static void main(String args[])
    {

    }

    public static void reverseString(char [] s)
    {
        int start = 0;
        int end = s.length - 1;
        
        while(start < end)
        {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
    
}
