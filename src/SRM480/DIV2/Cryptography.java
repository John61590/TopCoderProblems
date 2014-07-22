package SRM480.DIV2;

import java.util.Arrays;

/**
 * User: John Bohne
 * Date: 11/13/13
 * SRM144.DIV2.Time: 9:04 PM
 * SRM480 Div 2  250 points = add 1 to a number but everything multiplied in array has to be the greatest possible choice
 * soln: sort array because lowest is always best choice?
 */
public class Cryptography {
    public static long encrypt(int[] numbers)
    {
        Arrays.sort(numbers);
        long result = numbers[0] + 1;
        for (int i = 1; i < numbers.length; i++)
        {
            result *= numbers[i];
        }
        return result;
    }
    public static void main(String[] args)
    {
        int[] array = {6, 5, 5};
        System.out.println(encrypt(array));
    }
}
