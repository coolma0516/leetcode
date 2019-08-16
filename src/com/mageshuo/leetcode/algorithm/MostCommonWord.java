package com.mageshuo.leetcode.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.toLowerCase().split("\\W+");

        // add banned words to Set
        Set<String> set = new HashSet<>();
        for(String word: banned) {
            set.add(word);
        }

        // add paragraph words to Map
        Map<String, Integer> map = new HashMap<>();
        for(String word: words) {
            if(!set.contains(word)) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        // get the frequent word
        int max = 0;
        String res = "";
        for(String string: map.keySet()) {
            if(map.get(string) > max) {
                max = map.get(string);
                res = string;
            }
        }
        return res;

    }
}
