package com.apollo.tree;

import com.apollo.util.BuildTree;
import com.apollo.util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 不使用递归, 先序遍历
 */
public class IterateTree {

    public static void main(String[] args) {
        TreeNode root = BuildTree.buildTree(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 0);
        solve03(root);
    }
    // 前序遍历
    public static void solve(TreeNode root) {
        if (root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode curNode = stack.pop();
            list.add(curNode.val);
            if (curNode.right != null) {
                stack.push(curNode.right);
            }
            if (curNode.left != null) {
                stack.push(curNode.left);
            }
        }

        System.out.println(list);
    }

    // 中序遍历
    public static void solve02(TreeNode root) {
        if (root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        TreeNode iterNode = root;

        while (iterNode != null || !stack.isEmpty()) {
            if (iterNode != null) {
                stack.push(iterNode);
                iterNode = iterNode.left;
            } else {
                TreeNode curNode = stack.pop();
                list.add(curNode.val);
                iterNode = curNode.right;
            }
        }

        System.out.println(list);
    }

    // 后序遍历
    public static void solve03(TreeNode root) {
        if (root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> list = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode curNode = stack.pop();
            list.add(curNode.val);
            if (curNode.left != null) {
                stack.push(curNode.left);
            }
            if (curNode.right != null) {
                stack.push(curNode.right);
            }
        }

        // System.out.println(list);
        while (!list.isEmpty()) {
            System.out.print(list.pop() + " ");
        }
    }
}
