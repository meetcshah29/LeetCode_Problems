package Queue;

import java.util.*;

public class WallsAndGates 
{
    public static void main(String args[])
    {

    }

    private static final int EMPTY = Integer.MAX_VALUE; // Value for an Empty Room
    private static final int GATE = 0; // Value for a Gated Room
    private static final List<int[]> DIRECTIONS = Arrays.asList // List of Direction Traversals
    (
     new int[] { 1,  0}, // Go down
     new int[] {-1,  0}, // Go up
     new int[] { 0,  1}, // Go right
     new int[] { 0, -1} // Go left
    );

    public static void wallsAndGates(int rooms[][])
    {
        int m = rooms.length; // Get the number of rows
        if (m == 0) 
        {
            return;
        }
        
        int n = rooms[0].length; // Get the number of columns
        Queue<int[]> q = new LinkedList<>();
        for (int row = 0; row < m; row++) 
        {
            for (int col = 0; col < n; col++) 
            {
                if (rooms[row][col] == GATE) 
                {
                    q.add(new int[] { row, col }); // Traverse through each row and column and add the gates to the queue
                }
            }
        }

        while (!q.isEmpty()) // Run if Queue is not empty
        {
            int[] point = q.poll();
            int row = point[0]; // Get the row of the point
            int col = point[1]; // Get the column of the point
            for (int[] direction : DIRECTIONS)  // Traverse from the point using the directions from above
            {
                int r = row + direction[0];
                int c = col + direction[1];
                if (r < 0 || c < 0 || r >= m || c >= n || rooms[r][c] != EMPTY) 
                {
                    continue; // Skip if row/column accessed is invalid or room is not empty
                }
                rooms[r][c] = rooms[row][col] + 1; 
                q.add(new int[] {r, c}); 
            }
        }
    }
    
}
