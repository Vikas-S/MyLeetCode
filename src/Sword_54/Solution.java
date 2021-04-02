package Sword_54;

import com.sun.source.tree.Tree;

import javax.swing.tree.TreeNode;

/**
 * @author vikas
 * @version 1.0
 * @description: TODO
 * @date 2021/3/26 7:37 下午
 */

public class Solution {


    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    private int res;
    private int kth;

    public int kthLargest(TreeNode root, int k) {
        if (root == null) return -1;
        kth = k;
        recur(root);
        return res;
    }

    public void recur(TreeNode root) {
        if (root == null) return;
        recur(root.right);
        kth--;
        if (kth == 0) {
            res = root.val;
            return;
        }
        recur(root.left);
    }
}