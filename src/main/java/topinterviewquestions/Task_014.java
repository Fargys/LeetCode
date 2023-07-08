package topinterviewquestions;

import java.util.Arrays;

// https://leetcode.com/problems/longest-common-prefix/?envType=featured-list&envId=top-interview-questions
public class Task_014 {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length -1];
        int pointer = 0;

        while(pointer < first.length() && pointer < last.length()) {
            if(first.charAt(pointer) == last.charAt(pointer))
                pointer++;
            else
                break;
        }

        return first.substring(0, pointer);
    }
}
