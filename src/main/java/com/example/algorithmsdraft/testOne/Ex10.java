package com.example.algorithmsdraft.testOne;

public class Ex10 {
    public static void main(String[] args) {
        int[] nums = {9, 72, 34, 29, -49, -22, -77, -17, -66, -75, -44, -30, -24};
        System.out.println(arraySign(nums));
    }
    public static int arraySign(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (i == 0)
                return 0;
            if (i < 0)
                count++;
        }
        return count % 2 == 0 ? 1 : -1;
    }
}
