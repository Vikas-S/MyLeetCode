package Sword_57II;


import java.util.ArrayList;
import java.util.List;

public class Solution2 {

    public int[][] findContinuousSequence(int target) {
        List<int[]> res = new ArrayList<>();
        int i = 1, j = 1, sum = 0;
        while (i <= target / 2) {
            if (sum < target) {
                sum = sum + j;
                j++;
            } else if (sum > target) {
                sum = sum - i;
                i++;
            } else {
                int[] level = new int[j - i];
                for (int k = 0; k < (j - i); k++) {
                    level[k] = k + 1;
                }
                res.add(level);
                sum -= i;
                i++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
