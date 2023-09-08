package com.example.algorithmsdraft.testOne;

import java.util.ArrayList;
import java.util.List;

public class UniqueNumbersFinder {
    public static void main(String[] args) {
        int[] inputArray = {1, 4, 2, 1, 3, 5, 6, 2, 3, 5};
        List<Integer> output = findUniqueNumbers(inputArray);
        System.out.println(output);  // Output: [4, 6]
    }

    public static List<Integer> findUniqueNumbers(int[] inputArray) {
        int xorResult = 0;

        // XOR all elements in the array
        for (int num : inputArray) {
            xorResult ^= num;
        }

        // Find the rightmost set bit in xorResult
        int mask = 1;
        while ((xorResult & mask) == 0) {
            mask <<= 1;
        }

        int firstUnique = 0;
        int secondUnique = 0;

        // Separate numbers based on the set bit
        for (int num : inputArray) {
            if ((num & mask) == 0) {
                firstUnique ^= num;
            } else {
                secondUnique ^= num;
            }
        }

        List<Integer> uniqueNumbers = new ArrayList<>();
        uniqueNumbers.add(firstUnique);
        uniqueNumbers.add(secondUnique);

        return uniqueNumbers;
    }
}

