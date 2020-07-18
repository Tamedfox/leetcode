package com.leetcode.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 *
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 *
 * 示例 1:
 *
 * 输入: J = "aA", S = "aAAbbbb"
 * 输出: 3
 * 示例 2:
 *
 * 输入: J = "z", S = "ZZ"
 * 输出: 0
 * 注意:
 *
 * S 和 J 最多含有50个字母。
 *  J 中的字符不重复。
 *
 * @author cf
 * @version 1.0
 * @date 2020/7/18 18:23
 */
public class NumJewelsInStones {

    public int numJewelsInStones(String J, String S){
        Set<Character> set = new HashSet();
        int count = 0;
        char[] jArray = J.toCharArray();
        char[] sArray = S.toCharArray();

        for(int i = 0 ; i < jArray.length; i++) {
            set.add(jArray[i]);
        }
        for(int j= 0; j < sArray.length; j++) {
            if(set.contains(sArray[j])) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        String J = "aA";
//        String S = "aAAbbbb";
        String J = "z";
        String S = "ZZ";
        NumJewelsInStones stones = new NumJewelsInStones();
        System.out.println(stones.numJewelsInStones(J, S));
    }
}
