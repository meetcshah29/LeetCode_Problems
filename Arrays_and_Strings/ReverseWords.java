package Arrays_and_Strings;

public class ReverseWords {

    public static void main (String args[])
    {

    }

    public static String reverseWords(String s)
    {
        char[] stringArray = s.toCharArray();
        char[] result = new char[stringArray.length+1];
        
        int pointer = s.length() - 1;
        int position = 0;
        while(pointer >= 0)
        {
            while(pointer >= 0 && stringArray[pointer] == ' ')
            {
                pointer--;
            }
            int index = pointer;
            while(pointer >= 0 && stringArray[pointer] != ' ')
            {
                pointer--;
            }
            for(int j = pointer + 1; j <= index; j++)
            {
                result[position] = stringArray[j];
                position++;

                if(j == index)
                {
                    res[position] = ' ';
                    position++;
                }
            }
        }
        if(position == 0)
        {
            return "";
        } 

        else 
        {
            return new String(result, 0, position - 1);
        }
    }

    
}
