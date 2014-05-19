/**
 * Created by john on 4/28/14.
 */
public class Unique {
    public String removeDuplicates(String s)
    {
       String ret = "";
       char[] arr = ret.toCharArray();
       for (char c : arr)
       {
          if (!ret.contains(""+c))
          {
             ret+=c;
          }
       }
        return ret;

    }
}
