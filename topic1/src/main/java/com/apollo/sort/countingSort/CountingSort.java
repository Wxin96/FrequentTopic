package com.apollo.sort.countingSort;

import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {
        int[] nums = {3, -1, 2, 4, -2, 3};
        CountingSort countingSort = new CountingSort();
        System.out.println(Arrays.toString(countingSort.countingSort02(nums)));
    }

    public int[] countingSort(int[] nums) {
        if (nums == null || nums.length <= 0) return nums;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        int[] count = new int[max - min + 1];
        for (int num : nums) {
            count[num - min]++;
        }
        int[] res = new int[nums.length];
        int idx = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                res[idx++] = min + i;
                count[i]--;
            }
        }
        return res;
    }

    // 稳定排序
    // 1. count累加
    // 2. nums反序统计
    public int[] countingSort02(int[] nums) {
        if (nums == null || nums.length <= 0) return nums;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        int[] count = new int[max - min + 1];
        for (int num : nums) {
            count[num - min]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        int[] res = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            res[--count[nums[i] - min]] = nums[i];
        }
        return res;
    }
}
