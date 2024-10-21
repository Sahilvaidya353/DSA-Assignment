package Assignment2;

public class SinglyLinkedListMain {
	  public static void main(String[] args) {
		  SinglyLinkedList_Asscending list = new SinglyLinkedList_Asscending();
	        
	        list.insert(30);
	        list.insert(10);
	        list.insert(50);
	        list.insert(20);
	        list.insert(40);

	        System.out.println("Original List");
	        list.display();

	        list.sort();

	        System.out.println("Sorted List");
	        list.display();
	    }
}
