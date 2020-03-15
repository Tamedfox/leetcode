package com.leetcode.binarysearch;

public class MySqrt {

    public int mySqrt(int x) {
        int start = 1;
        int end = x;
        while(start <= end){
            int middle = start + (end - start) / 2; //二分查找   1   9    middle = 5 3
            int sqrt = x / middle; //获得二分数值的除值 sqrt = 1  3
            if(sqrt < middle){
                end = middle - 1;
            }else if(sqrt > middle){
                start = middle + 1;
            }else{
                return middle;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        MySqrt mySqrt = new MySqrt();
        System.out.println("9的平方根是：" + mySqrt.mySqrt(9));
        System.out.println("16的平方根是：" + mySqrt.mySqrt(16));
        System.out.println("8的平方根是：" + mySqrt.mySqrt(8));
        System.out.println("20的平方根是：" + mySqrt.mySqrt(20));
        System.out.println("3的平方根是：" + mySqrt.mySqrt(3));
        System.out.println("24的平方根是：" + mySqrt.mySqrt(24));
        System.out.println("32的平方根是：" + mySqrt.mySqrt(32));
        System.out.println("49的平方根是：" + mySqrt.mySqrt(49));
    }

}
