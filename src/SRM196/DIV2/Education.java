package SRM196.DIV2;

/**
 * Created by john on 4/28/14.
 * SRM 196 DIV 2 250
 * http://community.topcoder.com/stat?c=problem_statement&pm=2826
 */
public class Education {
    /**
     *   (392 [test score sum] + x) / 6 [tests.length + 1] = 80 ["B"] and solve for X
     * @param desire length 1, "A", "B", "C", or "D"
     * @param tests 0 to 20 elements, each between 0 and 100 except the final test score
     * @return int the lowest possible test score for the final test that will earn at least the desired grade
     * if perfect score, -1
     */
    public static int minimize(String desire, int[] tests)
    {
        int r = 0;
        if (desire.equals("A")) r *= 90;
        if (desire.equals("B")) r *= 80;
        if (desire.equals("C")) r *= 70;
        if (desire.equals("D")) r *= 60;
        for (int x : tests) r-=x;
        if (r < 0) r = 0;
        if (r > 100) r = -1;
        return r;
    }
    public static void main(String[] args)
    {

        System.out.println(minimize("B", new int[]{100, 100, 100, 100, 100, 100}));
    }

}
