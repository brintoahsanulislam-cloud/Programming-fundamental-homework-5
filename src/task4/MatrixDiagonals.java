
package task4;

import java.util.Scanner;

public class MatrixDiagonals {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the matrix: ");
        int n = input.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter the matrix elements:");

        int i = 0;
        while (i < n) {
            int j = 0;

            while (j < n) {
                matrix[i][j] = input.nextInt();
                j++;
            }

            i++;
        }

        i = 0;
        while (i < n) {
            int j = 0;

            while (j < n) {
                if (i == j || i + j == n - 1) {
                    matrix[i][j] = 0;
                }

                j++;
            }

            i++;
        }

        System.out.println("Modified matrix:");

        i = 0;
        while (i < n) {
            int j = 0;

            while (j < n) {
                System.out.print(matrix[i][j] + " ");
                j++;
            }

            System.out.println();
            i++;
        }

        input.close();
    }
}
