import java.util.*;
public class ConvertBSTtoBalancedBST {
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

    public static void preorder(Node root){
        if(root==null) return ;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root,ArrayList<Integer> list){
        if(root==null) return;
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }

    public static Node BuildBalancedTree(ArrayList<Integer> arr,int low ,int high){
        if(low>high) return null;
        int mid=low+(high-low)/2;
        Node root =new Node(arr.get(mid));
        Node left=BuildBalancedTree(arr,low,mid-1);
        Node right=BuildBalancedTree(arr,mid+1,high);
        root.left=left;
        root.right=right;
        return root;
    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.right = new Node(2);
        root.right.right = new Node(3);
        root.right.right.right = new Node(4);
        root.right.right.right.right = new Node(5);

        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        Node newroot=BuildBalancedTree(arr,0,arr.size()-1);
        preorder(newroot);


    }
    
}
