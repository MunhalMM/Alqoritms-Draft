package com.example.algorithmsdraft.testOne;

import java.util.ArrayList;
import java.util.List;

public class Ex15 {

    public static void main(String[] args) {
        int[] nums = {5, 4, 7, 2, 3, 5, 3};
        System.out.println(findNumbers(nums));
    }

    public static List<Integer> findNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int index = nums[i] - 1;
            if (index != i) {
                if (nums[i] == nums[index]) {
                    result.add(nums[i]);
                    i++;
                } else {
                    swap(nums, i, index);
                }
            } else {
                i++;
            }
        }
        return result;
    }

    private static void swap(int[] nums, int i, int index) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
}
