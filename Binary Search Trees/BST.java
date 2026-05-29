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
    public static void main(String args[]){
        int values[]={5,1,3,4,2,7};
        Node root=null;

        for(int i=0;i<values.length;i++){
            root=insertNode(root,values[i]);
        }
        inorder(root);
        System.out.println();
        System.out.println(searchNode(root,5));

        root=delete(root,9);
        inorder(root);
    }
}