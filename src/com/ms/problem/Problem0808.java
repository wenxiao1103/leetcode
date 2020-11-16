package com.ms.problem;


import java.util.HashSet;
import java.util.Set;

/**
 * @author xiaowen
 * @date 2020/9/6 10:40 下午
 *
 * 面试题08.08 有重复字符串的排列组合
 */
public class Problem0808 {
    Set<String> set = new HashSet<>();
    public String[] permutation(String S) {
        permutate(S.toCharArray(), 0);
        return set.toArray(new String[set.size()]);

    }
    public void permutate(char[] arr, int first) {
        if (first == arr.length - 1){
            set.add(new String(arr));
            return;
        }
        for (int i = first; i < arr.length; i++) {
            swap(arr, first, i);
            permutate(arr, first+1);
            swap(arr, first, i);
        }
    }
    public void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
