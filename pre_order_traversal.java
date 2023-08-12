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
    public static List < Integer > getPreOrderTraversal(TreeNode root) {
    	// Write your code here.
		ArrayList<Integer> list = new ArrayList<>();
		return preOrderTraversal(list, root);
    }

	public static List <Integer> preOrderTraversal(ArrayList<Integer> list, TreeNode node){
		if(node == null){
			return list;
		}
		list.add(node.data);
		preOrderTraversal(list, node.left);
		preOrderTraversal(list, node.right);
		return list;
	}
}
