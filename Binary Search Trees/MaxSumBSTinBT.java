/*
Question:
Given the root of a Binary Tree, find the maximum sum among all
subtrees that are Binary Search Trees (BSTs).

A Binary Search Tree (BST) is a tree in which:
1. All nodes in the left subtree are smaller than the root.
2. All nodes in the right subtree are greater than the root.
3. Both left and right subtrees are also BSTs.

Return the maximum sum of values of any BST subtree present in
the given Binary Tree.

Time Complexity: O(N)
- Each node is visited exactly once.

Space Complexity: O(H)
- Recursive call stack, where H is the height of the tree.
- Worst Case (skewed tree): O(N)
- Best Case (balanced tree): O(log N)
*/
public class MaxSumBSTinBT {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class NodeInfo {
        boolean isBST;
        int sum;
        int min;
        int max;

        NodeInfo(boolean isBST, int sum, int min, int max) {
            this.isBST = isBST;
            this.sum = sum;
            this.min = min;
            this.max = max;
        }
    }

    static int maxSum = 0;

    public static NodeInfo maxSumBST(Node root) {
        if (root == null)
            return new NodeInfo(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);

        NodeInfo left = maxSumBST(root.left);
        NodeInfo right = maxSumBST(root.right);

        boolean isBST = left.isBST && right.isBST && left.max < root.data && right.min > root.data;
        int sum = left.sum + right.sum + root.data;
        int min = Math.min(root.data, Math.min(left.min, right.min));
        int max = Math.max(root.data, Math.max(left.max, right.max));

        if (isBST)
            maxSum = Math.max(maxSum, sum);

        return new NodeInfo(isBST, sum, min, max);

    }

    public static void main(String args[]) {

        Node root = new Node(5);

        root.left = new Node(4);
        root.right = new Node(8);

        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.right.left = new Node(7);
        root.right.right = new Node(9);

        maxSumBST(root);

        System.out.println("Maximum Sum BST = " + maxSum);
    }

}
