package Sword_30;

import java.util.LinkedList;
import java.util.List;

/**
 * @author vikas
 * @version 1.0
 * @description: TODO
 * @date 2021/3/25 7:08 下午
 */

public class MinStack {

    LinkedList<Integer> stack;
    LinkedList<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new LinkedList<>();
        minStack = new LinkedList<>();
    }

    public void push(int x) {
        if (minStack.isEmpty() || x <= minStack.getLast()) {
            minStack.addLast(x);
        }
        stack.addLast(x);
    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        if (stack.getLast().equals(minStack.getLast())) {
            minStack.removeLast();
        }
        stack.removeLast();
    }

    public int top() {
        return stack.getLast();
    }

    public int min() {
        return minStack.getLast();
    }

}
