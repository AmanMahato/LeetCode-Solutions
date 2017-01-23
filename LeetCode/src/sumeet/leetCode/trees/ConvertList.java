package sumeet.leetCode.trees;

class LinkedList{
	LinkedList node;
	int val;
	LinkedList next;
	public LinkedList(int val){
		this.val = val;
		next = null;
	}
}

class TreeNode{
	TreeNode node;
	TreeNode left = null;
	TreeNode right = null;
	int val;
	public TreeNode(int val){
		this.val = val;
	}
}

public class ConvertList {
	public static TreeNode sortedListToBST(LinkedList list){
		if(list == null){
			return null;
		}
		int size = 0;
		LinkedList node = list;
		while(node!=null){
			node = node.next;
			size++;
		}
		return listToBST(list, 0 , size-1);
	}
	public static TreeNode listToBST(LinkedList list , int low, int high){
		if(low>high){
			return null;
		}
		int mid = (low + high)/2;
		TreeNode leftChild = listToBST(list, low, mid-1);
		TreeNode parent = new TreeNode(list.val);
		parent.left = leftChild;
		list = list.next;
		parent.right = listToBST(list, mid+1, high);
		return parent;
	}
	
	public static void printTree(TreeNode root){
		if(root == null){
			return;
		}
		TreeNode p = root;
		printTree(root.left);
		System.out.print(p.val + " ");
		printTree(p.right);
	}
	
	public static void main(String[] args){
		LinkedList list = new LinkedList(3);
		list.next = new LinkedList(5);
		list.next.next = new LinkedList(7);
		list.next.next.next = new LinkedList(9);
		list.next.next.next.next = new LinkedList(11);
		list.next.next.next.next.next = new LinkedList(12);
		TreeNode root = ConvertList.sortedListToBST(list);
		
		ConvertList.printTree(root);
		
	}
}
