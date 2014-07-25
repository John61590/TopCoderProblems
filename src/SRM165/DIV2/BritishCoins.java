package SRM165.DIV2;

/**
 *   SRM 165 DIV 2 250 point
 *
 *  Problem: return number an array of {pounds, shillings, pennies} given pence
 *  http://community.topcoder.com/stat?c=problem_statement&pm=1862
 */
public class BritishCoins {
    public static int[] coins(int pence)
    {
        //alternate way
//        int pounds = pence / (12 * 20);
//        int shillings = (pence - ((12 * 20) * pounds)) / 12;
//        int penny = pence - ((12 * 20) * pounds) - (12 * shillings);
        return new int[]{pence / 240, (pence / 12) % 20, pence % 12};
    }
    public static void main(String[] args)
    {
        //Test cases
        int[] coins = coins(533);
        for (int i : coins)
        {
            System.out.println(i);
        }
        int[] coins2 = coins(0);
        for (int i : coins2)
        {
            System.out.println(i);
        }
        int[] coins3 = coins(6);
        for (int i : coins3)
        {
            System.out.println(i);
        }
        int[] coins4 = coins(4091);
        for (int i : coins4)
        {
            System.out.println(i);
        }
        int[] coins5 = coins(10000);
        for (int i : coins5)
        {
            System.out.println(i);
        }

    }
}
