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
		    guess = Integer.parseInt(sc.nextLine());
		    if (guess > target) {
		    System.out.println("Too high!");}
		    else if (guess != target) {
		        System.out.println("Too low!");
		    }
		}  
	}
}