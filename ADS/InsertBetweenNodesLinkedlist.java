//creating linkedlist inserting node between two nodes
public class InsertBetweenNodesLinkedlist{
	static Node head;
	static class Node{
		int data;
		Node link;
		Node(int d){
			data=d;
			link=null;
		}
	}
		void display(){
		Node n=head;
		while(n != null){
			System.out.print(n.data+"-->");
			n=n.link;
		}
		}
	
	public void insertAfter(Node prev_node, int new_data){
		Node new_node=new Node(new_data);
		new_node.link=prev_node.link;
		prev_node.link=new_node;
	}

		
	public static void main(String[] args){
		InsertBetweenNodesLinkedlist l1=new InsertBetweenNodesLinkedlist();
		l1.head=new Node(11);
		Node second=new Node(22);
		Node third=new Node(33);
		l1.head.link=second;
		second.link=third;
		l1.display();
		l1.insertAfter(l1.head.link,15);
		System.out.println();
		l1.display();
	}
}