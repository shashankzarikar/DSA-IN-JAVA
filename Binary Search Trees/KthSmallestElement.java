/*
Question:
Given the root of a Binary Search Tree (BST) and an integer K,
find the K-th smallest element in the BST.

Approach:
1. Perform inorder traversal (Left, Root, Right).
2. Maintain a counter of visited nodes.
3. Increment the counter when visiting a node.
4. When counter becomes K, return that node.
5. Propagate the answer upward to stop further traversal.

Time Complexity:
O(H + K) average case
O(N) worst case

where:
N = number of nodes
H = height of BST

Space Complexity:
O(H)

due to recursion stack.

Balanced BST:
O(log N) space

Skewed BST:
O(N) space
*/

public class KthSmallestElement {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    static int counter = 0;

    public static Node kthSmallest(Node root, int k) {

        if (root == null)
            return null;

        Node leftAns = kthSmallest(root.left, k);
        if (leftAns != null)
            return leftAns;

        counter++;
        if (counter == k)
            return root;

        Node rightAns = kthSmallest(root.right, k);
        if (rightAns != null)
            return rightAns;

        return null;
    }

    public static void main(String args[]) {
        Node root = new Node(8);

        root.left = new Node(5);
        root.right = new Node(11);

        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.left.left.left = new Node(1);

        root.right.left = new Node(10);
        root.right.right = new Node(14);

        int k = 4;

        System.out.println("Kth smallest element is :"+kthSmallest(root,k).data);
    }
}
