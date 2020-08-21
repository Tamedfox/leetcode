package com.leetcode.dynamicProgramming;

/**
 * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 *
 * 要求时间复杂度为O(n)。
 *
 *  
 *
 * 示例1:
 *
 * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *  
 *
 * 提示：
 *
 * 1 <= arr.length <= 10^5
 * -100 <= arr[i] <= 100
 *
 * @author cf
 * @version 1.0
 * @date 2020/8/20 22:26
 */
public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int max = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i-1] > 0){
                //大于0则相加，将nums[i]置为其和
                res += nums[i];
                nums[i] = res;
            }else {
                //小于0，累赘，放弃从nums[i]开始再计算
                res = nums[i];
            }
            max = Math.max(res,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int i = new MaxSubArray().maxSubArray(nums);
        System.out.println(i);
    }

}
