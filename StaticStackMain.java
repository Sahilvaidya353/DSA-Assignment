package Assignment1;

import java.util.Scanner;

public class StaticStackMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string");
		String input = scanner.nextLine();

		String[] words = input.split(" ");
		StringBuilder result = new StringBuilder();

		for (String word : words) {

			StaticStack stack = new StaticStack(word.length());

			for (char c : word.toCharArray()) {
				stack.push(c);
			}

			while (!stack.isEmpty()) {
				result.append(stack.pop());
			}

			result.append(" ");
		}

		String output = result.toString().trim();
		System.out.println("Output " + output);

		scanner.close();
	}

}
