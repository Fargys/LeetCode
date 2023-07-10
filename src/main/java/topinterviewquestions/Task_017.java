package topinterviewquestions;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/?envType=featured-list&envId=top-interview-questions
public class Task_017 {
    private final char[][] phoneLetters = {{'0'}, {'1'},
                                  {'a', 'b', 'c'}, {'d', 'e', 'f'},
            {'g', 'h', 'i'},      {'j', 'k', 'l'}, {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};

    public List<String> letterCombinations(String digits) {
        int length = digits.length();
        List<String> result = new ArrayList<>();

        if (length > 0)
            dfs(0, length, new StringBuilder(), result, digits);

        return result;
    }

    private void dfs(int position, int length, StringBuilder sb, List<String> result, String digits) {
        if (position != length) {
            char[] letters = phoneLetters[Character.getNumericValue(digits.charAt(position))];
            for (char letter : letters)
                dfs(position + 1, length, new StringBuilder(sb).append(letter), result, digits);
        } else {
            result.add(sb.toString());
        }
    }
}
