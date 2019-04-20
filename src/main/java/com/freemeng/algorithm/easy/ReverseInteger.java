package com.freemeng.algorithm.easy;

import static java.lang.StrictMath.abs;

/**
 * @Author: zhenyang
 * @Date: 2019/4/20 9:38 PM
 * @Description
 */

public class ReverseInteger {

    public static int reverse(int x) {
        int res = 0;
        while (x != 0) {
            // 终止条件
            if (abs(res) > Integer.MAX_VALUE / 10) {
                return 0;
            }
            // 由于是 10 进制，与 10 求余得到 个位数
            res = res * 10 + x % 10;
            x /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        int reverse = reverse(120);
        System.out.println(reverse);
    }
}
