public class BinaryTreeDiameterApproach2 {
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
    public static class nodeInfo{
       int height;
       int diameter;
       nodeInfo(int height,int diameter){
        this.height=height;
        this.diameter=diameter;
       }
   }
   public static nodeInfo diameter(TreeNode root){
      if(root==null) return new nodeInfo(0,0);
        nodeInfo leftinfo =diameter(root.left);
        nodeInfo rightinfo=diameter(root.right);
        int currDiameter=Math.max(leftinfo.height+rightinfo.height,Math.max(leftinfo.diameter,rightinfo.diameter));
        
        int currHeight=Math.max(leftinfo.height,rightinfo.height)+1;

        return new nodeInfo(currHeight,currDiameter);
    }
    public static void main(String args[]){
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Diameter of Binary Tree is "+diameter(root).diameter);
    }

}
