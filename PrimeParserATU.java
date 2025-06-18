/* This was originally created for Eclipse, and the input is added manually.
I set up the random integer generator, + the code was modified as follows:

public class PrimeParser {
    public int[] process(String[] ags) {
        int[] primes = new int[ags.length];
       
        for (int i = 0; i < ags.length; i++) {
            int number = Integer.parseInt(ags[i]);  */


import java.util.Random;

public class PrimeParser {
    public int[] process(int[] ags) {
        int[] primes = new int[ags.length];
       
        for (int i = 0; i < ags.length; i++) {
            int number = ags[i];
       
        if (isPrime(number)) {
            primes[i] = number;
        }    
        }
        return primes;
    }
   
    private boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

/* Using a non-static method like `process()` allows for better object-oriented design, making the code more flexible, testable, and easier to extend in the future by operating on specific instances rather than being tied to the class itself.*/

    public static void main(String[] args) {
        Random rand = new Random();
        int nr = rand.nextInt(100);
        int[] array = new int[nr];
        for (int i = 0; i < nr; i++) {
            array[i] = rand.nextInt(100);
        }

        PrimeParser pp = new PrimeParser();
        int[] nums = pp.process(array);
       
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                System.out.println(nums[i]);
            }
        }
    }
}