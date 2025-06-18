//restart
import java.util.Random;
import java.util.Scanner;

public class GuesserGame {
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       letsPlay(sc);
	       System.out.println("Thanks for playing with me!");
	       sc.close();
	}
	
	public static void letsPlay(Scanner sc) {
		int target = rand();
		System.out.println("Let's play! It's time to guess.\nA number between 0 and 100.");
		scan(sc, target);
		System.out.println("Congrats!");
		nextRound(sc);			    
	}
	
	public static void nextRound(Scanner sc) {
	       System.out.println("One more? (yes/no)");
	       String answer = sc.nextLine();
	       if (answer.equalsIgnoreCase("yes")) {
	           letsPlay(sc);
        }
    }
	
	public static int rand() {
	    Random rand = new Random();
		int target = rand.nextInt(101);
		return target;
	}
	
	public static void scan(Scanner sc, int target) {
		int guess = -77;
		while (guess != target) {
		    guess = scanVerify(sc);
		    if (guess > target) {
		    System.out.println("Too high!");}
		    else if (guess != target) {
		        System.out.println("Too low!");
		    }
		}  
	}
	
public static int scanVerify(Scanner sc) {
    while (true) {
       // System.out.println("Your guess: ");
        String input = sc.nextLine();
        try {
            int guess = Integer.parseInt(input);
            if (guess < 0 || guess > 100) {
                System.out.println("Please enter a number\nbetween 0 and 100.");
            } else {
                return guess;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input!\nPlease enter a valid number.");
        }
    }
}
}