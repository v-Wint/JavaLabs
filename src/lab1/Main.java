package lab1;

public class Main {
    public static void main(String[] args) {
        /*
        1222
        O1: +
        C:  1
        O2: %
        index type = char

        sum i in {a, n} (sum j in {b, m} ((i % j) / (i + C)))
         */

        final int C = 1;

        char a = 0;
        char n = 7;
        char b = 2;
        char m = 5;

        // if b == 0, j == 0, i % j div by zero
        if (b == 0) {
            System.out.println("Division by zero");
            return;
        }

        double sum = 0;

        for (char i = a; i <= n; i++) {
            for (char j = b; j <= m; j++) {
                sum += (double) i % j / (i + C);
            }
        }

        System.out.printf("Result: %.4f", sum);
    }
}
