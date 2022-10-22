package Arrays_and_Strings;

import java.util.*;

public class SpiralMatrix {

    public static void main (String args[])
    {

    }

    public static List<Integer> spiralMatrix(int [][] matrix)
    {
        List<Integer> result = new ArrayList<>();
        int startRow = 0;
        int startColumn = 0;
        int endRow = matrix.length - 1;
        int endColumn = matrix[0].length - 1;
        
        while(startRow <= endRow && startColumn <= endColumn)
        {
            for(int j = startColumn; j <= endColumn; j++)
            {
                result.add(matrix[startRow][j]);
            }
            for(int i = startRow + 1; i <= endRow; i++)
            {
                result.add(matrix[i][endColumn]);
            }
            for(int j = endColumn - 1; j >= startColumn; j--)
            {
                if(startRow == endRow)
                {
                    break;
                }
                result.add(matrix[endRow][j]);
            }
            for(int i = endRow - 1; i >= startRow + 1; i--)
            {
                if(startColumn == endColumn)
                {
                    break;
                }
                result.add(matrix[i][startColumn]);
            }
            
            startRow++;
            startColumn++;
            endRow--;
            endColumn--;
        }
        
        return result; 
        
    }
    
}
