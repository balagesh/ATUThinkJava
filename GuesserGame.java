//towards single responsability
import java.util.Random;
import java.util.Scanner;

public class GuesserGame {
	public static void main(String[] args) {
		int target = rand();
		System.out.println("Let's play! It's time to guess.\nA number between 0 and 100.");
		scan(target);
		System.out.println("Congrats!");		
	}
	
	public static int rand() {
	    Random rand = new Random();
		int target = rand.nextInt(101);
		return target;
	}
	
	public static void scan(int target) {
		Scanner sc = new Scanner(System.in);
		int guess = sc.nextInt();
		while (guess != target) {
		    if (guess > target) {
		    System.out.println("Too high!");}
		    else if (guess != target) {
		        System.out.println("Too low!");
		    }
		guess = sc.nextInt();
		}
		sc.close();		    
	}
}