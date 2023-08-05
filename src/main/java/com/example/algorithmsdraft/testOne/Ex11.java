package com.example.algorithmsdraft.testOne;

public class Ex11 {
    public static void main(String[] args) {
        Object o = null;
        String s = String.valueOf(o);
        System.out.println(s);
        String su = "poka";

        //System.out.println(String.valueOf(null));
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;
        return root;
    }
}
