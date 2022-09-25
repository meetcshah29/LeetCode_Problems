package HashMap;

import java.util.*;

public class RansomNote{

    public static void main (String args[])
    {

    }

    public static boolean ransomNote(String ransomNote, String magazine)
    {
        HashMap<Character, Integer> magazineLetters = new HashMap<Character, Integer>();

        for(int i = 0; i < magazine.length(); i++)
        {
            char letter = magazine.charAt(i);

            int valueCount = magazineLetters.getOrDefault(letter, 0);

            magazineLetters.put(letter, valueCount + 1);
        }

        for(int i = 0; i < ransomNote.length(); i++)
        {
            char letter = ransomNote.charAt(i);

            int valueCount = magazineLetters.getOrDefault(letter, 0);

            if(valueCount == 0)
            {
                return false;
            }

            magazineLetters.put(letter, valueCount - 1);
        }

        return true;
    }
}