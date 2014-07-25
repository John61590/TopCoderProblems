package SRM178.DIV2;

import java.util.regex.Pattern;

/**
 * SRM 178 DIV 2 250 point
 * Type: String parsing
 * http://community.topcoder.com/stat?c=problem_statement&pm=2272
 */
public class SimpleCalculator {
    public static int calculate(String input)
    {
       String[] numbers = input.split("[+-/*]");
       String operand = input.replaceAll("\\d+", ""); //replace all digits to have operand left
        if (operand.equals("+")) {
            return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
        } else if (operand.equals("-")) {
            return Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]);
        } else if (operand.equals("*")) {
            return Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]);
        } else if (operand.equals("/")) {
            return Integer.parseInt(numbers[0]) / Integer.parseInt(numbers[1]);
        } else {
            return 0;
        }

    }
    public static void main(String[] args)
    {
        System.out.println(calculate("5/3"));
        System.out.println(calculate("15*3"));
        System.out.println(calculate("1-10000"));
        System.out.println(calculate("17+18"));
        System.out.println(calculate("0000000000000018/00000000000000000009"));
    }
}
