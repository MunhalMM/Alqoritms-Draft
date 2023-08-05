package com.example.algorithmsdraft.testOne;

import java.util.Arrays;

public class Ex7 {
    public static void main(String[] args) {
        int[] numbers = {0, 2, 3, 4, 5, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum2(numbers, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                return new int[]{left, right};
            }

        }
        return new int[]{-1, -1};
    }

    public static int[] twoSum2(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left, right};
            }
            if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1, -1};
    }
}