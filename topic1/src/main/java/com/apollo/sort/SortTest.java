package com.apollo.sort;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        int[] nums = {3, -1, -2, -6, 20, 100, -34};
        // quickSort(nums, 0, nums.length - 1);
        heapSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void bubbleSort(int[] nums) {
        if (nums == null) return;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            boolean flag = true;
            for (int j = 1; i + j < len; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    flag = false;
                }
            }
            if (flag) break;
            ;
        }
    }

    public static void bubbleSort02(int[] nums) {
        if (nums == null || nums.length <= 0) return;
        for (int i = 0; i < nums.length; i++) {
            boolean flag = true;
            for (int j = 1; i + j < nums.length; j++) {
                if (nums[j - 1] > nums[j]) {
                    int tmp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = tmp;
                    flag = false;
                }
            }
            if (flag) break;
        }
    }

    public static void selectSort(int[] nums) {
        if (nums == null) return;
        for (int i = 0; i < nums.length - 1; i++) {
            int idx = i, min = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    idx = j;
                }
            }
            if (i != idx) swap(nums, i, idx);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        if (nums == null || i > nums.length || j > nums.length) throw new RuntimeException("输入有误");
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    /*public static void heapSort(int[] nums) {
        if (nums == null) return;
        int len = nums.length;
        for (int i = len / 2 - 1; i >= 0; i--) {
            adjustSort(nums, i, len);
        }
        for (int i = len - 1; i > 0; i--) {
            swap(nums, 0, i);
            adjustSort(nums,0, i);
        }
    }

    public static void adjustSort(int[] nums, int start, int len) {
        int idx = start, temp = nums[start];
        for (int i = 2 * start + 1; i < len; i = 2 * i + 1) {
            if (i + 1 < len && nums[i + 1] > nums[i]) i += 1;
            if (nums[i] > temp) {
                nums[idx] = nums[i];
                idx = i;
            } else {
                break;
            }
        }
        nums[idx] = temp;
    }*/

    public static void heapSort(int[] nums) {
        if (nums == null || nums.length <= 1) return;
        for (int i = nums.length / 2 - 1; i >= 0; i--) {
            adjustSort(nums, i, nums.length);
        }
        for (int i = nums.length - 1; i > 0; i--) {
            swap(nums, 0, i);
            adjustSort(nums, 0, i);
        }
    }

    private static void adjustSort(int[] nums, int start, int end) {
        int idx = start, tmp = nums[start];
        for (int i = 2 * idx + 1; i < end; i = 2 * i + 1) {
            if (i + 1 < end && nums[i + 1] > nums[i]) i += 1;
            if (nums[i] > tmp) {
                nums[idx] = nums[i];
                idx = i;
            } else {
                break;
            }
        }
        nums[idx] = tmp;
    }


    public static void insertSort(int[] nums) {
        if (nums == null) return;
        for (int i = 1; i < nums.length; i++) {
            int j = i - 1, temp = nums[i];
            for (; j >= 0; j--) {
                if (nums[j] > temp) {
                    nums[j + 1] = nums[j];
                } else {
                    break;
                }
            }
            nums[j + 1] = temp;
        }
    }

    /*
    public static void quickSort(int[] nums, int left, int right) {
        if (left >= right) return;
        int mid = partition(nums, left, right);
        quickSort(nums, left, mid - 1);
        quickSort(nums, mid + 1, right);
    }

    private static int partition(int[] nums, int left, int right) {
        int idx = left + 1;
        for (int i = idx; i <= right; i++) {
            if (nums[i] < nums[left]) {
                swap(nums, i, idx);
                idx++;
            }
        }
        swap(nums, left, idx - 1);
        return idx - 1;
    }
    */

    public static void quickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    public static void quickSort(int[] nums, int left, int right) {
        if (left > right) return;
        int mid = partition(nums, left, right);
        quickSort(nums, left, mid - 1);
        quickSort(nums, mid + 1, right);
    }

    private static int partition(int[] nums, int left, int right) {
        int index = left + 1;
        for (int i = index; i < nums.length; i++) {
            if (nums[i] < nums[left]) {
                swap(nums, i, index);
                index++;
            }
        }
        swap(nums, index - 1, left);
        return index - 1;
    }


}
