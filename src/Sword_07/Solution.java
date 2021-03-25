package Sword_07;

import java.util.HashMap;

/**
 * @author vikas
 * @version 1.0
 * @description: TODO
 * @date 2021/3/23 7:36 下午
 */

public class Solution {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    private HashMap<Integer, Integer> indexOfInOrder = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            indexOfInOrder.put(inorder[i], i);
        }
        return buildTreeByRecur(preorder, 0, preorder.length - 1, 0);
    }

    public TreeNode buildTreeByRecur(int[] pre, int preL, int preR, int inL) {
        if (preL > preR) return null;
        TreeNode root = new TreeNode(pre[preL]);
        int indexIn = indexOfInOrder.get(root.val);
        int leftTreeLen = indexIn - inL;
        root.left = buildTreeByRecur(pre, preL + 1, preL + leftTreeLen, inL);
        root.right = buildTreeByRecur(pre, preL + leftTreeLen + 1, preR, inL + leftTreeLen + 1);
        return root;
    }

}
