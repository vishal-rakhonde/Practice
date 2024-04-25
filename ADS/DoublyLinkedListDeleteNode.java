class DoublyLinkedListDeleteNode {
    Node head;

    static class Node {
        int data;
        Node next, prev;

        Node(int d) {
            data = d;
            next = null;
            prev = null;
        }
    }

    void deleteNode(Node del) {
        if (head == null || del == null)
            return;

        if (head == del)
            head = del.next;

        if (del.next != null)
            del.next.prev = del.prev;
        if (del.prev != null)
            del.prev.next = del.next;

        del = null;
    }

    void display() {
        Node last = null;
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "---> ");
            last = current;
            current = current.next;
        }
    }

    public static void main(String args[]) {
        DoublyLinkedListDeleteNode list = new DoublyLinkedListDeleteNode();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.prev = list.head;
        list.head.next.next = new Node(30);
        list.head.next.next.prev = list.head.next;
        list.head.next.next.next = new Node(40);
        list.head.next.next.next.prev = list.head.next.next;
        list.head.next.next.next.next = new Node(50);
        list.head.next.next.next.next.prev = list.head.next.next.next;
        list.head.next.next.next.next.next = new Node(60);
        list.head.next.next.next.next.next.prev = list.head.next.next.next.next;

        System.out.println("List before deletion:");
        list.display();
        System.out.println();

        System.out.println("Deleting node with data value 30...");
        Node nodeToDelete = list.head.next.next;
        list.deleteNode(nodeToDelete);

        System.out.println("List after deletion:");
        list.display();
    }
}
