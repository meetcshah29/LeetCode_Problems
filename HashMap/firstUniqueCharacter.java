package HashMap;

import java.util.*;

public class firstUniqueCharacter 
{

    public static void main(String args[])
    {

    }

    public static int firstUniqueCharacter(String s)
    {
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

        for(int i = 0; i < s.length(); i++)
        {
            char temp = s.charAt(i);
            hashMap.put(temp, hashMap.getOrDefault(temp, 0) + 1);
        }

        for(int i = 0; i < s.length(); i++)
        {
            if(hashMap.get(s.charAt(i)) == 1)
            {
                return i;
            }
        }

        return -1;
    }
    
}
