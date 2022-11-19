package Miscellaneous;

public class RomanToInteger 
{

    public static void main(String args[])
    {

    }

    public static int romanToInteger(String s)
    {
        int result = 0;
        int currentNumber = 0;
        int previousNumber = 0;

        for(int i = s.length() - 1; i >= 0; i--)
        {
            switch(s.charAt(i))
            {
                case 'I':
                    currentNumber = 1;
                    break;
                
                case 'V':
                    currentNumber = 5;
                    break;
                
                case 'X':
                    currentNumber = 10;
                    break;

                case 'L':
                    currentNumber = 50;
                    break;

                case 'C':
                    currentNumber = 100;
                    break;

                case 'D':
                    currentNumber = 500;
                    break;

                case 'M':
                    currentNumber = 1000;
                    break;
            }
            
            if(previousNumber > currentNumber)
            {
                result -= currentNumber;
            }
            else
            {
                result += currentNumber;
                previousNumber = currentNumber;
            }
        }
    }
    
}
