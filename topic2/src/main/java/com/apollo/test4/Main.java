package com.apollo.test4;

public class Main {
    public static void main(String[] args) {

    }

    /**
     *  数组越界问题, 封装问题
     * @param arr
     * @param lastIdx
     */
    public static void solve(int[] arr, int lastIdx) {
        // 1.交换
        int temp = arr[0];
        arr[0] = arr[lastIdx];
        arr[lastIdx] = temp;

        // 2.交换
        int idx = 0;
        while (idx < lastIdx && (arr[idx] < arr[2 * idx + 1] || arr[idx] < arr[2 * idx + 2])) {
            if (arr[2 * idx + 1] > arr[2 * idx + 2]) {
                int temp1 = arr[2 * idx + 1];
                arr[2*idx + 1] = arr[idx];
                arr[idx] = temp1;
                idx = 2*idx + 1;
            } else {
                int temp1 = arr[2 * idx + 2];
                arr[2*idx + 2] = arr[idx];
                arr[idx] = temp1;
                idx = 2*idx + 2;
            }
        }

    }

}
