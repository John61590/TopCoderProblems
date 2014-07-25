package SRM150.DIV2;

/**
 * SRM 150 DIV 2 250 point
 */
public class WidgetRepairs {
    public static int days(int[] arrivals, int numPerDay)
    {
        int dayCount = 0;
        int sum = 0;
         for (int i : arrivals)
         {
             sum += i;
             //if you have quantity left that is carried over to the next day
             if (sum > 0)
             {
                 dayCount++;
                 sum -= Math.min(numPerDay, sum);
             }
         }
        //if quantity left over after array loop is finished
        if (sum > 0)
        {

            dayCount += (sum + numPerDay - 1) / numPerDay;
        }
        return dayCount;
    }
    public static void main(String[] args)
    {
        //Test cases
        System.out.println(days(new int[]{10, 0, 0, 4, 20}, 8));
        System.out.println(days(new int[]{0, 0, 0}, 10));
        System.out.println(days(new int[]{100, 100}, 10));
        System.out.println(days(new int[]{ 27, 0, 0, 0, 0, 9 }, 9));
        System.out.println(days(new int[]{ 6, 5, 4, 3, 2, 1, 0, 0, 1, 2, 3, 4, 5, 6 }, 3));
    }
}
