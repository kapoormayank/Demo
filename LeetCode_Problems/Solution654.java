// LeetCode Problem 654: Maximum Binary Tree

public class Solution654 {
    
    // Node class definition for the binary tree
    public static class TreeNode {
        
        // Data Members And Public Specificer
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int x) {
            this.val = x;
            this.left = null;
            this.right = null;
        }
    }

    // Class Solution
    public static class Solution {
        
        public int index = -1;
        
        // Build Tree
        public TreeNode buildTree(int[] nums) {
            index++;
            
            if(nums.length <= index || nums[index] == -1) {
                return null;
            }

            TreeNode root = new TreeNode(nums[index]);
            root.left = buildTree(nums);
            root.right = buildTree(nums);

            return root;
        }

        // Construct Maximum Binary Tree
        public TreeNode constructMaximumBinaryTree(int[] nums) {
            return construct(nums, 0, nums.length - 1);
        }

        // Helper function to construct the maximum binary tree
        private TreeNode construct(int[] nums, int start, int end) {
            if (start > end) {
                return null;
            }

            // Find the index of the maximum element in the current range
            int maxIndex = start;
            for (int i = start + 1; i <= end; i++) {
                if (nums[i] > nums[maxIndex]) {
                    maxIndex = i;
                }
            }

            // Create a new node with the maximum value
            TreeNode root = new TreeNode(nums[maxIndex]);

            // Recursively construct the left and right subtrees
            root.left = construct(nums, start, maxIndex - 1);
            root.right = construct(nums, maxIndex + 1, end);

            return root;
        }

        // Display Tree
        public void display(TreeNode root) {
            if(root == null) {
                return;
            }

            System.out.print(root.val + " ");
            display(root.left);
            display(root.right);
        }
    }

    // Main function
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 6, 0, 5};
        Solution solution = new Solution();
        TreeNode root = solution.buildTree(nums);
        System.out.print("Binary Tree (Preorder Traversal): ");
        solution.display(root);

        TreeNode root1 = solution.constructMaximumBinaryTree(nums);
        System.out.print("\nMaximum Binary Tree (Preorder Traversal): ");
        solution.display(root1);
    }
}
