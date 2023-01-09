package BinaryTree;

import java.util.*;

public class Traversal 
{
    public static void main(String args[])
    {

    }

    public List<Integer> answer = new ArrayList<>();

    public static void depthFirstSearch(TreeNode node)
    {
        if(node == null)
        {
            return;
        }

        answer.add(node.val);
        depthFirstSearch(node.left);
        depthFirstSearch(node.right);
    }

    public static List<Integer> preOrderTraversal(TreeNode root)
    {
        depthFirstSearch(root);
        return answer;
    }
}
