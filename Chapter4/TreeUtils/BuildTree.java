package TreeUtils;

public class BuildTree {
    public TreeNode buildTree (int data, TreeNode root) {
        if (root == null) {
            TreeNode newNode = new TreeNode (data, null, null);
            return newNode;
        }

        else {
            if (root.data <= data) {
                root.right = buildTree(data, root.right); 
            }

            else {
                root.left = buildTree(data, root.left);
            }
        }

        return root;
    }

    public void preorderTraversal (TreeNode root) {
        if (root != null) {
            System.out.print (root.data + "\n");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    public void inorderTraversal (TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print (root.data + "\n");
            inorderTraversal(root.right);
        }
    }
}
