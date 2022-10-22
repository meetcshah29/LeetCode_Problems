package Arrays_and_Strings;

public class DiagonalTraversal {

    public static void main(String args[])
    {

    }

    public static int [] traverseDiagonally(int [][] mat)
    {
        int m = mat.length;
        int n = mat[0].length;
        int row = 0;
        int column = 0;

        int result [] = new int[n * m];

        for(int i = 0; i < n * m; i++)
        {
            result[i] = mat[row][column];
            
            if((row + column) % 2 == 0)
            {
                if(column == n - 1)
                {
                    row++;
                }
                else if(row == 0)
                {
                    column++;
                }
                else
                {
                    row--;
                    column++;
                }
            }
            else
            {
                if(row == m - 1)
                {
                    column++;
                }
                else if(column == 0)
                {
                    row++;
                }
                else
                {
                    row++;
                    column--;
                }
            }
        }

        return result;
    }
    
}
