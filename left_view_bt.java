import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T> 
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) 
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        int level = 0;
        return findLeftView(list, level, root);
    }
    public static ArrayList<Integer> findLeftView(ArrayList<Integer> list, int level, TreeNode node){
        if(node == null){
            return list;
        }
        if(list.size() == level){
            list.add((int)node.data);
        }
        findLeftView(list, level+1, node.left);
        findLeftView(list, level+1, node.right);
        return list;
    }
}
