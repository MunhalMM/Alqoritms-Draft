package com.example.algorithmsdraft.testOne;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BfsReverse {
    public static void main(String[] args) {

    }

    public void BFSreverse(TreeNode root) {
        if (root == null) return;
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> row = new LinkedList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode element = queue.poll();
                row.add(element.val);
                if (element.left != null) {
                    queue.add(element.left);
                }
                if (element.right != null) {
                    queue.add(element.right);
                }
                result.add(0, row);
            }
        }
    }
}
