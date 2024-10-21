package Assignment2;

public class SinglyLinkedListOddEven {

	    private Node root;

	    public void insert(int data) {
	        Node n = new Node(data);
	        if (root == null) {
	            root = n;
	        } else {
	            Node t = root;
	            while (t.next != null) {
	                t = t.next;
	            }
	            t.next = n;
	        }
	    }

	    
	    public void countElements() {
	        Node t = root;
	        int nonZeroCount = 0;
	        int oddCount = 0;
	        int evenCount = 0;

	        while (t != null) {
	            if (t.data != 0) {
	                nonZeroCount++; 
	            }
	            if (t.data % 2 == 0) {
	                evenCount++; 
	            } else {
	                oddCount++; 
	            }
	            t = t.next;
	        }

	        
	        System.out.println("Count of Non-Zero Elements: " + nonZeroCount);
	        System.out.println("Count of Odd Numbers: " + oddCount);
	        System.out.println("Count of Even Numbers: " + evenCount);
	    }
	
	    public static void main(String[] args) {
	        SinglyLinkedListOddEven list = new SinglyLinkedListOddEven();
	        
	  
	        list.insert(10);
	        list.insert(15);
	        list.insert(0);
	        list.insert(-3);
	        list.insert(8);
	        list.insert(7);

	
	        System.out.println("Counting elements in the linked list");
	        list.countElements();
	    }
	}


