package SRM164.DIV2;

/**
 * SRM 164 DIV 2 250 point
 * Right Justifier
 * Problem: All strings must have the same characters as longest string in array, if not, must add blanks to the left
 * http://community.topcoder.com/stat?c=problem_statement&pm=1757
 */
public class Justifier {
    public static String[] justify(String[] textIn)
    {
         int maxLength = 0;
          for (String s : textIn) {
              maxLength = Math.max(maxLength, s.length());
          }
          for (int i = 0; i < textIn.length; i++) {
                  while (textIn[i].length() != maxLength) {
                      StringBuilder stringBuilder = new StringBuilder(textIn[i]);
                      stringBuilder.insert(0, ' ');
                      textIn[i] = stringBuilder.toString();
                  }
          }
        return textIn;
    }
    public static void main(String[] args)
    {
        //Test cases
        String[] array = justify(new String[]{"BOB", "TOMMY", "JIM"});
        for (String s : array)
        {
            System.out.println(s);
        }
        String[] array2 = justify(new String[]{"JOHN","JAKE","ALAN","BLUE"});
        for (String s : array2)
        {
            System.out.println(s);
        }
        String[] array3 = justify(new String[]{"LONGEST","A","LONGER","SHORT"});
        for (String s : array3)
        {
            System.out.println(s);
        }
    }
}
