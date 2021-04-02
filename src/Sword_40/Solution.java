package Sword_40;

import java.util.PriorityQueue;

/**
 * @author vikas
 * @version 1.0
 * @description: TODO
 * @date 2021/3/25 8:15 下午
 */

public class Solution {

    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr.length == 0 || k <= 0 || k > arr.length) return new int[0];
        int[] res = new int[k];
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int num : arr) {
            heap.offer(num);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        for (int i = 0; i < k; i++) {
            res[i] = heap.poll();
        }
        return res;
    }

}
