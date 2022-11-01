package Arrays_and_Strings;

public class ReverseWords {

    public static void main (String args[])
    {

    }

    public static String reverseWords(String s)
    {
        if(s == null)
        {
            return null;
        }

        char [] a = s.toCharArray();
        int n = a.length;
        reverse(a, 0, n - 1);
        reverseWords(a, n);
        return cleanSpaces(a, n);
    }

    public static void reverseWords(char [] a, int n)
    {
        int i = 0;
        int j = 0;

        while(i < n)
        {
            while(i < j || i < n && a[i] == ' ')
            {
                i++;
            }
            while(j < i || j < n && a[j] != ' ')
            {
                j++;
            }
            reverse(a, i, j - 1);
        }

    }

    public static String cleanSpaces(char [] a, int n)
    {
        int i = 0;
        int j = 0;

        while(j < n)
        {
            while(j < n && a[j] == ' ')
            {
                j++;
            }
            while(j < n && a[j] != ' ')
            {
                a[i] = a[j];
                i++;
                j++;
            }
            while(j < n && a[j] == ' ')
            {
                j++;
            }
            if(j < n)
            {
                a[i] = ' ';
                i++;
            }
        }

        return new String(a).substring(0, i);

    }

    public static void reverse(char[] a, int start, int end)
    {
        while(start < end)
        {
            char temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
    
}
