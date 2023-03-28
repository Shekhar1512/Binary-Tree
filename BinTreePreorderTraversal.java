package javaPrograms;

public class BinTreePreorderTraversal {

	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
//	class Node end
	
	public static class BinaryTree{
		static int index = -1;
		public static Node buildTree(int nodes[]) {
			index++;
			if(nodes[index]==-1) {
				return null;
			}
			
			Node newnode = new Node(nodes[index]);
			newnode.left=buildTree(nodes);
			newnode.right=buildTree(nodes);
			
		return newnode;
	    }//method buildTree end
	
		public static void preOrder(Node root) {
			
			if(root == null) {
//				System.out.print("-1"+"  ");  use this when you want to show null in node
				return;
			}
			System.out.print(root.data+"  ");
			preOrder(root.left);
			preOrder(root.right);
		}
		
	}
//		class BinaryTree end
	
	
	public static void main(String[] args) {
	
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		Node root = BinaryTree.buildTree(nodes);
		System.out.print("Binary tree PREORDER traversal is:- "+"  ");
		BinaryTree.preOrder(root);

	}
//	main end


}//class end