import java.util.ArrayList;

public class LastCommonAncestor{
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

    public static boolean getPath(Node root,int node , ArrayList<Integer> path){
        if(root==null){
            return false;
        }
        path.add(root.data);
        if(root.data==node){
            return true;
        }
        if(getPath(root.left,node,path)){
            return true;
        }
        if(getPath(root.right,node,path)){
            return true;
        }
        path.remove(path.size()-1);
        return false;

    }

    public static int lca1(Node root ,int node1 , int node2){
         ArrayList<Integer> path1=new ArrayList<>();
        ArrayList<Integer> path2=new ArrayList<>();

        if(!getPath(root,node1,path1) ||!getPath(root,node2,path2)){
            System.out.println("Node not found");
            return -1;
        } 
        int lastCommon = -1;
        for(int i=0;i<path1.size() && i<path2.size();i++){
            if(path1.get(i)==path2.get(i)){
                lastCommon=path1.get(i);
            }else{
                break;
            }
        }
        return lastCommon;
    }

    public static Node lca2(Node root , int node1, int node2){
        
        if(root==null|| root.data==node1 || root.data==node2){
            return root;
        }

        Node leftLca=lca2(root.left,node1,node2);
        Node rightLca=lca2(root.right,node1,node2);

        if(leftLca==null){
            return rightLca;
        }

        if(rightLca==null){
            return leftLca;
        }

        return root;
    }

    public static void main(String args[]){

        /*
            1
          /   \
         2     3
        / \   / \
       4   5 6   7
       */
         Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
       System.out.println(lca2(root,4,5).data);
        
    }
}