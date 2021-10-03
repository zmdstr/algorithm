package com.freemeng.algorithm.array;

/**
 * @author: zhenyang
 * @date: 2020/9/15 8:51 上午
 * @description
 */

public class Array_867 {
    public int[][] transpose(int[][] A) {
        // 二维数组
        int x = A.length;
        int y = A[0].length;
        int[][] ints = new int[y][x];
        for (int i = 0; i < x; i++) {
            int[] rows = A[i];
            for (int i1 = 0; i1 < rows.length; i1++) {
                ints[i1][i] = A[i][i1];
            }
        }
        return ints;
    }
}