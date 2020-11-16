package com.leetcode.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//三数之和
public class Problem15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 3) return res;
        Arrays.sort(nums);
        if(nums.length == 3){
            if(nums[0]+nums[1]+nums[2] == 0){
                List<Integer> tmp = new ArrayList<>();
                tmp.add(nums[0]);
                tmp.add(nums[1]);
                tmp.add(nums[2]);
                res.add(tmp);
                return res;
            }

        }
        int len = nums.length;
        int a, b, c, sum;
        for (a = 0; a < len - 3; a++) {
            if (a > 0 && nums[a] == nums[a - 1]) continue;

            b = a + 1;
            c = len - 1;
            while (b < c) {
                sum = nums[a] + nums[b] + nums[c];
                if (sum < 0) b++;
                else if (sum > 0) c--;
                else {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[a]);
                    tmp.add(nums[b]);
                    tmp.add(nums[c]);
                    res.add(tmp);
                    while ((b += 1) < c && nums[b - 1] == nums[b]) {
                        continue;
                    }
                    while ((c -= 1) > b && nums[c] == nums[c + 1]) {
                        continue;
                    }
                }
            }
        }
        return res;
    }
}
