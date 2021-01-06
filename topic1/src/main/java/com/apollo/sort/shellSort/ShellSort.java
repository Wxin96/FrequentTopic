package com.apollo.sort.shellSort;

import java.util.Arrays;

/**
 * 交换法 and 移动法
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] nums = {1, 4, 5, 1, 3, -3, 19, 2, 4, -100, 0x7f_ff_ff_ff};
        shellSortMove(nums);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 交换法排序
     * @param nums 待排序数组
     */
    public static void shellSortSwap(int[] nums) {
        for (int gap = nums.length >> 1; gap >= 1; gap >>= 1) {
            for (int idx = gap; idx < nums.length; idx++) {
                while (idx >= gap && nums[idx] < nums[idx - gap]) {
                    swap(nums, idx, idx - gap);
                    idx -= gap;
                }
            }
        }
    }

    /**
     * 移动法排序
     * @param nums 待排序数组
     */
    public static void shellSortMove(int[] nums) {
        for (int gap = nums.length; gap >= 1; gap >>= 1) {
            for (int idx = gap; idx < nums.length; idx++) {
                int tmp = nums[idx];
                // 此处是tmp！
                while (idx >= gap && tmp < nums[idx - gap]) {
                    nums[idx] = nums[idx - gap];
                    idx -= gap;
                }
                nums[idx] = tmp;
            }
        }
    }


    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
