package algrithm15.find_kth_to_tail;

import data.ListNode;

/**
 * Created by Administrator on 2016/5/13.
 */
public class CircleListNode {
    public static void main(String[] args) {

        CircleListNode f = new CircleListNode();

        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);
        ListNode node9 = new ListNode(9);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = head;

        boolean result = f.isCircleListNode(head);

        System.out.println(result);


    }

    public boolean isCircleListNode(ListNode head) {
        ListNode node1 = head;
        ListNode node2 = head;

        while (node1 != null) {
            for (int i = 0; node2 != null && i < 2; i++) {
                node2 = node2.next;
                if (node2 == node1) return true;
            }
            node1 = node1.next;
        }
        return false;
    }

}
