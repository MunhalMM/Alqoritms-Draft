package com.example.algorithmsdraft.testOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        System.out.println(Arrays.deepToString(Ex2.insert(intervals, newInterval)));

    }


    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        for (int[] in : intervals) {
            if (in[1] < newInterval[0]) {
                result.add(in);
            } else if (newInterval[1] < in[0]) {
                result.add(newInterval);
                newInterval = in;
            } else {
                newInterval[0] = Math.min(newInterval[0], in[0]);
                newInterval[1] = Math.max(newInterval[1], in[1]);

            }
        }
        result.add(newInterval);
        return result.toArray(new int[result.size()][]);
    }
}
