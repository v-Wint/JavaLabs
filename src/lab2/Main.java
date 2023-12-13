package lab2;

import java.util.Random;

public class Main {
    /**
     * Generate matrices A and B, output them, create matrix C = A + B, output it,
     * calculate the sum of the smallest numbers in rows of C, output it
     * @param args console arguments
     */
    public static void main(String[] args) {
        /*
        1222

        C = A + B
        long
        sum of the smallest elements in a row
         */

        int n = 5;
        int m = 4;

        long[][] a = generateMatrix(n, m);

        System.out.println("A:");
        showMatrix(a);


        long[][] b = generateMatrix(n, m);

        System.out.println("B:");
        showMatrix(b);


        long[][] c = addMatrices(a, b);

        System.out.println("C: ");
        showMatrix(c);


        long result = calcSmallestInRowSum(c);

        System.out.println("Result: " + result);
    }

    /**
     * Generate matrix with n rows and m columns with numbers in [-39;99]
     * @param n number of rows
     * @param m number of cols
     * @return random matrix
     */
    public static long[][] generateMatrix(int n, int m) {
        long[][] matrix = new long[n][m];

        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = rand.nextLong(139) - 39;
            }
        }

        return matrix;
    }

    /**
     * Output matrix into console
     * @param matrix to be output
     */
    public static void showMatrix(long[][] matrix) {
        for (long[] row : matrix) {
            for (long num : row) {
                System.out.printf("%5d", num);
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Add two matrices
     * @param first matrix to be added
     * @param second matrix to be added
     * @return resulting matrix
     */
    public static long[][] addMatrices(long[][] first, long[][] second) {
        int n = first.length;
        int m = second[0].length;

        long[][] result = new long[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = first[i][j] + second[i][j];
            }
        }
        return result;
    }

    /**
     * Calculate the sum of the smallest numbers from each row in a matrix
     * @param matrix input matrix
     * @return sum
     */
    public static long calcSmallestInRowSum(long[][] matrix) {
        long sum = 0;

        for (long[] row : matrix) {
            long min = row[0];

            for (long num : row) {
                if (num < min) {
                    min = num;
                }
            }

            sum += min;
        }

        return sum;
    }
}
