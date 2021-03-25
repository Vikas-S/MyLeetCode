package Sword_18;

/**
 * @author vikas
 * @version 1.0
 * @description: TODO
 * @date 2021/3/22 8:26 下午
 */

public class Solution {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        ListNode cur = head, pre = dummy;
        dummy.next = head;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
                return dummy.next;
            }
            pre = pre.next;
            cur = cur.next;
        }
        return dummy.next;
    }

}
