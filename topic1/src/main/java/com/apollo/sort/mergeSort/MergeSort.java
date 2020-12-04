package com.apollo.sort.mergeSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 6, 4, 9, 13};
        mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void mergeSort(int[] nums) {
        int[] temp = new int[nums.length];
        mergeSort(nums, 0, nums.length - 1, temp);
    }

    public static void mergeSort(int[] nums, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) >>> 1;
            mergeSort(nums, left, mid, temp);
            mergeSort(nums, mid + 1, right, temp);
            merge(nums, left, right, mid, temp);
        }
    }

    public static void merge(int[] nums, int left, int right, int mid, int[] temp) {
        int pointer1 = left, pointer2 = mid + 1;
        int pointer = left;
        while (pointer1 <= mid && pointer2 <= right) {
            if (nums[pointer1] <= nums[pointer2]) {
                temp[pointer++] = nums[pointer1++];
            } else {
                temp[pointer++] = nums[pointer2++];
            }
        }
        while (pointer1 <= mid) {
            temp[pointer++] = nums[pointer1++];
        }
        while (pointer2 <= right) {
            temp[pointer++] = nums[pointer2++];
        }
        pointer = left;
        while (pointer <= right) {
            nums[pointer] = temp[pointer];
            pointer++;
        }
    }
}
