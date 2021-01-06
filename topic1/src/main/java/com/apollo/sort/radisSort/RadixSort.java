package com.apollo.sort.radisSort;

import java.util.Arrays;

/**
 * 非负整数排序
 */
public class RadixSort {
    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 1100, 1, 3, 49, 34, 2, 3, 34};
        radixSort(nums, 10);
        System.out.println(Arrays.toString(nums));
    }

    private static void radixSort(int[] nums, int mod) {
        int maxDigit = getMaxDigit(nums);
        int dev = 1;
        for (int i = 0; i < maxDigit; i++, dev *= 10, mod *= 10) {
            // 考虑负数的情况，这里扩展一倍队列数，其中 [0-9]对应负数，[10-19]对应正数 (bucket + 10)
            int[][] counter = new int[mod * 2][0];
            for (int j = 0; j < nums.length; j++) {
                int bucket = ((nums[j] % mod) / dev) + mod;
                counter[bucket] = arrayAppend(counter[bucket], nums[j]);
            }

            int pos = 0;
            for (int[] bucket : counter) {
                for (int value : bucket) {
                    nums[pos++] = value;
                }
            }
        }
    }

    /**
     * 自动扩容，并保存数据
     *
     * @param nums
     * @param value
     */
    private static int[] arrayAppend(int[] nums, int value) {
        nums = Arrays.copyOf(nums, nums.length + 1);
        nums[nums.length - 1] = value;
        return nums;
    }

    private static int getMaxDigit(int[] nums) {
        int maxValue = getMaxValue(nums);
        return getNumLength(maxValue);
    }

    private static int getMaxValue(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }

    private static int getNumLength(int num) {
        if (num == 0) return 1;
        int length = 0;
        for (; num != 0; num /= 10) {
            length++;
        }
        return length;
    }

}
