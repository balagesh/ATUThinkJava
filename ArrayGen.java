import java.util.Arrays;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		int numValues = 7;
		int [] array = genValues(numValues);
		System.out.print(Arrays.toString(array));
	}
	
	public static int[] genValues(int numValues) {
	    Random rand = new Random();
	    int a [] = new int[numValues];
	    for (int i = 0; i < numValues; i++) {
	        a [i] = rand.nextInt(100);
	    }
	    return a;
	}
}