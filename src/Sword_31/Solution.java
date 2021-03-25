package Sword_31;

import java.util.Stack;

/**
 * @author vikas
 * @version 1.0
 * @description: TODO
 * @date 2021/3/25 7:26 下午
 */

public class Solution {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int popIndex = 0;
        for (int num : pushed) {
            stack.push(num);
            while (!stack.isEmpty() && stack.peek() == popped[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }
        return stack.isEmpty();
    }

}
