package Arrays;

public class MergeSortedArrays {

    public static void main (String args[])
    {

    }

    public static void mergeSortedArrays(int m, int nums1[], int n, int nums2[])
    {
        int duplicateArray1 [] = new int[m];

        for(int i = 0; i < m; i++)
        {
            duplicateArray1[i] = nums1[i]; 
        }

        int pointer1 = 0;
        int pointer2 = 0;

        for(int p = 0; p < m + n; p++)
        {
            if(pointer2 >= n || pointer1 < m && duplicateArray1[pointer1] < nums2[pointer2])
            {
                nums1[p] = duplicateArray1[pointer1];
                pointer1++;
            }

            else
            {
                nums1[p] = nums2[pointer2];
                pointer2++;
            }
        }
    }
    
}
