package Sword_06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author vikas
 * @version 1.0
 * @description: TODO
 * @date 2021/3/22 8:04 下午
 */

public class Solution {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public int[] reversePrint(ListNode head) {
        LinkedList<Integer> stack = new LinkedList<>();
        ListNode cur = head;
        while (cur != null) {
            stack.addLast(cur.val);
            cur = cur.next;
        }
        int[] res = new int[stack.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = stack.removeLast();
        }
        return res;
    }

}
