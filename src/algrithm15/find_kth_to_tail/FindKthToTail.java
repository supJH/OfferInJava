package algrithm15.find_kth_to_tail;

import data.ListNode;

/**
 * Created by Administrator on 2016/5/13.
 * 输出链表的倒数第k个节点
 */
public class FindKthToTail {

    public static void main(String[] args) {
        FindKthToTail f = new FindKthToTail();
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

        ListNode foundNode = f.findKthToTail(null, 11);

        if (foundNode != null){
            System.out.println(foundNode.val);
        }else{
            System.out.println("NULL");
        }


    }

    public ListNode findKthToTail(ListNode head, int k) {

        ListNode node = head;
        ListNode newNode = head;
        int i;
        for (i = 0; newNode != null && i < k; i++) {
            newNode = newNode.next;
        }
        if (i != k) return null;

        while (newNode != null) {
            newNode = newNode.next;
            node = node.next;
        }
        return node;
    }

}
