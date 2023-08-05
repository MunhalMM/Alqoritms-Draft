package com.example.algorithmsdraft.testOne;

public class Ex8 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }

    public static int longestOnes(int[] nums, int k) {
        int n = nums.length;
        if (n < 2 && 0 < k) return n;
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int counter = 0;

        while (right < n) {
            if (nums[right] == 0) {
                counter++;
            }

            while (k < counter) {
                if (nums[left] == 0) {
                    counter--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;

    }
}
