package HashMap;

import java.util.*;

public class GroupAnagrams 
{

    public static void main(String args[])
    {

    }

    public static List<List<String>> groupAnagrams(String strs[])
    {
        if(strs.length == 0)
        {
            return new ArrayList();
        }

        Map<String, List> hashMap = new HashMap<String, List>();

        for(String s: strs)
        {
            char [] character = s.toCharArray();
            Arrays.sort(character);
            String key = String.valueOf(character);

            if(!hashMap.containsKey(key))
            {
                hashMap.put(key, new ArrayList());
            }

            hashMap.get(key).add(s);
        }

        return new ArrayList(hashMap.values());
    }
    
}
