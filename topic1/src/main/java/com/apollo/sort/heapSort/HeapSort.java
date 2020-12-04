package com.apollo.sort.heapSort;

import java.util.Arrays;

/**
 * 堆排序
 * 　　a.将无需序列构建成一个堆，根据升序降序需求选择大顶堆或小顶堆;
 *
 * 　　b.将堆顶元素与末尾元素交换，将最大元素"沉"到数组末端;
 *
 * 　　c.重新调整结构，使其满足堆定义，然后继续交换堆顶元素与当前末尾元素，反复执行调整+交换步骤，直到整个序列有序。
 * 时间复杂度: O(nlog(n)) 最好,平均,最差
 * 空间复杂度: O(1)
 * 稳定性: 不稳定排序(a1, a2.... 若a1=a2, 大顶堆最大两个数, 排序后a2与a1顺序相反)
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] nums = {9, 3, 1, 8, 4, 5};

        heapSort(nums);
        System.out.println(Arrays.toString(nums));
    }


    private static void heapSort(int[] nums) {
        int len = nums.length;
        // 大顶堆构成(第一个非叶子节点)
        for (int i = len / 2 - 1; i >= 0; i--) {
            adjustHeap(nums, i, len);
        }

        // 排序
        for (int i = len - 1; i >= 0; i--) {
            swap(nums, i, 0);
            adjustHeap(nums, 0, i);
        }

    }

    private static void adjustHeap(int[] nums, int startIdx, int length) {
        int temp = nums[startIdx];

        for (int i = startIdx * 2 + 1; i < length; i = 2 * i + 1) {
            if (i + 1 < length && nums[i + 1] > nums[i]) i += 1;
            if (nums[i] > temp) {
                nums[startIdx] = nums[i];
                startIdx = i;
            } else {
                break;
            }
        }

        nums[startIdx] = temp;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
