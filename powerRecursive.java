public class Main {
    public static void main(String[] args) {
        int result = power(2, 5);
        System.out.println("2^5 = " + result);
    }

    public static int power(int base, int exponent) {
        if (exponent == 0) return 1;             // Báziseset: bármi a nulladikon = 1
        return base * power(base, exponent - 1); // Rekurzív eset: base^n = base * base^(n-1)
    }
}