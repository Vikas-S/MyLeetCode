package Sword_04;

/**
 * @author vikas
 * @version 1.0
 * @description: TODO
 * @date 2021/3/22 7:26 下午
 */

public class Solution {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int rowLength = matrix.length, colLength = matrix[0].length;
        int curRow = 0, curCol = colLength - 1;
        while (curRow < rowLength && curCol >= 0) {
            if (matrix[curRow][curCol] > target) {
                curCol--;
            } else if (matrix[curRow][curCol] < target) {
                curRow++;
            } else {
                return true;
            }
        }
        return false;
    }

}
