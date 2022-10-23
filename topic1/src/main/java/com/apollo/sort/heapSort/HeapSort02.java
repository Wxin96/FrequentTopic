package com.apollo.sort.heapSort;

import java.util.Arrays;

public class HeapSort02 {
    public static void main(String[] args) {
        int[] nums = {9, 3, 1, 8, 4, 5, -2};

        heapSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void heapSort(int[] nums) {
        if (nums == null || nums.length <= 1) return;
        for (int i = nums.length / 2 - 1; i >= 0; i--) {
            adjustHeap(nums, i, nums.length);
        }
        for (int i = nums.length - 1; i > 0; i--) {
            swap(nums, 0, i);
            adjustHeap(nums, 0, i);
        }
    }

    /**
     * 构造 大顶堆
     *
     * @param nums
     * @param idx
     */
    private static void adjustHeap(int[] nums, int idx, int len) {
        int tmp = nums[idx];
        for (int i = 2 * idx + 1; i < len; i = 2 * i + 1) {
            if (i + 1 < len && nums[i + 1] > nums[i]) i += 1;
            if (nums[i] > tmp) {
                nums[idx] = nums[i];
                idx = i;
            } else {
                break;
            }
        }
        nums[idx] = tmp;
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}
