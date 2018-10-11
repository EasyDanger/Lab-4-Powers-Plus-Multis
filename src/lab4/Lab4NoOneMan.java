package lab4;

import java.util.Scanner;

public class Lab4NoOneMan {

	public static void main(String[] args) {

		// User inputs are declared here so that they can be read inside and outside of
		// the loops.
		String userInput;
		int userInt;

		// The scanner is definitely closed. I can't figure out why Eclipse keeps saying
		// it's not.
		Scanner read = new Scanner(System.in);

		System.out.println(
				"Let's learn our squares and cubes! \n \nA square is a number multiplied by itself, like 4 * 4 (4^2). A cube is a number multiplied by itself twice, like 3 * 3 * 3. (3^3)");
		// I'm making more use of the "\n" new line breaks for clarity/aesthetics in the
		// console, especially as this lab is largely about formatting.

		do {// This loop allows us to restart if the user chooses.
			System.out.println(
					// I appreciate that the prompt for this lab specifically allows for us to
					// assume the user will include valid input.
					"\nPlease enter an integer and we'll make a table of squares and cubes! We thank you for not trying to break our program.");

			userInt = read.nextInt(); // Accepts the user's integer.

			// I started the main part of the program here. Since an integer can accept a
			// max of 10 digits, it made sense to allow for 12 spaces in the table. (10
			// spaces for the digits, and 2 to separate the different parts of the table).
			// It therefore made sense to simply hard code the header of the table. this
			// also helped me to visualize what the table would look like when complete.
			System.out.println("Number      Squared     Cubed");
			System.out.println("======      =======     =====");

			// The for loop with the userInt variable will iterate until i reaches the same
			// value, producing the table of powers to that point. I'm trying to follow the
			// style guidelines mentioned in class of not using "<=" but it feels like that
			// would be most appropriate in this case.
			for (int i = 1; i < (userInt + 1); i++) {

				int square = i * i; // The value for our squares.
				int cube = i * i * i; // The value for our cubes.

				// I copied the examples of the printf method from the Colorado State site
				// documentation on it and played with them until I understood enough to format
				// these the way I wanted them to be. I'm still not sure why putting the same
				// thing ("%-12d") for the first two variables results in them being in two
				// different places on the table, but they are the right places.
				System.out.printf("%-12d", i);
				System.out.printf("%-12d", square);
				System.out.printf("%-24d  \n", cube);
			}

			// Allows user to repeat the process, or complete the program.
			System.out.println("Would you like to continue?(y/n)");
			userInput = read.next();

		} while (userInput.equals("y")); // Returns to top or quits based on input.

		System.out.println("That's probably just as well. After all, no one man should have all that power.");

		// From here on is the bonus challenge of creating the multiplication table.
		System.out.println(
				"\n \n \nAlright, alright, alright, for a bonus, here's a multiplication table for that number you put in, too.");

		// This aligns the top row of numbers with the proper place on the table,
		// leaving a gap before the "1." The same spacing is used here as above to
		// account for the maximum number of digits.
		System.out.printf("%-12s", " ");

		for (int j = 1; j < (userInt + 1); j++) {
			// This will provide the x-axis, essentially, just a number line.
			System.out.printf("%-12d", j);
		}

		// Starts the table in the correct place.
		System.out.println("\n");

		// This for loop will reiterate the inner loop for as many times as the
		// originally entered integer was. This creates the "y-axis" of this chart.
		for (int j = 1; j < (userInt + 1); j++) {
			// Like the previous "j" printout, this is simply a number line, only along the
			// y-axis.
			System.out.printf("%-12d", j);

			// This for loop is similar to the one used above to make the table of powers.
			for (int i = 1; i < (userInt + 1); i++) {
				// As i increases and the loop iterates, essentially, the entire line is
				// multiplied by the higher j value on the next iteration. The inner
				// "i"-for-loop iterates and creates the x axis, while the outer "j"-for-loop
				// repeats that, creating the y axis. I feel like I'm over explaining this,
				// sorry.
				System.out.printf("%-12d", i * j);
			}

			// This new line makes sure that we actually end up with a grid and not a line!
			System.out.println("\n");
		}
		read.close();
		// See! My scanner is closed. But there's still a notification about a resource
		// leak up at the Scanner declaration.
	}
}
