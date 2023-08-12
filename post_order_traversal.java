import java.util.* ;
import java.io.*; 
/*
    
    Following is the Binary Tree node structure:

    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.data = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
           this.data = val;
            this.left = left;
            this.right = right;
        }
    }

*/

public class Solution {
    public static List < Integer > getPostOrderTraversal(TreeNode root) {
    	// Write your code here.
        ArrayList<Integer> list = new ArrayList<>();
        return postOrderTraversal(list, root);
    }
    public static List<Integer> postOrderTraversal(ArrayList<Integer> list, TreeNode node){
        if(node == null){
            return list;
        }
        postOrderTraversal(list, node.left);
        postOrderTraversal(list, node.right);
        list.add(node.data);
        return list;
    }
}
