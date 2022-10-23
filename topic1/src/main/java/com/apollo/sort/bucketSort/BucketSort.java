package com.apollo.sort.bucketSort;

import java.util.Arrays;

public class BucketSort {
    public static void main(String[] args) {
        int[] nums = {-45, 1, 2, 6, 100, 1, 3, 49, 34, 2, 3, 34};
        bucketSort(nums, 10);
        System.out.println(Arrays.toString(nums));
    }

    public static void bucketSort(int[] nums, int bucketSize) {
        if (nums == null || nums.length == 0) return;
        int minVal = nums[0], maxVal = nums[0];
        for (int num : nums) {
            minVal = Math.min(minVal, num);
            maxVal = Math.max(maxVal, num);
        }
        int bucketCnt = (int) Math.floor((maxVal - minVal) / bucketSize) + 1;
        int[][] bucket = new int[bucketCnt][0];
        for (int num : nums) {
            int idx = (int) Math.floor((num - minVal) / bucketSize);
            bucket[idx] = arrayAppend(bucket[idx], num);
        }
//        System.out.println(Arrays.deepToString(bucket));
        int idx = 0;
        for (int i = 0; i < bucketCnt; i++) {
            insertSort(bucket[i]);
            for (int num : bucket[i]) {
                nums[idx++] = num;
            }
        }
    }

    private static int[] arrayAppend(int[] nums, int val) {
        nums = Arrays.copyOf(nums, nums.length + 1);
        nums[nums.length - 1] = val;
        return nums;
    }

    private static void insertSort(int[] nums) {
        if (nums == null || nums.length <= 0) return;
        for (int i = 1; i < nums.length; i++) {
            int tmp = nums[i];
            int idx = i - 1;
            while (idx >= 0 && nums[idx] > tmp) {
                nums[idx + 1] = nums[idx];
                idx--;
            }
            nums[idx + 1] = tmp;
        }
    }
}
