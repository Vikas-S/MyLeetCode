package Sword_09;

import java.util.Stack;

/**
 * @author vikas
 * @version 1.0
 * @description: TODO
 * @date 2021/3/25 7:17 下午
 */

public class CQueue {

    Stack<Integer> inStack;
    Stack<Integer> outStack;

    public CQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void appendTail(int value) {
        inStack.push(value);
    }

    public int deleteHead() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.isEmpty() ? -1 : outStack.pop();
    }
}
