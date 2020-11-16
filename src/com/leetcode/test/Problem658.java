package com.leetcode.test;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xiaowen
 * @date 2020/10/20 10:26 下午
 *
 * 658. 找到 K 个最接近的元素
 *
 */
public class Problem658 {
    //    public List<Integer> findClosestElements(int[] arr, int k, int x) {
//        List<Integer> ret = Arrays.stream(arr).boxed().collect(Collectors.toList());
//        Collections.sort(ret, (a,b) -> a == b ? a - b : Math.abs(a-x) - Math.abs(b-x));
//        ret = ret.subList(0, k);
//        Collections.sort(ret);
//        return ret;
//    }
//    public List<Integer> findClosestElements(int[] arr, int k, int x) {
//        List<Integer> ret = Arrays.stream(arr).boxed().collect(Collectors.toList());
//        int n = ret.size();
//        if (x <= ret.get(0)) {
//            return ret.subList(0, k);
//        } else if (ret.get(n - 1) <= x) {
//            return ret.subList(n - k, n);
//        } else {
//            int index = Collections.binarySearch(ret, x);
//            if (index < 0)
//                index = -index - 1;
//            int low = Math.max(0, index - k - 1), high = Math.min(ret.size() - 1, index + k - 1);
//
//            while (high - low > k - 1) {
//                if ((x - ret.get(low)) <= (ret.get(high) - x))
//                    high--;
//                else if ((x - ret.get(low)) > (ret.get(high) - x))
//                    low++;
//                else
//                    System.out.println("unhandled case: " + low + " " + high);
//            }
//            return ret.subList(low, high + 1);
//        }
//    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ret = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int n = ret.size();
        if (x <= ret.get(0)) return ret.subList(0, k);
        else if (ret.get(n-1) <= x) return ret.subList(n-k, n);
        else {
            int index = Collections.binarySearch(ret, x);
            if (index < 0) index = -index - 1;
            int low = Math.max(0, index - k - 1), high = Math.min(ret.size() - 1, index + k - 1);
            while (high - low > k - 1) {
                if ((x - ret.get(low)) <= (ret.get(high) - x)) high--;
                else if ((x - ret.get(low)) > (ret.get(high) - x)) low++;
            }
            return ret.subList(low, high + 1);
        }
    }
}