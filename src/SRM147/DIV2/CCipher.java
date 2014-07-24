package SRM147.DIV2;

/**
 * SRM 147 DIV 2 250 point
 * Caesar Cipher
 */
public class CCipher {
    public static String decode(String cipherText, int shift)
    {
        String retString = "";
        for (char c : cipherText.toCharArray())
        {

            int x = c - shift;
            //if you get a negative result when shifting like A to Q with 10 shift, add 26 to it to get the right number
            if (x < 'A') x += 26;
            retString += (char)x;
        }
        return retString;
    }
    public static void main(String[] args)
    {
        System.out.println(decode("VQREQFGT", 2));
        System.out.println(decode("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 10));
        System.out.println(decode("TOPCODER", 0));
        System.out.println(decode("ZWBGLZ", 25));
    }
}
