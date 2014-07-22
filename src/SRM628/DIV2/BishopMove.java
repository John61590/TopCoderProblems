package SRM628.DIV2;

/**
 * SRM 628 DIV 2 250 point
 * Date: 7/22/14
 * http://community.topcoder.com/stat?c=problem_statement&pm=13280
 */
public class BishopMove {
    public static int howManyMoves(int r1, int c1, int r2, int c2)
    {
        if (r1 == r2 && c1 == c2)
        {
            return 0;
        }
        if ((r1 + c1 - r2 - c2) % 2 != 0)
        {
            return -1;
        }
        int k = r2 - r1;
        if (k == c2 - c1 || k == c1 - c2)
        {
            return 1;
        }
        return 2;
    }
    public static void main(String[] args)
    {
        System.out.println(howManyMoves(1, 3, 5, 5));
    }
}
