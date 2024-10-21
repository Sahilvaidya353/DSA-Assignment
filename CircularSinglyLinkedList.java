package Assignment2;

public class CircularSinglyLinkedList {

	    private Node root = null; 

	    public void insert(int data) {
	        Node n = new Node(data);
	        if (root == null) {
	            root = n;
	            root.next = root;
	        } else {
	            Node t = root;
	            while (t.next != root) {
	                t = t.next; 
	            }
	            t.next = n; 
	            n.next = root; 
	        }
	    }
	    
	    public void display() {
	        if (root == null) {
	            System.out.println("The list is empty.");
	            return;
	        }

	        Node t = root;
	        do {
	            System.out.print(t.data + " ");
	            t = t.next;
	        } while (t != root); 
	        System.out.println();
	    }
	
	    public static void main(String[] args) {
	        CircularSinglyLinkedList list = new CircularSinglyLinkedList();
	        
	      
	        list.insert(10);
	        list.insert(20);
	        list.insert(30);
	        list.insert(40);

	       
	        System.out.println("Circular Singly Linked List:");
	        list.display();
	    }
}
