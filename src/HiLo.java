import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String playAgain = "";
		do {
		// Create a random number for the user to guess
				int theNumber = (int)(Math.random() * 100 + 1);
		//System.out.println( theNumber );
		int guess = 0;
		int numberOfTries = 0;
		System.out.println("I challenge thee! Pick a number, not between 1 and 3. But much higher, and rounded. Guess up to 100, from 1 being grounded. Now choose that digit, before you miss it. (1-100) A perfect score is 7 tries or less:");
		while (guess != theNumber) {
			numberOfTries = numberOfTries + 1;
			guess = scan.nextInt();
			if (guess < theNumber)
				System.out.println(guess + " is too low. Punk ass bitch.");
			else if (guess > theNumber)
				System.out.println(guess + " is too high. How low can you go?");
			else
				System.out.println("Holy sheeit! " + guess + " is the right fuckin answer! Johnny, tell em what they've won! It only took you " +numberOfTries+ " mutha-fuckin tries.");
		} //End of while loop for guessing
			System.out.println("Will your punk ass make another attempt? (y/n)");
			playAgain = scan.next();
		} while (playAgain.equalsIgnoreCase("y"));
		System.out.println("I never took you for a quitter.");
		scan.close();
	}
}
