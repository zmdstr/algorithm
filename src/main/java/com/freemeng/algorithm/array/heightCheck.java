package com.freemeng.algorithm.array;

import java.util.Arrays;

/**
 * @Author:
 * @Date: 2020/7/12 9:33 上午
 * @Description 学校在拍年度纪念照时，一般要求学生按照 非递减 的高度顺序排列。
 * <p>
 * 请你返回能让所有学生以 非递减 高度排列的最小必要移动人数。
 * <p>
 * 注意，当一组学生被选中时，他们之间可以以任何可能的方式重新排序，而未被选中的学生应该保持不动。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/height-checker
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class heightCheck {
    public static void main(String[] args) {
        int[] input = {1, 1, 4, 2, 1, 3};
        int result = heightsChecker(input);
        System.out.println("input:" + Arrays.toString(input) + ",result:" + result);
    }

    public static int heightsChecker(int[] heights) {
        //
        int[] copy = Arrays.copyOf(heights, heights.length);
        Arrays.sort(copy);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != copy[i]) {
                count++;
            }
        }
        return count;
    }
}