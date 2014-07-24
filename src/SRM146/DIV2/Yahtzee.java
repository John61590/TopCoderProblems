package SRM146.DIV2;

import java.util.HashMap;

/**
 * SRM 146 DIV 2 250 point
 * http://community.topcoder.com/stat?c=problem_statement&pm=1692
 */
public class Yahtzee {
     public static int maxPoints(int[] toss)
     {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i : toss)
        {
            if (hashMap.get(i) == null)
            {
                hashMap.put(i, i);
            } else {
                //store the sum associated with each number
                hashMap.put(i, hashMap.get(i)+i);
            }
        }
        int max = 0;

        for (Integer k : hashMap.keySet())
        {
            //find the max sum in the hashMap
            max = Math.max(max, hashMap.get(k));


        }
         return max;
     }
    public static void main(String[] args)
    {
        //Test cases
        System.out.println(maxPoints(new int[]{2, 2, 3, 5, 4}));
        System.out.println(maxPoints(new int[]{ 6, 4, 1, 1, 3 }));
        System.out.println(maxPoints(new int[]{ 5, 3, 5, 3, 3 }));
    }
}
