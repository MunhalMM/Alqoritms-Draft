package com.example.algorithmsdraft.testOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {9, 22}};
        System.out.println(Arrays.deepToString(merge(intervals)));

    }

    public static int[][] merge(int[][] ints) {
        if (ints.length < 2) {
            return ints;
        }
        Arrays.sort(ints, (a, b) -> a[0] - b[0]);
        List<int[]> result = new ArrayList<>();
        int[] current = ints[0];
        int start = current[0];
        int end = current[1];

        for (int i = 1; i < ints.length; i++) {
            current = ints[i];
            if (current[0] <= end) {
                end = Math.max(end, current[1]);
            } else {
                result.add(new int[]{start, end});
                start = current[0];
                end = current[1];
            }
        }
        result.add(new int[]{start, end});
        return result.toArray(new int[result.size()][2]);
    }

}
