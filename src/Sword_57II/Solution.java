package Sword_57II;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vikas
 * @version 1.0
 * @description: TODO
 * @date 2021/3/20 8:22 下午
 */

public class Solution {

    public int[][] findContinuousSequence(int target) {
        List<int[]> res = new ArrayList<>();
        int i = 1, j = 1, sum = 0;
        while (i <= target / 2) {
            if (sum < target) { // 右边界向右移动，使得窗口内的和增大
                sum += j;
                j++;
            } else if (sum > target) { // 左边界向右移动，使得窗口内的和减少
                sum -= i;
                i++;
            } else {
                // 找到一个序列，记录结果
                int[] arr = new int[j - i];
                for (int k = i; k < j; k++) {
                    arr[k - i] = k;
                }
                res.add(arr);
                // 左边界向右移动
                sum -= i;
                i++;
            }
        }
        return res.toArray(new int[res.size()][]); // 学习这种生成数组的方式
    }

}
