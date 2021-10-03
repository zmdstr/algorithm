package com.freemeng.algorithm.offer;

import java.util.Stack;

/**
 * @author: zmdstr
 * @date: 2021/10/2 8:08 下午
 * @description
 * Stack 不建议使用
 * 用两个栈实现队列
 */

public class CQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public CQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();

    }

    public void appendTail(int value) {
        stack1.add(value);

    }

    public int deleteHead() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                return -1;
            }

            while (!stack1.isEmpty()) {
                stack2.add(stack1.pop());
            }
            return stack2.pop();

        } else {
            return stack2.pop();
        }
    }
}