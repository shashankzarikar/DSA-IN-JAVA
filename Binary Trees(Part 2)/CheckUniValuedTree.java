/*
Question:
Check whether a Binary Tree is Univalued or not.

A Binary Tree is called Univalued if all nodes
contain the same value.

Return true if the tree is univalued,
otherwise return false.
*/

//Time Complexity=O(n)
//Space Complexity=O(h)

public class CheckUniValuedTree {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static boolean checkUnivalued(Node root , int value){
        if(root==null) return true;
        if(root.data!=value) return false;
        if(!checkUnivalued(root.left,value)) return false;
        if(!checkUnivalued(root.right,value)) return false;
        return true;
    }
    public static void main(String args[]){
         /*
                7
              /   \
             7     7
            / \   / \
           7  7  7  7
        */

        Node root = new Node(7);

        root.left = new Node(7);
        root.right = new Node(7);

        root.left.left = new Node(7);
        root.left.right = new Node(7);

        root.right.left = new Node(7);
        root.right.right = new Node(7);

        System.out.println(checkUnivalued(root,root.data));
    }
    
}
