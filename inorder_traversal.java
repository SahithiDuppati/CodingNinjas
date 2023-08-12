/*
    Following is the TreeNode class structure:

    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode() {
            this.data = 0;
            this.left = null;
            this.right = null;
        }
        TreeNode(int val) {
            this.data = val;
            this.left = null;
            this.right = null;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.data = val;
            this.left = left;
            this.right = right;
        }
    };
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List< Integer > getInOrderTraversal(TreeNode root) {
        // Write your code here.
        ArrayList<Integer> list = new ArrayList<>();
        return inorderTraversal(list, root);
    }

    public static List<Integer> inorderTraversal(ArrayList<Integer> list, TreeNode node){
        if(node == null){
            return list;
        }
        inorderTraversal(list, node.left);
        list.add(node.data);
        inorderTraversal(list, node.right);
        return list;
    }
}
