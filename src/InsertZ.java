/**
 * Created with IntelliJ IDEA.
 * User: john
 * Date: 11/13/13
 * Time: 8:42 PM
 * SRM 587 DIV 2 200 point (Transform Init into goal, can you do it?)
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
