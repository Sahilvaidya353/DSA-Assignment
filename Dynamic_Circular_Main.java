package Assignment2;

public class Dynamic_Circular_Main {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.initialize();

        cq.insert(10);
        cq.insert(20);
        cq.insert(30);
        cq.display(); 
        System.out.println("Deleted " + cq.delete()); 
        cq.display(); 

        cq.insert(40);
        cq.insert(50);
        cq.insert(60); 
        cq.display(); 
    }
}
