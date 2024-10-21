package Assignment2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeaparateNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers ");
        int n = scanner.nextInt();

        List<Integer> positiveList = new ArrayList<>();
        List<Integer> negativeList = new ArrayList<>();

        System.out.println("Enter " + n + " integers");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (number >= 0) {
                positiveList.add(number); 
            } else {
                negativeList.add(number); 
            }
        }

        System.out.println("Positive Numbers " + positiveList);

        System.out.println("Negative Numbers " + negativeList);

      
    }
}
