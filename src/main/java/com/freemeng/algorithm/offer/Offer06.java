package com.freemeng.algorithm.offer;

import java.util.Stack;

/**
 * @author: zhenyang
 * @date: 2021/10/3 3:51 下午
 * @description
 */

public class Offer06 {
    public static void main(String[] args) {
        Solution.ListNode a = new Solution.ListNode(1);
        Solution.ListNode b = new Solution.ListNode(2);
        Solution.ListNode c = new Solution.ListNode(3);
        b.next = c;
        a.next = b;
        int[] ints = Solution.reversePrint(a);
        System.out.println(ints.toString());

    }

    static class Solution {
        public static int[] reversePrint(ListNode head) {

            Stack<Integer> stack = new Stack();

            ListNode current = head;
            while (null != current) {
                stack.push(current.val);
                current = getNextNode(current);
            }
            int size = stack.size();
            int[] result = new int[size];
            int i = 0;
            while (!stack.isEmpty()){
                result[i] = stack.pop();
                i++;
            }

            return result;

        }

        static ListNode getNextNode(ListNode node) {
            return node.next;
        }

        static class ListNode {
            int val;
            ListNode next;

            ListNode(int x) {
                val = x;
            }
        }
    }
}