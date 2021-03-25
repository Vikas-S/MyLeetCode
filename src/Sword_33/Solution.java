package Sword_33;

/**
 * @author vikas
 * @version 1.0
 * @description: TODO
 * @date 2021/3/24 7:49 下午
 */

public class Solution {

    // 题目要求判断序列是否为二叉搜索树的后序遍历结果，而我们可以知道的是，二叉搜索树的前序遍历是有序递增序列

    public boolean verifyPostorder(int[] postorder) {
        if (postorder == null || postorder.length == 0) return true;
        // 复制一份输入的数组并进行排序，获得该二叉搜索树的中序遍历数组
        return recur(postorder, 0, postorder.length - 1);
        // 根据二叉树的中序和后序序列，判断能否生成一颗二叉搜索树
    }

    public boolean recur(int[] postorder, int left, int right) {
        // 如果left >= right 则表明符合二叉搜索树后序遍历规则
        if (left >= right) return true;
        // 获取根结点
        int root = postorder[right];
        // 从左往右找出第一个大于根结点的值的坐标，它及它后面的值为根结点的右子树，值应该大于根结点，左边的为根结点的左子树，值应
        // 该小于根结点
        int cur = left;
        while (postorder[cur] < root) {
           cur++;
        }
        // 确定该点后边的元素皆大于根结点的值
        int tmp = cur;
        while (tmp < right) {
            if (postorder[tmp++] < root) return false;
        }
        // 然后对左右子结点进行递归调用
        return recur(postorder, left, cur - 1) && recur(postorder, cur, right - 1);
    }

}
