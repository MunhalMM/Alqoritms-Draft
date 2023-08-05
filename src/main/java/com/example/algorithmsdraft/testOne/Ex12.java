package com.example.algorithmsdraft.testOne;

import java.util.LinkedList;
import java.util.Queue;

public class Ex12 {
    public static int sumOfElementTree(TreeNode treeNode) {
        Queue<TreeNode> queue = new LinkedList<>();
        int sum = 0;
        queue.add(treeNode);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            sum += node.val;

            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);

        }
        return sum;
    }
}
