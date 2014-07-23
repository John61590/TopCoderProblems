package SRM624.DIV2;

import java.util.Arrays;

/**
 * Created by john on 7/23/14.
 * SRM 624 500 point
 * http://community.topcoder.com/stat?c=problem_statement&pm=13215
 */
public class BuildingHeightsEasy {
    public static int minimum(int m, int[] heights)
    {
       Arrays.sort(heights);
       int ans = Integer.MAX_VALUE;
       for (int i = 0; i + m <= heights.length; i++)
       {
             int cur = m * heights[i + m - 1];
             for (int j = 0; j < m; j++)
             {
                 cur -= heights[i + j];
             }
             ans = Math.min(ans, cur);
       }
       return ans;


    }
    public static void main(String[] args) {
        //Test cases given in problem statement
        System.out.println(minimum(2, new int[]{1, 2, 1, 4, 3}));
        System.out.println(minimum(3, new int[]{1, 3, 5, 2, 1}));
        System.out.println(minimum(1, new int[]{43, 19, 15}));
        System.out.println(minimum(3, new int[]{19, 23, 9, 12}));
        System.out.println(minimum(12, new int[]{25, 18, 38, 1, 42, 41, 14, 16, 19, 46, 42, 39,
                38, 31, 43, 37, 26, 41, 33, 37, 45, 27, 19, 24, 33, 11, 22, 20, 36, 4, 4}));
    }
}
