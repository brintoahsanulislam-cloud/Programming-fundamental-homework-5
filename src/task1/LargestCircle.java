package task1;

import java.util.Scanner;

public class LargestCircle {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of circles: ");
    int n = input.nextInt();

    int[] radius = new int[n];
    System.out.println("Enter the radii of the circles:");

        int i = 0;
        while (i < n) {
            radius[i] = input.nextInt();
            i++;
        }

        int largest = radius[0];
        int count = 0;

        i = 0;
        while (i < n) {

            if (radius[i] > largest) {
                largest = radius[i];
                count = 1;
            } else if (radius[i] == largest) {
                count++;
            }

            i++;
        }

        System.out.println(largest + " - " + count);
    }
}
