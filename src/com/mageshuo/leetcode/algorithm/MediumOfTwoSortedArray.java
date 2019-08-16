package com.mageshuo.leetcode.algorithm;

// todo fix it
public class MediumOfTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] concat = new int[nums1.length + nums2.length];
        int i = 0, j = 0, move = 0;
        while(i < nums1.length && j < nums2.length ) {
            if(nums1[i] <= nums2[j]) {
                concat[move] = nums1[i];
                i++;
            } else {
                concat[move] = nums2[j];
                j++;
            }
            move++;
        }

        if (move % 2 == 0) {
            return concat[move / 2];
        } else {
            return  (concat[move / 2 - 1] + concat[move / 2]) / 2;
        }

    }


}
