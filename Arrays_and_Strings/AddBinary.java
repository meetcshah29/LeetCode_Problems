package Arrays_and_Strings;

import java.uti.*;

public class AddBinary {

    public static void main(String args[])
    {

    }

    public static addBinary(String a, String b)
    {
        StringBuilder result = new StringBuilder();
        int m = a.length() - 1;
        int n = b.length() - 1;
        int carry = 0;

        while(m >= 0 || n >= 0)
        {
            int sum = carry;

            if(m >= 0)
            {
                sum += a.charAt(m) - '0';            
            }
            if(n >= 0)
            {
                sum += b.charAt(n) - '0';
            }

            if(sum > 1)
            {
                carry = 1;
            }
            else
            {
                carry = 0;
            }

            result.append(sum % 2);
            m--;
            n--;
        }

        if(carry != 0)
        {
            result.append(carry);
        }

        return result;

    }
    
}
