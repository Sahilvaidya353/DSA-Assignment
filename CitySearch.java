package Assignment1;

import java.util.Scanner;

public class CitySearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of cities ");
		int n = scanner.nextInt();
		scanner.nextLine();

		String[] cities = new String[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter city name " + (i + 1) + ": ");
			cities[i] = scanner.nextLine();
		}

		System.out.print("Enter the city name to search ");
		String cityToSearch = scanner.nextLine();

		boolean found = linearSearch(cities, cityToSearch);

		if (found) {
			System.out.println(cityToSearch + " is present in the list.");
		} else {
			System.out.println(cityToSearch + " is not present in the list.");
		}

		scanner.close();
	}

	public static boolean linearSearch(String[] cities, String cityToSearch) {
		for (String city : cities) {
			if (city.equalsIgnoreCase(cityToSearch)) {
				return true;
			}
		}
		return false;
	}
}
