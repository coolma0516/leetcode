package com.mageshuo.leetcode.algorithm;

import java.util.List;

public class WordSearchII {
    public List<String> findWords(char[][] boards, String[] words) {

    }


    private void dfs(char[][] board, int i, int j, TrieNode p, List<String> res) {
        char c = board[i][j];
        if (c == '#' || p.next[c - 'a'] == null ) return;
        p = p.next[c - 'a'];
        if(p.word != null ) {
            res.add(p.word);
            p.word = null;
        }


    }
    public TrieNode buildTrieNode(String[] words) {
        TrieNode root = new TrieNode();
        for(String w: words) {
            TrieNode p = root;
            for(char c: w.toCharArray() ) {
                int i = c - 'a';
                if(p.next[i] == null) p.next[i] = new TrieNode();
                p = p.next[i];
            }
            p.word = w;
        }
        return root;
    }

    public static class TrieNode {
        TrieNode[] next = new TrieNode[26];
        String word;
    }
}
