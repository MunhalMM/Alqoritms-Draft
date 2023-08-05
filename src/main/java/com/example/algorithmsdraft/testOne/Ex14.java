package com.example.algorithmsdraft.testOne;

import java.util.LinkedList;
import java.util.Queue;

public class Ex14 {
    public static int countIslands(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int islandCount = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 1) {
                    islandCount++;
                    countIslandArea(i, j, matrix);
                }
            }
        }
        return islandCount;
    }

    public static void countIslandArea(int i, int j, int[][] matrix) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            int row = arr[0];
            int col = arr[1];
            if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length) {
                continue;
            }
            if (matrix[row][col] == 0) {
                continue;
            }
            matrix[row][col] = 0;
            int[] left = {row, col - 1};
            int[] right = {row, col + 1};
            int[] up = {row - 1, col};
            int[] down = {row + 1, col};

            queue.add(left);
            queue.add(right);
            queue.add(up);
            queue.add(down);
        }
    }
}
