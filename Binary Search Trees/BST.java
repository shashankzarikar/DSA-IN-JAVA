import java.util.*;

public class BST{
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static Node insertNode(Node root,int val){
        if(root==null) {
            root=new Node(val);
            return root;
        }
        if(val<root.data){
            root.left=insertNode(root.left,val);
            return root;
        }
        else{
            root.right=insertNode(root.right,val);
            return root;
        }
    }

    public static boolean searchNode(Node root,int val){  //TC=O(h) h=height of tree
        if(root==null) return false;
        if(root.data==val) return true;
        if(val<root.data) {
            return searchNode(root.left,val);
        }
        else{
            return searchNode(root.right,val);
        }
    }

    public static Node delete(Node root , int value){ //TC=O(h) h=height of tree

        if(root==null) return null;

        if(root.data<value) {
            root.right=delete(root.right,value);
            return root;
        }
        else if(root.data>value){
            root.left=delete(root.left,value);
            return root;
        }
        else{
            //case 1 :- leaf node 
            if(root.left==null && root.right==null) {
                return null;
            }

            //case 2 :- 1 child
            if(root.right==null){
                return root.left;
            }
            else if(root.left==null){
                return root.right;
            }

            //Case 3 :- 2 child 
            Node inordersuccessor=findinordersuccessor(root.right);
            root.data=inordersuccessor.data;
            root.right=delete(root.right,inordersuccessor.data);
        }
        return root;

    }

    public static Node findinordersuccessor(Node root){
            while(root.left!=null){
                root=root.left;
            }
            return root;
        }

    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void printInRange(Node root , int k1,int k2){
        if(root==null) return;

        if(root.data>=k1 && root.data<=k2){
            printInRange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printInRange(root.right,k1,k2);
        }
        else if(root.data < k1){
            printInRange(root.right,k1,k2);
        }
        else {
            printInRange(root.left,k1,k2);
        }
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("N");
        return;
    }

    public static void rootToLeaf(Node root , ArrayList<Integer> path){
        if(root==null) return;
        path.add(root.data);
        if(root.left==null && root.right==null){
            printPath(path);
        }
        rootToLeaf(root.left,path);
        rootToLeaf(root.right,path);
        path.remove(path.size()-1);

    }

    public static boolean isValidBST(Node root , Node min , Node max){
        if(root==null) return true;

        if(min!=null && root.data<=min.data){
            return false;
        }

        if(max!=null && root.data>=max.data){
            return false;
        }

        return isValidBST(root.left,min,root) && isValidBST(root.right,root,max); 
    }
    public static void main(String args[]){
        int values[]={5,1,3,4,2,7};
        Node root=null;

        for(int i=0;i<values.length;i++){
            root=insertNode(root,values[i]);
        }
        inorder(root);
        System.out.println();
        System.out.println(searchNode(root,5));

        //root=delete(root,9);
        //inorder(root);
       // printInRange(root,3,7);
       //ArrayList<Integer> path=new ArrayList<>();
       //rootToLeaf(root,path);

       if(isValidBST(root,null,null)){
         System.out.println("Valid");
       }
       else{
         System.out.println("Invalid");
       }
    }
}