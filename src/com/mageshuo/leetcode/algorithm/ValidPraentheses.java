package com.mageshuo.leetcode.algorithm;

import java.util.HashMap;
import java.util.Stack;

public class ValidPraentheses {
    private HashMap<Character, Character> hashMap = new HashMap<>();
    public ValidPraentheses() {
        this.hashMap.put('}', '{');
        this.hashMap.put(']', '[');
        this.hashMap.put('}', '{');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // if the current character is the closing bracket.
            if(this.hashMap.containsKey(c)) {
                char topElement = stack.empty() ? '#' : stack.pop();
                // if the mapping for the bracket doesn't match the top element,
                if(topElement != this.hashMap.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

}
