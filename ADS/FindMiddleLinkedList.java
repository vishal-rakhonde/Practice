class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class FindMiddleLinkedList {
    Node head;

    // Insert a node at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Find the middle of the linked list
    public Node findMiddle() {
        if (head == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;       // Move slow one step
            fast = fast.next.next;  // Move fast two steps
        }

        return slow; // Slow will be at the middle
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        FindMiddleLinkedList list = new FindMiddleLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50); // Odd length case

        System.out.println("Linked List:");
        list.display();

        Node middle = list.findMiddle();
        if (middle != null) {
            System.out.println("Middle Node: " + middle.data);
        } else {
            System.out.println("The list is empty.");
        }
    }
}
