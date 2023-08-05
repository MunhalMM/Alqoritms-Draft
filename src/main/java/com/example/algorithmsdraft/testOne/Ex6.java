package com.example.algorithmsdraft.testOne;


public class Ex6 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 56, 12};
        printArr(nums);
        System.out.println(findElement(nums, 56));

    }

    static void printArr(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    static int findElement(int[] nums, int value) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
