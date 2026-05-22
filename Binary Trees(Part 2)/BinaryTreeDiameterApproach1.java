 //Approach 1:- TC=O(n^2)
class BinaryTreeDiameterApproach1 {
    
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }
    public static int height(TreeNode root){
        if(root==null) return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
   
    public static int diameterOfBinaryTree(TreeNode root) {

        if(root==null) return 0;
        int leftDiameter=diameterOfBinaryTree(root.left);
        int leftheight=height(root.left);
        int rightDiameter=diameterOfBinaryTree(root.right);
        int rightheight=height(root.right);
        int selfDiameter=leftheight+rightheight;
        return Math.max(selfDiameter,Math.max(leftDiameter,rightDiameter));

    }
    public static void main(String args[]){

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println("Diameter of Binary Tree is "+diameterOfBinaryTree(root));
    }

}