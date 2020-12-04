package com.apollo.util;

public class BuildTree {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        TreeNode root = buildTree(nums, 0);
        System.out.println(root.val);
    }

    public static TreeNode buildTree(int[] nums, int index) {
        // 1.递归头
        if (index >= nums.length) {
            return null;
        }
        TreeNode curNode = new TreeNode(nums[index]);
        curNode.left = buildTree(nums, 2 * index + 1);
        curNode.right = buildTree(nums, 2 * index + 2);

        return curNode;
    }

}

