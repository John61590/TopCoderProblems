package SRM625.DIV2;

/**
 * SRM 625 DIV 2 250 point
 */
public class AddMultiply {
    public static int[] makeExpression(int y)
    {
         return new int[]{300, 3, y - 900};
    }
    public static void main(String[] args)
    {
        int[] a = makeExpression(6); // return {300, 3, -894}: (300 * 3) + (-894) = 6
        for (int i : a)
        {
            System.out.println(i);
        }
    }
}
