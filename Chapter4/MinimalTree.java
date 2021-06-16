// Given a sorted array with unique integer elements, write an algorithm to create a binary search tree with minimal height
import TreeUtils.BuildTree;
import TreeUtils.TreeNode;

public class MinimalTree {
    public static void main (String [] args) {
        int [] data = {1, 2, 3, 10, -2, 1};
        TreeNode root = sortedArrayToBST(data);
        BuildTree buildTree = new BuildTree();
        buildTree.inorderTraversal(root);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        
        return buildTree (nums, 0, nums.length - 1);
    }
    
    private static TreeNode buildTree (int [] nums, int low, int high) {
        if (low > high) {
            return null;
        }
        
        int mid = (low + high) / 2;
        TreeNode node = new TreeNode (nums [mid], null, null);
        node.left = buildTree (nums, low, mid - 1);
        node.right = buildTree (nums, mid + 1, high);
        return node;
    }
}
