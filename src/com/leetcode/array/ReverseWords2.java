package com.leetcode.array;

/**
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 *
 * 示例 1:
 *
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteeL tsetnoc"
 * 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 */
public class ReverseWords2 {

    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String string : strings) {
            sb.append(reverse(string)).append(" ");
        }
        return sb.toString().substring(0,s.length());
    }

    private String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >=0 ; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String reverseWords = new ReverseWords2().reverseWords(s);
        System.out.println(reverseWords);
    }

}
