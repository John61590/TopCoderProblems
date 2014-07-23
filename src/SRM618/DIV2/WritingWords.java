package SRM618.DIV2;

/**
 * SRM 618 DIV 2 250 point
 * Problem description: Given a string with all capitals, count the number associated with it (i.e. 1 for A and 26 for Z)
 * Solution: 'A' in ASCII is 65 so find out the number associated with it by subtracting the character minus 'A' and adding one
 * (since 1 is already 'A')
 * http://community.topcoder.com/stat?c=problem_statement&pm=13072
 */
public class WritingWords {
    public static int write(String word)
    {
        int sum = 0;
        for (char c : word.toCharArray())
        {
             sum += c - 'A' + 1;
        }
        return sum;
    }
    public static void main(String[] args)
    {
         //Test cases
         System.out.println(write("VAMOSGIMNASIA"));
    }
}
