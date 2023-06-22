package topinterviewquestions;

/**
 * Return x with its digits reversed
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 */
public class Task_007 {
    public int reverse(int x) {
        int result = 0, pop;

        while(x != 0) {
            pop = x % 10;
            x = x / 10;
            if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            result = result * 10 + pop;
        }

        return result;
    }
}
