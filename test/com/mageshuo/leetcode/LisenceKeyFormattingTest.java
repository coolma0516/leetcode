package com.mageshuo.leetcode;


import com.mageshuo.leetcode.algorithm.LisenceKeyFormatting;

public class LisenceKeyFormattingTest {
    public static void main(String[] args) {
        String result;
        LisenceKeyFormatting formatting = new LisenceKeyFormatting();
        String string1 = "5F3Z-2e-9-w";
        int k1 = 4;
        result = formatting.licenseKeyFormatting(string1, k1);
        assert result.equals("5F3Z-2E9W") : "Not right";
        System.out.println(result);
        String string2 = "2-5g-3-J";
        int k2 = 2;
        result = formatting.licenseKeyFormatting(string2, k2);
        assert result.equals("2-5G-3J") : "Not cool";
        System.out.println(result);
    }
}
