//Doubly Linked List Insertion in java

class DoublyLinkedListInsertion{
	Node head;
	static class Node{
		int data;
		Node next,prev;
		Node(int d){
			data = d;
			next = null;
			prev = null;
		}
	}
	
	void insert(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		new_node.prev = null;
		if(head != null)
			head.prev = new_node;
		head = new_node;
	}
	
	void display(Node n){
		Node p = null;
		System.out.println("Forward direction:");
		while(n != null)
		{
			System.out.print(n.data+"---> ");
			p=n;
			n=n.next;
		}
		System.out.println("------------------------------");
		System.out.println();
		System.out.println("Backward direction:");
		while(p != null){
			System.out.print(p.data+"---> ");
			p=p.prev;
		}
	}
	
	public static void main(String args[]){
		DoublyLinkedListInsertion d = new DoublyLinkedListInsertion();
		d.display(d.head);
		System.out.println("------------------------------**");
		d.insert(10);
		d.display(d.head);
		System.out.println();
		d.insert(5);
		d.display(d.head);	
	}	
}