//deletion at begining of linkedlist
public class DeletionAtBeginingOfLinkedlist{
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
	public void deleteNode(int key){
		Node temp=head,prev=null;
		//we will use some additional referances
		if(temp != null && temp.data==key){
			head=temp.link;
			return;
		}
	}
		
	public static void main(String[] args){
		DeletionAtBeginingOfLinkedlist d=new DeletionAtBeginingOfLinkedlist();
		d.head=new Node(11);
		Node second=new Node(22);
		Node third=new Node(33);
		d.head.link=second;
		second.link=third;
		d.display();
		d.deleteNode(11);
		System.out.println();
		d.display();
	}
}