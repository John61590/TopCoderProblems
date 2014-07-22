package SRM208.DIV2;

import java.util.HashSet;
import java.util.Set;

/**
 * SRM 145 DIV 2 250 point
 *
 * Problem: Given letters, count how many of them occur in a array of strings
 *
 * HashSet used for faster lookup here. O(1) instead of O(n) lookup with ArrayList. No duplicates in input supposedly.
 *
 * http://community.topcoder.com/stat?c=problem_statement&pm=1728
 */
public class ImageDithering {
    public int count(String dithered, String[] screen)
    {
        int sum = 0;
        Set<Character> colors = new HashSet<Character>();
        for (char c : dithered.toCharArray()) {
            colors.add(c);
        }
          for (String row : screen) {
              for (char pixel : row.toCharArray()) {
                  if (colors.contains(pixel)) {
                      sum++;
                  }
              }
          }
        return sum;
    }
}
