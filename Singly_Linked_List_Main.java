package Assignment1;

import java.util.Scanner;

public class Singly_Linked_List_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Singly_Linked_List obj = new Singly_Linked_List();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create Linked List");
            System.out.println("2. Display Linked List");
            System.out.println("3. Search Node in Linked List");
            System.out.println("4. Insert at Last Position");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter elements separated by space ");
                    int[] dataList = new int[100];
                    int count = 0;
                    while (true) {
                        int data = scanner.nextInt();
                        if (data == -1) break;
                        dataList[count++] = data;
                    }
                    int[] finalDataList = new int[count];
                    System.arraycopy(dataList, 0, finalDataList, 0, count);
                    obj.createLinkedList(finalDataList);
                    System.out.println("Linked List created.");
                    break;

                case 2:
                    obj.display();
                    break;

                case 3:
                    System.out.print("Enter the value to search: ");
                    int key = scanner.nextInt();
                    obj.search(key); 
                    break;

                case 4:
                    System.out.print("Enter the value to insert at last");
                    int data = scanner.nextInt();
                    obj.insertRight(data);
                    System.out.println("Value inserted at last position");
                    break;

                case 5:
                    System.out.println("Exiting.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again");
            }
        }
    }
}
