/*
Question:
Delete all leaf nodes with value x from a binary tree.
Also delete newly formed leaf nodes having value x.

Time Complexity:O(n)
Space Complexity:O(h)
Worst Case:
O(n) for skewed tree.
*/
public class DeleteLeafNodesWithValueX {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node deleteNode(Node root, int x) {
        if (root == null)
            return null;
        root.left = deleteNode(root.left, x);
        root.right = deleteNode(root.right, x);
        if (root.data == x && root.left == null && root.right == null)
            return null;
        return root;

    }

    public static void main(String args[]) {
        Node root = new Node(1);

        root.left = new Node(3);
        root.right = new Node(3);

        root.left.left = new Node(3);
        root.left.right = new Node(2);

        root.right.right = new Node(3);

        root.left.left.left = new Node(3);

        int x=3;
        
        preorder(root);
        System.out.println();
        root=deleteNode(root,x);
        preorder(root);

        
    }

}
