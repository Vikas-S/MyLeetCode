package Sword_57;

import java.util.Arrays;

/**
 * @author vikas
 * @version 1.0
 * @description: TODO
 * @date 2021/3/20 7:47 下午
 */

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if (nums == null || nums.length == 1) return res;
        int i = 0, j = nums.length - 1;
        while (i < j) {
            if (nums[j] > target - nums[i]) j--;
            else if (nums[i] < target - nums[j]) i++;
            else {
                res[0] = nums[i];
                res[1] = nums[j];
                return res;
            }
        }
        return res;
    }
}

class test {
    public static void main(String[] args) {
        int[] arr = new int[]{13,14,19,21,25,39,42,50,51,67,75,79,97,97,104,129,134,146,160,166,166,168,174,179,194,208,222,235,241,257,262,282,284,287,293,298,302,315,316,331,350,362,372,372,377,387,399,410,433,474,481,483,484,500,509,544,557,563,571,575,586,621,624,630,644,654,659,689,714,730,762,763,764,774,779,802,804,810,822,825,829,841,842,857,875,902,907,920,922,925,927,931,936,967,969,970,973,979,980,989};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(arr, 962)));
    }
}
