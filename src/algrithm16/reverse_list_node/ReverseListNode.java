package algrithm16.reverse_list_node;

import data.ListNode;

/**
 * Created by Administrator on 2016/5/13.
 * 反转链表
 */
public class ReverseListNode {

    public static void main(String[] args) {
        ReverseListNode r = new ReverseListNode();

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
//        node9.next = head;

        ListNode reversedNode = r.reverseListNode(head);
        while (reversedNode != null) {
            System.out.println(reversedNode.val);
            reversedNode = reversedNode.next;

        }
    }

//    使用一个指针记录前一个node
    public ListNode reverseListNode(ListNode head) {

        if (head == null) return null;

        ListNode node = head;
        ListNode preNode = null;
        ListNode nextNode = null;

        while (node != null) {
            nextNode = node.next;
            node.next = preNode;
            preNode = node;
            node = nextNode;

        }
        return preNode;
    }
}
