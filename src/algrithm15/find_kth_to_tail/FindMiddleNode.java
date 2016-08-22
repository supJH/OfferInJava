package algrithm15.find_kth_to_tail;

import data.ListNode;

/**
 * Created by Administrator on 2016/5/13.
 * 返回链表中的中间节点
 */
public class FindMiddleNode {

    public static void main(String[] args) {

        FindMiddleNode f = new FindMiddleNode();

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
//        node6.next = node7;
//        node7.next = node8;
//        node8.next = node9;

        ListNode foundNode = f.findTheMiddleNode(head);

        if (foundNode != null) {
            System.out.println(foundNode.val);
        } else {
            System.out.println("NULL");
        }


    }
//    两个指针，一个一次走两步，另一个一次走一步
    public ListNode findTheMiddleNode(ListNode head) {
        ListNode node1 = head;
        ListNode node2 = head;

        while (node2 != null) {
            node2 = node2.next;

            if (node2 != null) {
                node2 = node2.next;
            } else {
                break;
            }
            node1 = node1.next;
        }
        return node1;
    }
}
