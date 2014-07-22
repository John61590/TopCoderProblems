package SRM206.DIV2;

/**
 * SRM 206 DIV 2 250 point
 * Created by john on 4/28/14.
 * Determine the minimum number of bits that must be used to represent the binary
 * http://community.topcoder.com/stat?c=problem_statement&pm=520
 */
public class Bits {
    public static int bits(int n)
    {
       //log base 2
       return (int)(Math.log(n) / Math.log(2)) + 1;
    }
    public static void main(String[] args)
    {
        System.out.println(bits(32));
    }

}
