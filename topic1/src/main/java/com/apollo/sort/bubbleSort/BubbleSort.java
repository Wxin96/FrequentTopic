package com.apollo.sort.bubbleSort;

import java.util.Arrays;

/**
 * 冒泡排序
 * i [1, len)
 * j [0, len - i)
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = {-1, 3, 1, 18, 34, 2, 4, 24};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }


    public static void bubbleSort(int[] nums) {
        if (nums == null || nums.length <= 1) return;
        for (int i = 1; i < nums.length; i++) {
            boolean flag = true;
            for (int j = 0; j < nums.length - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) break;;
        }
    }

}
