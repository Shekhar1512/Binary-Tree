package javaPrograms;

public class BinaryTrees {

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
//	end of node structure
	
	public  static class BinaryTree{
		static int index = -1;
		public static Node buildTree(int nodes[]) {
			index++;
			if(nodes[index]==-1) {
				return null;
			}
			
			Node newnode = new Node(nodes[index]);
			newnode.left = buildTree(nodes);
			newnode.right = buildTree(nodes);
			
			return newnode;
			
		}
	}
//	end of binary tree building
	
	
	public static void main(String[] args) {
		
	 int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
	 
	 Node root = BinaryTree.buildTree(nodes);
	 System.out.println(root.data);
	 
	 

	}

}
