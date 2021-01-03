package com.apollo.sort.quickSort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] nums = {1, 4, 5, 1, 3, -3, 19, 2};
        System.out.println(Arrays.toString(nums));
        quickSort.quickSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void quickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    private void quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = partition(nums, left, right);
            quickSort(nums, left, mid - 1);
            quickSort(nums, mid + 1, right);
        }
    }

    private int partition(int[] nums, int left, int right) {
        // 1.初始化数据
        int pivot = left;
        int index = pivot + 1; // 懒惰指针
        // 2.遍历
        for (int i = index; i <= right; i++) {
            if (nums[i] < nums[pivot]) {
                if (i != index) swap(nums, i, index);
                index++;
            }
        }
        swap(nums, pivot, index - 1);

        return index - 1;
    }

    private int partition02(int[] nums, int left, int right) {
        // 1.初始化数据
        int l = left, r = right + 1;
        // 2.前后指针
        while (true) {
            // a.左大
            while (++l <= right && nums[l] < nums[left]) ;
            // b.右小
            while (--r >= left && nums[r] > nums[left]) ;
            if (l >= r) {
                break;
            }
            swap(nums, l, r);
        }
        swap(nums, r, left);

        return r;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
