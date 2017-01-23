package sumeet.leetCode.trees;

public class InorderSucessor {

		public static TreeNode getMin(TreeNode root){
			if(root == null){
				return null;
			}
			TreeNode current = root;
			while(current.left != null){
				current = current.left;
			}
			return current;
		}
		public static TreeNode inorderSuccessor(TreeNode root, TreeNode node){
			if(root == null){
				return null;
			}
			// if the right subtree exist find the min in the right 
			//subtree
			if(node.right != null){
				return getMin(node.right);
			}
			
			//else make root as the successor and traverse the tree
			TreeNode suc = null;
			while(root != null){
				if(node.val < root.val){
					suc = root;
					root = root.left;
				}
				else if(node.val > root.val){
					root = root.right;
				}
				else {
					break;
				}
			}
			return suc;
		}
		
		public static void main(String[] args){
			TreeNode head = new TreeNode(20);
			head.left = new TreeNode(8);
			head.right = new TreeNode(22);
			head.left.left = new TreeNode(4);
			head.left.right = new TreeNode(12);
			head.left.right.right = new TreeNode(14);
			head.left.right.left = new TreeNode(10);
			
			System.out.println(InorderSucessor.inorderSuccessor(head, head.left.right).val);
		}
}
