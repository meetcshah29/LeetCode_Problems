package Arrays;

public class MaxArea 
{
    public static void main(String args[])
    {

    }

    public static int maxArea(int height[])
    {
        int startPointer = 0;
        int endPointer = height.length - 1;
        int startPointerHeight = height[startPointer];
        int endPointerHeight = height[endPointer];
        int maxArea = 0;

        while(startPointer < endPointer)
        {
            maxArea = Math.max(maxArea, Math.min(startPointerHeight, endPointerHeight) * (endPointer - startPointer));

            if(startPointerHeight <= endPointerHeight)
            {
                while(startPointer < endPointer && height[startPointer] <= startPointerHeight)
                {
                    startPointer++;
                }

                startPointerHeight = height[startPointer];
            }

            else
            {
                while(startPointer < endPointer && height[endPointer] <= endPointerHeight)
                {
                    endPointer--;
                }

                endPointerHeight = height[endPointer];
            }
        }

        return maxArea;
    }
    
}
