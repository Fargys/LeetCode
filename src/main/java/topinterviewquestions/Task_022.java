package topinterviewquestions;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/generate-parentheses/?envType=featured-list&envId=top-interview-questions
public class Task_022 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backtracking(result, sb, 0, 0, n);
        return result;
    }

    private void backtracking(List<String> list, StringBuilder sb, int open, int close, int max) {
        if (sb.length() == max * 2) {
            list.add(sb.toString());
            return;
        }

        if (open < max){
            sb.append("(");
            backtracking(list, sb, open + 1, close, max);
            sb.deleteCharAt(sb.length() - 1);
        }

        if (close < open){
            sb.append(")");
            backtracking(list, sb, open, close + 1, max);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
