public class Main {
    public static void main(String[] args) {
        int limit = 12;
        scan(0, limit);
    }

    public static void scan(int index, int limit) {
        if (index == limit) {
            return;
        }
        System.out.println(fib(index));
        scan(index + 1, limit);
    }

    public static int fib(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        return n * fib(n-1);
    }
}
