//creating linkedlist
public class LinkedList{
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
		
	public static void main(String[] args){
		LinkedList l=new LinkedList();
		l.head=new Node(11);
		Node second=new Node(22);
		Node third=new Node(33);
		l.head.link=second;
		second.link=third;
		
		l.display();
	}
}