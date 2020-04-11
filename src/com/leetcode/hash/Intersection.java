package com.leetcode.hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 示例 1:
 *
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2]
 * 示例 2:
 *
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [9,4]
 * 说明:
 *
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 */
public class Intersection {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int i : nums2) {
            set2.add(i);
        }

        if(set1.size() < set2.size()){
            return getResult(set1,set2);
        }
        return getResult(set2,set1);
    }

    private int[] getResult(Set<Integer> set1, Set<Integer> set2) {
        int[] temp = new int[set1.size()];
        int index = 0;
        for (Integer integer : set1) {
            if(set2.contains(integer)){
                temp[index++] = integer;
            }
        }

        return Arrays.copyOf(temp,index);

    }

    public static void main(String[] args) {
//        int[] nums1 = {1,2,2,1};
//        int[] nums2 = {2,2};
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] ints = new Intersection().intersection(nums1, nums2);
        System.out.println(Arrays.toString(ints));
    }

}
