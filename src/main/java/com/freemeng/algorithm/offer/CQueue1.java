package com.freemeng.algorithm.offer;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: zmdstr
 * @date: 2021/10/2 8:08 下午
 * @description 用两个栈实现队列
 */

public class CQueue1 {
    private Deque<Integer> stack1;
    private Deque<Integer> stack2;

    public CQueue1() {
        stack1 = new LinkedList<Integer>();
        stack2 = new LinkedList<Integer>();

    }

    public void appendTail(int value) {
        stack1.add(value);
    }

    public int deleteHead() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }
        if (stack1.isEmpty()) {
            return -1;
        } else {
            while (!stack1.isEmpty()) {
                stack2.add(stack1.pop());
            }
            return stack2.pop();

        }

    }
}