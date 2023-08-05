package com.example.algorithmsdraft.testOne;

import java.util.HashSet;
import java.util.Set;

public class Ex5 {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(findMaximumSubstring(s));
    }

    public static int findMaximumSubstring(String s) {
        int start = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            while (set.contains(c)) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(c);
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
}