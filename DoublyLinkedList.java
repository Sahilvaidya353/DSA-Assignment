package Assignment1;

public class DoublyLinkedList {
	Node root;

    public void insert(int data) {
        Node n = new Node(data);
        if (root == null) {
            root = n;
            return;
        }
        Node t = root;
        while (t.next != null) {
            t = t.next;
        }
        t.next = n;
        n.prev = t;
    }

    public void displayOddValues() {
        Node t = root;
        if (t == null) {
            System.out.println("Doubly Linked List is empty");
            return;
        }
        System.out.print("Odd values in the list");
        while (t != null) {
            if (t.data % 2 != 0) {
                System.out.print(t.data + " ");
            }
            t = t.next;
        }
        System.out.println();
    }
}
