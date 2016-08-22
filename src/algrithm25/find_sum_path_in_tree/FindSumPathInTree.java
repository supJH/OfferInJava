package algrithm25.find_sum_path_in_tree;

import data.BinaryNode;

import java.util.LinkedList;

/**
 * Created by Administrator on 2016/5/14.
 * 二叉树节点值和为输入整数的所有路径
 */
public class FindSumPathInTree {

    public static void main(String[] args) {
        FindSumPathInTree f = new FindSumPathInTree();

        BinaryNode root = new BinaryNode(10);
        BinaryNode node1 = new BinaryNode(5);
        BinaryNode node2 = new BinaryNode(11);
        root.left = node1;
        root.right = node2;

        BinaryNode node3 = new BinaryNode(4);
        BinaryNode node4 = new BinaryNode(7);
        node1.left = node3;
        node1.right = node4;

//        BinaryNode node5 = new BinaryNode(9);
//        BinaryNode node6 = new BinaryNode(11);
//        node2.left = node5;
//        node2.right = node6;

        f.findSumPath(root, 22);


    }


    public void findSumPath(BinaryNode root, int sum) {
        if (root == null) return;
        int currentSum = 0;
        LinkedList<BinaryNode> queue = new LinkedList<>();
        searchPath(root, queue, currentSum, sum);

    }


    public void searchPath(BinaryNode node, LinkedList<BinaryNode> queue, int currentSum, int sum) {

        currentSum += node.val;
        queue.add(node);

        if (node.left == null && node.right == null) {
            if (currentSum == sum) {
                System.out.println("a path is found:");
                for (BinaryNode iterNode : queue) {
                    System.out.println(iterNode.val);
                }
            }
        } else {
            if (node.left != null) {
                searchPath(node.left, queue, currentSum, sum);
            }
            if (node.right != null) {
                searchPath(node.right, queue, currentSum, sum);
            }
        }
        currentSum -= node.val;
        queue.removeLast();

    }


}
