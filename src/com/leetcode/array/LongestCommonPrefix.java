package com.leetcode.array;

/**
 编写一个函数来查找字符串数组中的最长公共前缀。

 如果不存在公共前缀，返回空字符串 ""。

 示例 1:

 输入: ["flower","flow","flight"]
 输出: "fl"
 示例 2:

 输入: ["dog","racecar","car"]
 输出: ""
 解释: 输入不存在公共前缀。
 说明:

 所有输入只包含小写字母 a-z 。
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String first = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(first) != 0){
                first = first.substring(0, first.length() - 1);
                if(first.equals("")){
                    return  "";
                }
            }
        }
        return first;
    }

    public static void main(String[] args) {
//        String[] strs = {"flower","flow","flight"};
//        String[] strs = {"dog","racecar","car"};
        String[] strs = {"c","acc","ccc"};
        String s = new LongestCommonPrefix().longestCommonPrefix(strs);
        System.out.println(s);
    }

}
