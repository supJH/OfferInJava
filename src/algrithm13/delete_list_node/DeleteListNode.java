package algrithm13.delete_list_node;


import data.ListNode;

/**
 * Created by Administrator on 2016/4/29.
 */
public class DeleteListNode {

    public static void main(String[] args) {
        DeleteListNode d = new DeleteListNode();
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        head.next = node1;
        node1.next = node2;

        ListNode node = d.deleteListNode(head, node1);

        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }


//    public ListNode deleteListNode(ListNode head, ListNode delNode) {
//        if (head == null || delNode == null) return null;
//
//        ListNode node = head;
//        ListNode pre = null;
//
//        if (head == delNode) {
//            if (head.next == null) {
//                return null;
//            } else if (head.next != null) {
//                return head.next;
//            }
//        }
//
//        while (node != null  ) {
//            if (node == delNode){
//                if (node.next == null) {
//                    pre.next = null;
//                } else {
//                    pre.next = node.next;
//                }
//            }
//
//            pre = node;
//            node = node.next;
//        }
//
//        return head;
//    }

    public ListNode deleteListNode(ListNode head, ListNode delNode) {
        ListNode pNext = delNode.next;
        ListNode node = head;
        ListNode preNode = null;
        if (pNext != null) {
            delNode.val = pNext.val;
            delNode.next = pNext.next;
            pNext = null;
            if (head == delNode) return delNode;

        } else if (head == delNode) {
            return null;
        } else {
            while (node != null) {

                if (node == delNode) {
                    preNode.next = null;
                    delNode = null;
                }
                preNode = node;
                node = node.next;
            }
        }
        return head;
    }


}
