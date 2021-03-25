package Sword_25;

/**
 * @author vikas
 * @version 1.0
 * @description: TODO
 * @date 2021/3/22 9:17 下午
 */

public class Solution {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p = l1, q = l2, dummy = new ListNode(0);
        ListNode cur = dummy;
        while (p != null && q != null) {
            if (p.val <= q.val) {
                cur.next = p;
                p = p.next;
            } else {
                cur.next = q;
                q = q.next;
            }
            cur = cur.next;
        }
        cur.next = (p != null) ? p : q;
        return dummy.next;
    }
}
