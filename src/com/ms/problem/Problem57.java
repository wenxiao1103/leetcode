package com.ms.problem;

import java.util.ArrayList;
import java.util.List;

//和为S的连续正数序列,采用双指针，这题很有意思
public class Problem57 {
    public int[][] findContinuousSequence(int target) {
        int left = 1, right = 1;
        int sum = 0;
        List<int[]> res = new ArrayList<>();
        while(left <= target/2) {
            if(sum < target){
                sum += right++;
            }else if (sum > target){
                sum -= left++;
            }else {
                int[] arr = new int[right-left];
                for (int k = left; k < right; k++){
                    arr[k-left] = k;
                }
                res.add(arr);
                sum -= left++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
