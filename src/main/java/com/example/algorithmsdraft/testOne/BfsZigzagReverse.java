package com.example.algorithmsdraft.testOne;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BfsZigzagReverse {
    public static void main(String[] args) {

    }

    public List<List<Integer>> zigzagBfsReverse(TreeNode root) {
        if (root == null) return null;
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> row = new LinkedList<>();
            int size = queue.size();
            boolean flag = true;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (flag) {
                    row.add(node.val);
                } else {
                    row.add(0, node.val);
                }
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            flag = false;
            result.add(row);
        }
        return result;
    }
}
