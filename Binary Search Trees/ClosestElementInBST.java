/*
Question:
Given the root of a Binary Search Tree (BST) and a target value K,
find the node whose value has the minimum absolute difference from K.

If K is present in the BST, return that node itself.
Otherwise, return the node whose value is closest to K.

Time Complexity:
O(h)

where h = height of the BST

Balanced BST  -> O(log n)
Skewed BST    -> O(n)

Space Complexity:
O(h)

*/
public class ClosestElementInBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node closestNode = null;
    public static int closestDiff = Integer.MAX_VALUE;

    public static void closestElement(Node root, int k) {

        if (root == null)
            return ;

        int currDiff = k - root.data;

        if (Math.abs(currDiff) < closestDiff) {
            closestNode = root;
            closestDiff = Math.abs(currDiff);
        }

        if (currDiff < 0)
            closestElement(root.left, k);
        else if (currDiff > 0)
            closestElement(root.right, k);
        else return;
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

        root.right.right.left = new Node(13);

        int k = 12;

        closestElement(root, k);

        System.out.println("Closest Element = " + closestNode.data);
    }

}
