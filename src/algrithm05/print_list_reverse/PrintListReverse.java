package algrithm05.print_list_reverse;

import data.ListNode;

import java.util.Stack;

/**
 * Created by Administrator on 2016/4/26.
 */
public class PrintListReverse {

    public static void main(String[] args) {
        PrintListReverse p = new PrintListReverse();
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        p.printListReverse(head);

    }

    public void printListReverse(ListNode head) {
        Stack<ListNode> s = new Stack<>();
        ListNode node = head;
        while (node != null) {
            s.push(node);
            node = node.next;
        }

        while (!s.empty()) {
            ListNode reverseNode = s.pop();
            System.out.println(reverseNode.val);
        }

    }


}
