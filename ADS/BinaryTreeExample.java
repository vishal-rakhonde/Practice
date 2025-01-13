class Node {
	int value;
	Node left;
	Node right;
	
	Node(int value){
		this.value=value;
		this.left=null;
		this.right=null;
	}
}
public class BinaryTreeExample {
	Node root;
	public BinaryTreeExample(){
		root=null;
	}
	public static void main(String[] args){
		BinaryTreeExample tree=new BinaryTreeExample();
		tree.root=new Node(5);
		tree.root.left=new Node(6);
		tree.root.right=new Node(7);
		System.out.println("Binary tree created");
	}
}