package SRM627.DIV2;

/**
 * SRM 627 DIV 2 250 point
 */
public class ManySquares {
    public static int howManySquares(int[] sticks)
    {
        //each stick element will be between 1 and 1000 so need a array/hashmap big enough
        int[] cnt = new int[1024];
        for (int x : sticks)
        {
             cnt[x] += 1;
        }
        int res = 0;
        for (int i = 0; i < cnt.length; i++)
        {
            res += cnt[i] / 4;
        }
        return res;
    }
    public static void main(String[] args)
    {
        //Test cases:
        //Need multiple of 4 of the same number in order to make a square so in this case, 4 1's make a square of 1
        System.out.println(howManySquares(new int[]{1, 1, 2, 2, 1, 1, 2}));
    }
}
