package SRM587.DIV2;

/**
 *
 * SRM 587 DIV 2 200 point (Transform Init into goal, can you do it?)
 * http://community.topcoder.com/stat?c=problem_statement&pm=12700
 */
public class InsertZ {
    public static String canTransform(String init, String goal)
    {
       return init.compareTo(goal.replaceAll("z", "")) == 0 ? "Yes" : "No";
    }
    public static void main(String[] args)
    {
        System.out.println(canTransform("fox", "fzozxz"));
    }
}
