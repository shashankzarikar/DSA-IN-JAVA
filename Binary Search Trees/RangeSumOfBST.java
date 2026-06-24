/*
Question:
Given the root of a Binary Search Tree (BST) and two integers l and r,
return the sum of values of all nodes whose values lie in the range [l, r]
(inclusive).

Example:

        8
      /   \
     5     10
    / \      \
   3   6      11

l = 5, r = 10

Nodes in range: 5, 6, 8, 10

Output: 29
*/

public class RangeSumOfBST{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int rangeSum(Node root , int l , int r){
        if(root==null) return 0;
        
        if(root.data<l) {
            return rangeSum(root.right,l,r);
        }

        if(root.data>r) {
            return rangeSum(root.left,l,r);
        }

        return root.data+rangeSum(root.left,l,r)+rangeSum(root.right,l,r);
        
    }
    public static void main(String args[]) {
    
    Node root = new Node(8);
    root.left = new Node(5);
    root.right = new Node(10);

    root.left.left = new Node(3);
    root.left.right = new Node(6);

    root.right.right = new Node(11);

    int l = 5;
    int r = 10;

    System.out.println("Range Sum = " + rangeSum(root, l, r));
}
}