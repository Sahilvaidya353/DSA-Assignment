package Assignment1;

import java.util.Scanner;

public class DoublyLinkedListMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

		while (true) {
			System.out.println("\nMenu");
			System.out.println("1. Insert Node");
			System.out.println("2. Display Odd Values");
			System.out.println("3. Exit");
			System.out.print("Enter your choice");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter a value to insert");
				int data = scanner.nextInt();
				doublyLinkedList.insert(data);
				System.out.println("Value inserted.");
				break;

			case 2:
				doublyLinkedList.displayOddValues();
				break;

			case 3:
				System.out.println("Exiting");

				return;

			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
