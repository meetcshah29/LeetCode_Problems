package Arrays_and_Strings;

public class ReverseWords3 {

    public static void main (String args[])
    {

    }

    public static String reverseString(String s)
    {
        char stringArray [] = s.toCharArray();
        int index = -1;
        int length = s.length();
        for(int i = 0; i <= length; i++)
        {
            if(i == length || stringArray[i] == ' ')
            {
                int start = index + 1;
                int end = i - 1;
                while(start < end)
                {
                    char temp = stringArray[start];
                    stringArray[start] = stringArray[end];
                    stringArray[end] = temp;
                    start++;
                    end--; 
                }
                index = i;
            }
        }

        return new String(stringArray);
    }
    
}
