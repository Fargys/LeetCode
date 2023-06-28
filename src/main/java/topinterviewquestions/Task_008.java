package topinterviewquestions;

/**
 * The myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
 */
public class Task_008 {
    public int myAtoi(String s) {
        int result = 0;

        int length = s.length();
        int index = 0;
        while (index < length && s.charAt(index) == ' ') ++index;

        boolean isNegative = false;
        if (index < length) {
            if (s.charAt(index) == '-') {
                isNegative = true;
                ++index;
            } else if (s.charAt(index) == '+')
                ++index;
        }


        while (index < length && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';

            if (result > (Integer.MAX_VALUE / 10) || (result == (Integer.MAX_VALUE / 10) && digit > 7))
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;

            result = (result * 10) + digit;
            ++index;
        }

        return isNegative ? -result : result;
    }
}
