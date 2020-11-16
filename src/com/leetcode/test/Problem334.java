package com.leetcode.test;
//递增的三元子序列
public class Problem334 {
//    public boolean increasingTriplet(int[] nums) {
//        if(nums == null || nums.length < 3) return false;
//        int max = 1;
//        int[] cache = new int[nums.length];
//        for(int i = 0; i < nums.length; i++){
//            int res = find(nums, i, nums.length, cache);
//            max = Math.max(res, max);
//        }
//
//        return max>=3;
//    }
//
//    public int find(int[] nums, int start, int len, int[] cache){
//        if(cache[start] != 0) return cache[start];
//        int max = 1;
//        for(int j = start; j < len; j++){
//            if(nums[j] > nums[start]){
//                int nums_len = 1 + find(nums, j, len, cache);
//                max = Math.max(max, nums_len);
//            }
//        }
//        cache[start] = max;
//        return max;
//    }
//    public boolean increasingTriplet(int[] nums) {
//        int len=nums.length;
//        if(nums.length<3) return false;
//        int min=Integer.MAX_VALUE; //最小值
//        int second=Integer.MAX_VALUE;//第二元素最小的递增对的第二元素
//        for(int num:nums){
//            if(num<=min){//num比min小或相等，肯定不存在递增三元素。由于不存在以num结尾的递增对，故只需更新min
//                min=num;
//            }else if(num<=second){//num比second小或相对，肯定不存在递增三元素。由于存在以num结尾的递增对且num不大于second，因此可以更新second
//                second=num;
//            }else {//num比second大，那就存在递增三元素，因为second是一个递增对的第二元素，加上num后就是递增三元素了
//                return true;
//            }
//        }
//        return false;
//    }
    public boolean increasingTriplet(int[] nums) {
        int len = nums.length;
        if (nums.length < 3) return false;
        int min = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= min) {
                min = num;
            }else if (num <= second) {
                second = num;
            }else {
                return true;
            }
        }
        return false;
    }
    //设置两个变量，一个最小值min,一个第二小值second，依次变量数组中每个数，依次与min,second比较，当大于second时，就代表存在长度大于三的递增子序列
    //这样做的也可以保证，他们之间的顺序
}
