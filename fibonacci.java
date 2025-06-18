public class Main {
    public static void main(String[] args) {
        int count = 8;
        scan(0, count);
    }

    public static void scan(int index, int limit) {
        if (index == limit) {
            return;
        }
        System.out.print(fib(index) + " ");
        scan(index + 1, limit);
    }

    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }
}
