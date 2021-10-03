package com.freemeng.algorithm.offer;

import java.util.Stack;

/**
 * @author: zhenyang
 * @date: 2021/10/2 10:36 下午
 * @description
 */

class MinStack {
    private Stack<Integer> stackA, stackB;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stackA = new Stack<Integer>();
        stackB = new Stack<Integer>();

    }

    public void push(int x) {
        stackA.push(x);
        if (stackB.empty() || stackB.peek() >= x) {
            stackB.add(x);
        }

    }

    public void pop() {
        stackA.pop();
        if (stackA.peek().equals(stackB)) {
            stackB.pop();
        }
    }

    public int top() {
        return stackA.peek();

    }

    public int min() {
        return stackB.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */