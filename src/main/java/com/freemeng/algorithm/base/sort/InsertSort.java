package com.freemeng.algorithm.base.sort;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: zhenyang
 * @Date: 2020/3/8 5:41 PM
 * @Description 插入排序
 */
@Slf4j
public class InsertSort {

    public static void insertionSort(int[] input) {
        if (input.length < 0) {
            return;
        }
        for (int i = 1; i < input.length; i++) {
            int temp = input[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (temp < input[j]) {
                    input[j + 1] = input[j];
                } else {
                    break;
                }
            }
            input[j + 1] = temp;

        }
    }

    public static void main(String[] args) {
        int[] param = {1, 4, 5, 3};
        log.info("input:{}", param);
        insertionSort(param);
        log.info("result:{}", param);

    }
}