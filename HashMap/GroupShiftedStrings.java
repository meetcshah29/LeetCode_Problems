package HashMap;

import java.util.*;

public class GroupShiftedStrings 
{
    public static void main(String args[])
    {

    }

    public static char shiftLetter(char letter, int shift) 
    {
        return (char) ((letter - shift + 26) % 26 + 'a');
    }

    public static String getHash(String s)
    {
        char[] characterArray = s.toCharArray();
        
        int shift = characterArray[0];
        for (int i = 0; i < characterArray.length; i++) {
            characterArray[i] = shiftLetter(characterArray[i], shift);
        }
        
        String hashKey = String.valueOf(characterArray);
        return hashKey;
    }

    public static List<List<String>> groupStrings(String strings[])
    {
        Map<String, List<String>> hashMap = new HashMap<>();

        for(String s: strings)
        {
            String key = getHash(str);
            
            if(hashMap.get(key) == null)
            {
                hashMap.put(key, new ArrayList<>());
            }
            hashMap.get(key).add(s);
        }

        List<List<String>> result = new ArrayList<>();
        for(List<String> value : hashMap.values())
        {
            result.add(value);
        }

        return result;
    }

   

    
}
