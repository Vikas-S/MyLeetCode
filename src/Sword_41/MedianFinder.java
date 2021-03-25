package Sword_41;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author vikas
 * @version 1.0
 * @description: TODO
 * @date 2021/3/19 8:33 下午
 */

public class MedianFinder {

    Queue<Integer> A, B;

    /** initialize your data structure here. */
    public MedianFinder() {
        A = new PriorityQueue<>(); // 小顶堆，存储较大的一半
        B = new PriorityQueue<>((x, y) -> (y - x)); // 大顶堆，存储较小的一半
    }

    public void addNum(int num) {
        if (A.size() != B.size()) { // N为奇数，需要向B添加元素。将新元素插入A，A的堆顶插入B
            A.add(num);
            B.add(A.poll());
        } else {
            B.add(num);
            A.add(B.poll());
        }
    }

    public double findMedian() {
        return A.size() != B.size() ? A.peek() : (A.peek() + B.peek()) / 2.0;
    }

}
