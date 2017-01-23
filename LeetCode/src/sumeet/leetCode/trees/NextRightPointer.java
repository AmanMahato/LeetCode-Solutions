package sumeet.leetCode.trees;


class NodeRight{
	NodeRight left, right, next;
	int val;
	public NodeRight(int val){
		this.val = val;
		left = right = null ;
	}
}
public class NextRightPointer {

	public static void  generateNextpointer(NodeRight root){
		if(root == null){
			return;
		}
		NodeRight levelStart = root;
		while(levelStart != null){
			NodeRight  cur = root;
			while(cur != null){
				if(cur.left != null){
					cur.left.next = cur.right;
				}
				System.out.println(cur.next.left.val);
				if(cur.right != null && cur.next != null){
					cur.right.next = cur.next.left;
					
				}
				cur = cur.next;
			}
			levelStart = levelStart.left;
		}
	}
	public static void main(String[] args){
		NodeRight root = new NodeRight(1);
		root.left = new NodeRight(2);
		root.right = new NodeRight(3);
		root.left.left = new NodeRight(4);
		root.left.right = new NodeRight(5);
		root.right.right = new NodeRight(7);
		root.right.left = new NodeRight(6);
		
		NextRightPointer.generateNextpointer(root);
	}
}
