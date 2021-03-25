package Sword_34;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author vikas
 * @version 1.0
 * @description: TODO
 * @date 2021/3/24 8:23 下午
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

    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if (root == null) return res;
        // 使用深度优先遍历来寻找路径和为target的结点路径
        LinkedList<Integer> path = new LinkedList<>();
        recur(root, target, path);
        return res;
    }

    public void recur(TreeNode root, int target, LinkedList<Integer> path) {
        if (root == null) return;
        path.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            res.add(new LinkedList<>(path));
        }
        recur(root.left, target, path);
        recur(root.right, target, path);
        path.removeLast();
    }

}
