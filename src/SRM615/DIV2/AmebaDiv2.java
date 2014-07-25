package SRM615.DIV2;

/**
 * SRM 615 DIV 2 250 point
 * Type: Simulation
 */
public class AmebaDiv2 {
    public static int simulate(int[] x, int a)
    {
        for (int i : x)
        {
           if (i == a)
           {
               a *= 2;
           }
        }
        return a;

    }
    public static void main(String[] args)
    {
       System.out.println(simulate(new int[]{2, 1, 3, 1, 2}, 1));
        System.out.println(simulate(new int[]{1,4,9,16,25,36,49}, 10));
       System.out.println(simulate(new int[]{1,2,4,8,16,32,64,128,256,1024,2048}, 1));
       System.out.println(simulate(new int[]{817,832,817,832,126,817,63,63,126,817,832,287,823,817,574}, 63));
    }
}
