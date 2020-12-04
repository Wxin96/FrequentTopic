package com.apollo.sort.insertSort;

import java.util.Arrays;

/**
 *  插入排序
 *      有序 | 无序
 *  j 外置,
 *  1. 所有的数都大于当前数 idx = -1
 *  2. 找到一个数比当前数小, idx+1插入
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] arr = {1, 2, -1, 2, 1, 5, -18, 2};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void insertSort(int[] nums) {
        if (nums == null || nums.length <= 1) return;
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (nums[j] > temp) {
                    nums[j + 1] = nums[j];
                } else {
                    break;
                }
            }
            nums[j + 1] = temp;
        }
    }

}
