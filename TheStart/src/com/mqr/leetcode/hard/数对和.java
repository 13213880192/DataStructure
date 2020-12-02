package com.mqr.leetcode.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 数对和 {

    public static List<List<Integer>> pairSums(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList();
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            if (nums[start] + nums[end] == target) {
                List<Integer> lis = new ArrayList<>();
                lis.add(nums[start]);
                lis.add(nums[end]);
                list.add(lis);
                start++;
                end--;
            } else if (nums[start] + nums[end] < target) {
                start++;
            } else {
                end--;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = pairSums(new int[]{5, 6, 3, -6, 2, 1, 1, 0, 8, 0},
                2);
        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.println(integer);
            }
        }
    }

}
