package com.apollo.topk;

public class Tok {

    public static void main(String[] args) {
        Tok tok = new Tok();
        int[] nums = {1,3,5,2,2};
        int n = 5, K = 1;
        System.out.println(tok.findKth(nums, n, K));
    }

    public int findKth(int[] a, int n, int K) {
        // write code here
        return solve(a, 0, a.length - 1, n - K);
    }

    private int solve(int[] nums, int left, int right, int index) {
        int k = partition(nums, left, right);

        if (k == index) {
            return nums[k];
        }

        return k > index ? solve(nums, left, k - 1, index) : solve(nums, k + 1, right, index);
    }

    private int partition(int[] nums, int left, int right) {
        // 1.初始化数据
        int index = left + 1;
        // 2.遍历
        for (int i = index; i <= right; i++) {
            if (nums[i] < nums[left]) {
                if (index != i) {
                    swap(nums, i, index);
                }
                index++;
            }
        }

        swap(nums, index - 1, left);

        return index - 1;
    }

    private void swap (int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
