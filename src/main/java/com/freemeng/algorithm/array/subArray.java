package com.freemeng.algorithm.array;

/**
 * @Author:
 * @Date: 2020/6/27 9:55 上午
 * @Description
 * 1343. 大小为 K 且平均值大于等于阈值的子数组数目
 * 给你一个整数数组 arr 和两个整数 k 和 threshold 。
 *
 * 请你返回长度为 k 且平均值大于等于 threshold 的子数组数目。
 */

public class subArray {
    public static void main(String[] args) {
        int[] array = {2, 2, 2, 2, 5, 5, 5, 8};
        int i = numOfSubarrays(array, 3, 4);
        System.out.println(i);
    }

    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int result = 0;
        int sum = 0;
        int targetSum = k * threshold;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int between = sum - targetSum;
        if (between >= 0) {
            result++;
        }
        for (int i = 0; i < arr.length - k; i++) {
            between = arr[i + k] - arr[i] + between;
            if (between >= 0) {
                result++;
            }

        }
        return result;

    }
}