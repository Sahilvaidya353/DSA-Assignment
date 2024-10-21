package Assignment1;

public class Singly_Linked_List {
    Node root;

    public void createLinkedList(int[] dataList) {
        for (int data : dataList) {
            insertRight(data);
        }
    }

    public void display() {
        if (root == null) {
            System.out.println("Linked List is empty.");
            return;
        }
        Node t = root;
        while (t != null) {
            System.out.print(t.data + " -> ");
            t = t.next;
        }
        System.out.println("null");
    }

    public void search(int key) {
        Node t = root;
        int index = 0;
        while (t != null) {
            if (t.data == key) {
                System.out.println("Node with value " + key + " found at index " + index + ".");
                return;
            }
            t = t.next;
            index++;
        }
        System.out.println("Node with value " + key + " not found.");
    }

    public void insertRight(int data) {
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
    }
}
