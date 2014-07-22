package SRM624.DIV2;

import java.util.Arrays;

/**
 * SRM 624 DIV 2 250 point
 * Find k smallest numbers in an array
 * Solution: could sort and find the lowest two, however it is not O(n) in the worst case
 */
public class CostOfDancing {
    public static int minimum(int k, int[] danceCost)
    {
        Arrays.sort(danceCost);
        int sum = 0;
        for (int i = 0; i < k; i++)
        {
            sum += danceCost[i];
        }
        return sum;
    }
}
