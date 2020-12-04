package com.apollo.topk;

import java.util.Arrays;
import java.util.PriorityQueue;

public class TopKFrequent {
    // 1.使用大顶堆, 保留k个元素
    public int[] topKFrequent(int[] arr, int k) {
        // 0.预处理
        if (arr == null || arr.length <= 0) {
            return new int[]{};
        }
        // 1.初始化数据
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        // 2.迭代
        for (int i = 0; i < arr.length; i++) {
            maxHeap.offer(arr[i]);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        // 3.数组
        int[] res = new int[maxHeap.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = maxHeap.poll();
        }
        return res;
    }

    // 2.使用快排解决问题
    public int[] topKFrequent02(int[] arr, int k) {
        // 0.预处理
        if (arr == null || arr.length <= 0 || k == 0) {
            return new int[]{};
        }

        return quickSort(arr, 0, arr.length - 1, k - 1);
    }

    private int[] quickSort(int[] arr, int left, int right, int k) {
        int mid = partition(arr, left, right);
        if (mid == k) {
            return Arrays.copyOf(arr, k + 1);
        }

        return mid > k ? quickSort(arr, left, mid - 1, k) : quickSort(arr, mid + 1, right, k);
    }

    private int partition(int[] arr, int left, int right) {
        // 1.初始化数据
        int index = left + 1;
        // 2.遍历
        for (int i = index; i <= right; i++) {
            if (arr[i] < arr[left]) {
                if (i != index) swap(arr, i, index);
                index++;
            }
        }

        swap(arr, index - 1, left);
        return index - 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        TopKFrequent topKFrequent = new TopKFrequent();
        int[] nums = {0, 0, 0, 2, 0, 5};
        System.out.println(Arrays.toString(topKFrequent.topKFrequent02(nums, 0)));
    }
}
