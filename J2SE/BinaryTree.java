import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    Node createTree(Scanner sc) {
        System.out.print("Enter node value (-1 for no node): ");
        int value = sc.nextInt();

        if (value == -1) {
            return null;
        }

        Node newNode = new Node(value);
        System.out.println("Enter left child of " + value);
        newNode.left = createTree(sc);
        System.out.println("Enter right child of " + value);
        newNode.right = createTree(sc);

        return newNode;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        System.out.println("Create your binary tree:");
        tree.root = tree.createTree(sc);

        System.out.println("Binary tree created successfully!");
        sc.close();
    }
}
