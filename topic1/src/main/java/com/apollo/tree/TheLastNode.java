package com.apollo.tree;

import com.apollo.util.BuildTree;
import com.apollo.util.TreeNode;

public class TheLastNode {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        TreeNode root = BuildTree.buildTree(nums, 0);
        System.out.println(solve(root));
    }


    public static TreeNode solve(TreeNode root) {
        if (root == null || root.left == null && root.right == null) return root;
        int depth = 0;
        TreeNode tmp = root;
        while (tmp != null) {
            tmp = tmp.left;
            depth += 1;
        }
        int level = 0;
        while (root != null) {
            level += 1;
            if (root.right != null) {
                TreeNode preNode = root;
                TreeNode curNode = root.right;
                int tempLevel = level + 1;
                while (curNode.left != null) {
                    preNode = curNode;
                    curNode = curNode.left;
                    tempLevel += 1;
                }
                if (tempLevel < depth) root = root.left;
                else if (preNode.right == null) return curNode;
                else root = root.right;
            } else if (root.left != null)
                root =root.left;
            else
                return root;
        }
        return null;
    }


}
