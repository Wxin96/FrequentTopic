package com.apollo.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9, 9, 9, 9, 11};
        System.out.println(binarySearchLast(nums, 5));
    }

    public static int binarySearch(int[] nums, int target) {
        if (nums == null || nums.length <= 0) return -1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) right = mid - 1;
            else if (nums[mid] < target) left = mid + 1;
        }
        return -1;
    }

    public static int binarySearchFirst (int[] nums, int target) {
        if (nums == null || nums.length <= 0) return -1;
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] == target) right = mid;
            else if (nums[mid] > target) right = mid;
            else if (nums[mid] < target) left = mid + 1;
        }
        System.out.println(left);
        if (left == nums.length || nums[left] != target) return -1;
        return left;
    }

    public static int binarySearchLast(int[] nums, int target) {
        if (nums == null || nums.length <= 0) return -1;
        int left = -1, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right + 1) >>> 1;
            if (nums[mid] == target) left = mid;
            else if (nums[mid] > target) right = mid -1;
            else if (nums[mid] < target) left = mid;
        }
        System.out.println(left);
        // if (nums[left] != target) return -1;
        return left;
    }
}
