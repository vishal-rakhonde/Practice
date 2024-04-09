//creating linkedlist inserting node at end
public class InsertAtEndOfLinkedlist{
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
	public void append(int new_data){
		Node new_node=new Node(new_data);
		if(head==null){
			head=new Node(new_data);
			return;
		}
		new_node.link=null;
		Node last=head;
		while(last.link != null)
			last=last.link;
			last.link=new_node;
			return;
	}
		

		
	public static void main(String[] args){
		InsertAtEndOfLinkedlist l1=new InsertAtEndOfLinkedlist();
		l1.head=new Node(11);
		Node second=new Node(22);
		Node third=new Node(33);
		l1.head.link=second;
		second.link=third;
		l1.display();
		l1.append(44);
		System.out.println();
		l1.display();
	}
}