package Sword_22;

/**
 * @author vikas
 * @version 1.0
 * @description: TODO
 * @date 2021/3/22 8:49 下午
 */

public class Solution {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode pre = head, last = head;
        while (last != null && k > 0) {
            last = last.next;
            k--;
        }
        while (last != null) {
            last = last.next;
            pre = pre.next;
        }
        return pre;
    }

}
