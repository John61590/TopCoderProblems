package SRM148.DIV2;

/**
 * SRM 148 DIV 2 250 point
 * returns how many digits in number that number itself is divisible by
 */
public class DivDigits {
    public static int howMany(int number)
    {
        int divSum = 0;
        for (char c : String.valueOf(number).toCharArray())
        {
            if (c != '0' && number % (c - '0') == 0)
            {
                divSum++;
            }
        }
        return divSum;
    }
    public static void main(String[] args)
    {
        //Test cases
        System.out.println(howMany(12345));
        System.out.println(howMany(661232));
        System.out.println(howMany(52527));
        System.out.println(howMany(730000000));
    }
}
