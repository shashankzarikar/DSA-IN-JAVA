public class MinDisBetweenTwoNodes {
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

    public static Node lca(Node root , int node1,int node2){
        if(root==null || root.data==node1 || root.data==node2){
            return root;
        }
        Node leftLca=lca(root.left,node1,node2);
        Node rightLca=lca(root.right,node1,node2);

        if(leftLca==null) return rightLca;
        if(rightLca==null) return leftLca;

        return root;
    }

    public static int distance(Node root,int node){
        if(root==null) return -1;
        if(root.data==node) return 0;
        int d1=distance(root.left,node);
        if(d1!=-1) return d1+1;
        int d2=distance(root.right,node);
        if(d2!=-1) return d2+1;

        return -1;

    }

    public static int minDistance(Node root , int node1,int node2){
        //Find Last Common Ancestor of thse two node 
        Node lca=lca(root,node1,node2);

        //Find Distance of node1 and node2 from Lca
        int dis1=distance(lca,node1);
        int dis2=distance(lca,node2);

        return dis1+dis2;

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
        
       System.out.println(minDistance(root,4,5));;
        
    }
    
}
