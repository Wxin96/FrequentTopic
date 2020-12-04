package com.apollo.sort.selectSort;

import java.util.Arrays;

/**
 *  选择排序, 假设第i位最小,从i到N,选择最小的和i交换
 *  i ~ len-1
 *  i+1 ~ len - 1
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 2, 4};
        SelectSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void SelectSort(int[] nums) {
        if (nums == null || nums.length <= 1) return;

        for (int i = 0; i < nums.length; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
    }

}
