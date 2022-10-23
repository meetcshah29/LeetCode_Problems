package Arrays_and_Strings;

import java.util.*;

public class PascalTriangle {

    public static void main(String args[])
    {

    }

    public static List<List<Integer>> pascalTriangle(int numRows)
    {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> row = null;
        List<Integer> previousRow = null;

        for(int i = 0; i < numRows; i++)
        {
            row = new ArrayList<Integer>();

            for(int j = 0; j <= i; j++)
            {
                if(j == 0 || j == i)
                {
                    row.add(1);
                }
                else
                {
                    row.add(previousRow.get(j - 1) + previousRow.get(j));
                }
            }

            previousRow = row;
            result.add(row);
        }

        return result;

    }
    
}
