package Sword_55;

/**
 * @author vikas
 * @version 1.0
 * @description: TODO
 * @date 2021/3/26 7:52 下午
 */

public class Solution {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    private int maxDepth = 0;

    public int maxDepth(TreeNode root) {
        recur(root, 0);
        return maxDepth;
    }

    private void recur(TreeNode root, int k) {
        if (root == null) return;
        k++;
        maxDepth = Math.max(maxDepth, k);
        recur(root.left, k);
        recur(root.right, k);
    }
}
