public class SortedArrayToBalancedBST {
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

    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static Node BuildBalancedTree(int arr[],int low ,int high){
        if(low>high) return null;
        int mid=low+(high-low)/2;
        Node root =new Node(arr[mid]);
        Node left=BuildBalancedTree(arr,low,mid-1);
        Node right=BuildBalancedTree(arr,mid+1,high);
        root.left=left;
        root.right=right;
        return root;
    }
    public static void main(String args[]){
       int arr[]={1,2,3,4,5,6,7,8,9};
       Node root=BuildBalancedTree(arr,0,arr.length-1);
       inorder(root);
    }
    
}
