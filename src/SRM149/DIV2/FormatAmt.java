package SRM149.DIV2;

/**
 * SRM 149 DIV 2 250 point
 * http://community.topcoder.com/stat?c=problem_statement&pm=1313
 */
public class FormatAmt {
    public static String amount(int dollars, int cents)
    {
        //%,d = grouping dollars by commas, %02d = 2 char width with trailing zeros
          return String.format("$%,d.%02d", dollars, cents);
    }
    public static void main(String[] args)
    {
        System.out.println(amount(123456, 0));
        System.out.println(amount(49734321, 9));
        System.out.println(amount(0, 99));
        System.out.println(amount(249, 30));
        System.out.println(amount(1000, 1));
    }
}
