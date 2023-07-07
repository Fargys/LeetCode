package topinterviewquestions;

/**
 * Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where: <br><br>
 * '.' Matches any single character.​​​​<br><br>
 * '*' Matches zero or more of the preceding element.<br><br>
 * The matching should cover the entire input string (not partial).
 */
public class Task_010 {
    public boolean isMatch(String text, String pattern) {
        if (pattern == null || pattern.length() == 0) return (text == null || text.length() == 0);

        boolean[][] dp = new boolean[text.length() + 1][pattern.length() + 1];

        dp[0][0] = true;

        for(int j = 2; j <= pattern.length(); j++)
            dp[0][j] = ('*' == pattern.charAt(j - 1)) && dp[0][j - 2];

        for(int j = 1; j <= pattern.length(); j++) {
            for(int i = 1; i <= text.length(); i++) {
                if(text.charAt(i - 1) == pattern.charAt(j - 1) || '.' == pattern.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
                else if ('*' == pattern.charAt(j - 1))
                    dp[i][j] = dp[i][j-2] || (text.charAt(i - 1) == pattern.charAt(j - 2) || '.' == pattern.charAt(j - 2)) && dp[i - 1][j];
            }
        }

        return dp[text.length()][pattern.length()];
    }
}

/*
s(i)="aab", p(j)="c*a*b"

  i   c * a * b
j   0 1 2 3 4 5
  0 y n y n y n
a 1 n n n y y n
a 2 n n n n y n
b 3 n n n n n y

s(i)="mississippi", p(j)="mis*is*ip*."

  i   m i s * i s * i p * .
j   0 1 2 3 4 5 6 7 8 9 0 1
  0 y n n n n n n n n n n n
m 1 n y n n n n n n n n n n
i 2 n n y n y n n n n n n n
s 3 n n n y y n n n n n n n
s 4 n n n n y n n n n n n n
i 5 n n n n n y n y n n n n
s 6 n n n n n n y y n n n n
s 7 n n n n n n n y n n n n
i 8 n n n n n n n n y n y n
p 9 n n n n n n n n n y y y
p 0 n n n n n n n n n n y y
i 1 n n n n n n n n n n n y
 */

