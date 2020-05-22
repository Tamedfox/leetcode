package com.leetcode.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * @author cf
 * @version 1.0
 * @date 2020/5/22 23:14
 *
 * 编写一个算法来判断一个数 n 是不是快乐数。
 *
 * 「快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。如果 可以变为  1，那么这个数就是快乐数。
 *
 * 如果 n 是快乐数就返回 True ；不是，则返回 False 。
 *
 *
 *
 * 示例：
 *
 * 输入：19
 * 输出：true
 * 解释：
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */
public class IsHappy {

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n)){
            set.add(n);
            n = getHappyNum(n);
        }
        return n == 1;
    }

    private int getHappyNum(int n) {
        int sum = 0;
        while (n > 0){
            int t = n % 10;
            n = n / 10;
            sum += t * t;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new IsHappy().isHappy(19));
    }
}
