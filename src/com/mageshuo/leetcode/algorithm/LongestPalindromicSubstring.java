package com.mageshuo.leetcode.algorithm;

/***
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 *
 * Example 1:
 *
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 *
 * Example 2:
 *
 * Input: "cbbd"
 * Output: "bb"
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int n = s.length();
        String result = null;
        boolean[][] dp = new boolean[n][n];

        for(int i = n - 1; i >= 0; i--) {
            for(int j = i; j < n; j++) {
                //check if the substring is palindrome
                dp[i][j] = (s.charAt(i) == s.charAt(j))
                           && ((j - i < 3) || dp[i + 1][j - 1]);
                if(dp[i][j] && (result == null || j - i + 1 > result.length())) {
                    result = s.substring(i, j + 1);
                }
            }
        }
        return result;
    }


}
