package com.example.algorithmsdraft.testOne;

import java.util.ArrayList;
import java.util.List;

public class Ex9 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(-2);
        list.add(3);
        list.add(-11);
        list.add(10);
        list.add(21);
        list.add(0);
        list.add(9);
        list.sort((x, y) -> -x.compareTo(y));
        System.out.println(list);
    }
}
