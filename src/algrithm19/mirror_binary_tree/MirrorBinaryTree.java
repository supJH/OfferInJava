package algrithm19.mirror_binary_tree;

import data.BinaryNode;

/**
 * Created by Administrator on 2016/5/13.
 * 二叉树的镜像
 */
public class MirrorBinaryTree {

    public static void main(String[] args) {
        MirrorBinaryTree m = new MirrorBinaryTree();

        BinaryNode root = new BinaryNode(8);
        BinaryNode node1 = new BinaryNode(6);
        BinaryNode node2 = new BinaryNode(10);
        root.left = node1;
//        root.right = node2;

        BinaryNode node3 = new BinaryNode(5);
        BinaryNode node4 = new BinaryNode(7);
        node1.left = node3;
//        node1.right = node4;

        BinaryNode node5 = new BinaryNode(9);
        BinaryNode node6 = new BinaryNode(11);
        node2.left = node5;
//        node2.right = node6;

        m.mirrorBinaryTree(root);
        ;

    }

    //递归交换左右子树
    public void mirrorBinaryTree(BinaryNode root) {
        if (root == null) return;
        BinaryNode tempNode = root.left;
        root.left = root.right;
        root.right = tempNode;

        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);

    }
}
