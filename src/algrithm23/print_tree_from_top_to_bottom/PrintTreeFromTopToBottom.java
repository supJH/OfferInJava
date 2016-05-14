package algrithm23.print_tree_from_top_to_bottom;

import data.BinaryNode;

import java.util.LinkedList;

/**
 * Created by Administrator on 2016/5/14.
 */
public class PrintTreeFromTopToBottom {

    public static void main(String[] args) {
        PrintTreeFromTopToBottom p = new PrintTreeFromTopToBottom();

        BinaryNode root = new BinaryNode(8);
        BinaryNode node1 = new BinaryNode(6);
        BinaryNode node2 = new BinaryNode(10);
        root.left = node1;
        root.right = node2;

        BinaryNode node3 = new BinaryNode(5);
        BinaryNode node4 = new BinaryNode(7);
        node1.left = node3;
        node1.right = node4;

        BinaryNode node5 = new BinaryNode(9);
        BinaryNode node6 = new BinaryNode(11);
        node2.left = node5;
        node2.right = node6;

        p.printTreeFromTopToButtom(root);


    }


    public void printTreeFromTopToButtom(BinaryNode root) {
        LinkedList<BinaryNode> queue = new LinkedList<>();

        if (root == null) return;
        queue.add(root);
        while (!queue.isEmpty()) {
            root = queue.removeFirst();
            System.out.println(root.val);
            if (root.left != null) {
                queue.add(root.left);
            }
            if (root.right != null) {
                queue.add(root.right);
            }
        }

    }


}
