package topinterviewquestions;

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/?envType=featured-list&envId=top-interview-questions
public class Task_028 {
    public int strStr(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (haystack.charAt(i + j) != needle.charAt(j)) break;
            }
        }
    }
}
