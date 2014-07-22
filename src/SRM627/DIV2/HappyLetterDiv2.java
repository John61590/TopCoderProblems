package SRM627.DIV2;

import java.util.HashMap;

/**
 * SRM 627 DIV 2 500 point
 */
public class HappyLetterDiv2 {
    public static char getHappyLetter(String letters)
    {
        //store characters in hash map
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for (int i = 0; i < letters.length(); i++)
        {
            char c = letters.charAt(i);
            if (hashMap.get(c) == null)
            {
                //found new character, so put a count of 1
                hashMap.put(c, 1);
            } else {
                hashMap.put(c, hashMap.get(c)+1);
            }
        }
        int max = 0, sum = 0;
        char maxChar = '\0';
        for (char c : hashMap.keySet())
        {
            int count = hashMap.get(c);
            sum += count;
            if (count > max)
            {
                max = count;
                maxChar = c; //maxChar occurs the most often (highest count)
            }
        }
        return 2*max > sum ? maxChar : '.';
    }
    public static void main(String[] args)
    {
        //Test cases
        System.out.println(getHappyLetter("aacaaa"));  // return 'a' since 'a' and 'c' go first and then 'a' is remaining
        System.out.println(getHappyLetter("dcdjx")); // return '.' no happy letter since 'c', 'd', 'j' or 'x' can be winner
        System.out.println(getHappyLetter("bcbbbbba")); //return 'b'
        System.out.println(getHappyLetter("aabc"));  // return '.' since no happy letter since only 'a' can be the winning letter
    }
}
