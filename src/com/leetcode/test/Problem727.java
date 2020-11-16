package com.leetcode.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xiaowen
 * @date 2020/11/7 10:47 下午
 *
 * 727.最小窗口子序列
 */
public class Problem727 {
    public String minWindow(String S, String T) {
        int N = S.length();
        int[] last = new int[26];
        int[][] next = new int[N][26];
        Arrays.fill(last, -1);
        for (int i = N - 1; i >= 0; i--) {
            last[S.charAt(i) - 'a'] = i;
            for (int k = 0; k < 26; k++) {
                next[i][k] = last[k];
            }
        }
        List<int[]> windows = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            if (S.charAt(i) == T.charAt(0)) {
                windows.add(new int[]{i, i});
            }
        }

        for (int j = 1; j < T.length(); j++) {
            int letterIndex = T.charAt(j) - 'a';
            for (int[] window : windows) {
                if (window[1] < N - 1 && next[window[1] + 1][letterIndex] >= 0) {
                    window[1] = next[window[1] + 1][letterIndex];
                } else {
                    window[0] = window[1] = -1;
                    break;
                }
            }
        }

        int[] ans = {-1, S.length()};
        for (int[] window : windows) {
            if (window[0] == -1) break;
            if (window[1] - window[0] < ans[1] - ans[0]) {
                ans = window;
            }

        }
        return ans[0] >= 0 ? S.substring(ans[0], ans[1] + 1) : "";
    }
}
