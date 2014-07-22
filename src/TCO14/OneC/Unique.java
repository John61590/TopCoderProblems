package TCO14.OneC;

/**
 * Created by john on 4/28/14.
 * http://community.topcoder.com/stat?c=problem_statement&pm=13067
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
