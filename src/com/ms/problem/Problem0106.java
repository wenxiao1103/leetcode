package com.ms.problem;
//压缩字符串
public class Problem0106 {
    public String compressString(String S) {
        int N = S.length();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while( i < N) {
            int j = i;
            while(j < N && S.charAt(j) == S.charAt(i)){
                j++;
            }
            sb.append(S.charAt(i));
            sb.append(j-i);
            i = j;
        }
        String res = sb.toString();
        if(res.length() < S.length()){
            return res;
        }else{
            return S;
        }
    }
}
