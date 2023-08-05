package com.example.algorithmsdraft.testOne;

import java.util.HashMap;
import java.util.Map;

public class Ex4 {
    public static void main(String[] args) {
        String s = "xyzzaz";
        int size = 3;
        System.out.println(uniqueSubStringCount(s, size));

        String s2 = "xyzzab";
        int size2 = 3;
        System.out.println(uniqueSubStringCount(s2, size2));
    }

    public static int uniqueSubStringCount(String s, int k) {
        int count = 0;
        int start = 0;
        Map<Character, Integer> characterMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            characterMap.put(s.charAt(i), characterMap.getOrDefault(s.charAt(i), 0) + 1);
            if (i >= k - 1) {
                if (characterMap.size() == k) {
                    count++;
                }
                if (characterMap.get(s.charAt(start)) > 1) {
                    characterMap.put(s.charAt(start), characterMap.getOrDefault(s.charAt(start), 0) - 1);
                } else {
                    characterMap.remove(s.charAt(start));
                }
                start++;
            }
        }
        return count;
    }
}
