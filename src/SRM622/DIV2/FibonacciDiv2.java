package SRM622.DIV2;

/**
 * Created by john on 7/23/14.
 * SRM 622 DIV 2 250 point
 * Problem description: Finding steps to get to a certain fibonacci number given an integer
 * http://community.topcoder.com/stat?c=problem_statement&pm=13159
 */
public class FibonacciDiv2 {
    public static int find(int n)
    {
        //array holding fibonacci numbers
        int[] f = new int[100];
        f[0] = 0;
        f[1] = 1;
        int ans = n - 1;
        for (int i = 2; i < 100; i++)
        {
            //find each number in fibonacci sequence starting with the third
            f[i] = f[i - 1] + f[i - 2];
            ans = Math.min(ans, Math.abs(n - f[i]));
            if (f[i] > n)
            {
                break;
            }
        }
        return ans;

    }
    public static void main(String[] args)
    {
        System.out.println(find(1));
        System.out.println(find(13));
        System.out.println(find(15));
        System.out.println(find(19));
        System.out.println(find(1000000));
    }
}
