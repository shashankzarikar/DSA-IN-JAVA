public class CountingBSTsRecursion {
    public static int countingtrees(int n) {
        
        // An empty tree or a tree with one node has exactly one possible BST.
        if (n == 0 || n == 1)
            return 1;

        // Consider each node i as the root.
        // Left subtree has (i-1) nodes, and right subtree has (n-i) nodes.
        // Multiply the number of possible left and right subtrees to get
        // the total BSTs for the current root.
        // Add the results for all possible roots to get the total BSTs.
        int trees = 0;
        for (int i = 1; i <= n; i++) {
            trees += countingtrees(i - 1) * countingtrees(n - i);
        }

        return trees;
    }

    public static void main(String args[]) {
        System.out.println(countingtrees(3));
    }

}
