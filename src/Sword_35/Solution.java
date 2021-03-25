package Sword_35;

import java.util.HashMap;

/**
 * @author vikas
 * @version 1.0
 * @description: TODO
 * @date 2021/3/22 9:34 下午
 */

public class Solution {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) return null;
        HashMap<Node, Node> map = new HashMap<>();
        Node cur = head;
        while (cur != null) {
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while (cur != null) {
            Node newNode = map.get(cur);
            newNode.next = map.get(cur.next);
            newNode.random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }

    public Node copyRandomList2(Node head) {
        if (head == null) {
            return null;
        }
        // 复制各个节点，构建拼接链表
        Node cur = head;
        while (cur != null) {
            Node newNode = new Node(cur.val);
            newNode.next = cur.next;
            cur.next = newNode;
            cur = newNode.next;
        }
        // 构建新链表各个节点的random指针
        cur = head;
        while (cur != null) {
            Node newNode = cur.next;
            if (cur.random != null) {
                newNode.random = cur.random.next;
            }
            cur = newNode.next;
        }
        // 拆分原链表与新链表
        cur = head;
        Node res = cur.next;
        while (cur.next != null) {
            Node newNode = cur.next;
            cur.next = newNode.next;
            cur = newNode;
        }
        //  返回新节点头节点
        return res;
    }

}
