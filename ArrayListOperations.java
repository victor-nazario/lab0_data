//This program runs for n times and asks the user to select one of three options
//1. to add an int to an array list
//2. to remove all instances of an int in an array list 
//3. to return the array list size 

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOperations {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in); // A scanner to ask the user how many iterations
		int howManyTimes = scanner.nextInt();

		ArrayListOpperations(howManyTimes);
	}

	public static void ArrayListOpperations(int n) {

		ArrayList<Integer> theArrayList = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			int optionSelected = scanner.nextInt();

			if (optionSelected == 3) {
				System.out.println(theArrayList.size());
			}

			else if (optionSelected == 2) {
				int theNumber = scanner.nextInt();
				while (theArrayList.contains(theNumber)) {
					theArrayList.remove(Integer.valueOf(theNumber));
				}
			}

			else if (optionSelected == 1) {
				int theNumber = scanner.nextInt();
				theArrayList.add(theNumber);
			}

		}

	}
}
