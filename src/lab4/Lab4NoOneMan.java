package lab4;

import java.util.Scanner;

public class Lab4NoOneMan {

	public static void main(String[] args) {

		String userInput = null;
		int userInt;
		Scanner read = new Scanner(System.in);
		System.out.println(
				"Let's learn our squares and cubes! \n \nA square is a number multiplied by by itself, like 4 * 4. A Cube is a number multiplied by itself twice, like 3 * 3 * 3.");
		do {
			System.out.println(
					"\nPlease enter an integer and we'll make a table of squares and cubes! We thank you for not trying to break our program.");

			userInt = read.nextInt();

			System.out.println("Number      Squared     Cubed");
			System.out.println("======      =======     =====");

			for (int i = 1; i < (userInt + 1); i++) {
				int square = i * i;
				int cube = i * i * i;

				System.out.printf("%-12d", i);
				System.out.printf("%-12d", square);
				System.out.printf("%-24d  \n", cube);

			}
			System.out.println("Would you like to continue?(y/n)");

			userInput = read.next();

		} while (userInput.equals("y"));

		System.out.println("Okay, thanks for playing.");

		System.out.println("Alright, for bonus, here's some multiplication tables, too.");
		System.out.printf("%-12s", " ");
		for (int j = 1; j < (userInt + 1); j++) {
			System.out.printf("%-12d", j);
		}
		System.out.println("\n");

		for (int j = 1; j < (userInt + 1); j++) {
			System.out.printf("%-12d", j);
			for (int i = 1; i < (userInt + 1); i++) {

				System.out.printf("%-12d", i * j);
			}
			System.out.println("\n");
		}
	}
}
