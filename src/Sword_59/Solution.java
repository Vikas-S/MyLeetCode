package Sword_59;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author vikas
 * @version 1.0
 * @description: TODO
 * @date 2021/3/19 9:06 下午
 */

public class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) return new int[]{};
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((x, y) -> (y - x));
        int[] res = new int[nums.length - k + 1];
        int index = 0;
        for (int i = 0; i < k; i++) {
            maxHeap.add(nums[i]);
        }
        res[index++] = maxHeap.peek();
        for (int i = 0, j = i + k; j < nums.length; i++, j++) {
            maxHeap.remove(nums[i]);
            maxHeap.add(nums[j]);
            res[index++] = maxHeap.peek();
        }
        return res;
    }

}

class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3)));
    }
}

