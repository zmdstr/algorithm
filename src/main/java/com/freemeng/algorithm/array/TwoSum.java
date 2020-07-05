package com.freemeng.algorithm.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:
 * @Date: 2020/7/5 9:01 上午
 * @Description 1.两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
//        int[] result = twoSum(nums, target);
        int[] result = twoSum1(nums, target);

        System.out.printf("param1:" + result[0] + ",param2:" + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums.length < 1) {
            return result;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;

    }

    public static int[] twoSum1(int[] nums, int target) {
        if (nums.length < 1) {
            return new int[]{};
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            Integer element = map.get(temp);
            if (null != element) {
                return new int[]{i, element};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};

    }
}