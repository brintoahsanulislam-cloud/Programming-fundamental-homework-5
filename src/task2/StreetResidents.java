
package task2;

import java.util.Scanner;

public class StreetResidents {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of houses: ");
    int n = input.nextInt();

    int[] residents = new int[n];

    System.out.println("Enter the number of residents in each house:");

        int i = 0;
        while (i < n) {
            residents[i] = input.nextInt();
            i++;
        }

        int total = 0;
        int leftResidents = 0;
        int rightResidents = 0;
        int leftHouses = 0;
        int rightHouses = 0;

        i = 0;
        while (i < n) {

            total += residents[i];

            if ((i + 1) % 2 != 0) {
                leftResidents += residents[i];
                leftHouses++;
            } else {
                rightResidents += residents[i];
                rightHouses++;
            }

            i++;
        }

        System.out.println("Total residents: " + total);
        System.out.println("Residents on the left: " + leftResidents);
        System.out.println("Residents on the right: " + rightResidents);

        if (leftHouses > 0) {
            double leftAverage = (double) leftResidents / leftHouses;
            System.out.println("Average per house on the left: " + leftAverage);
        } else {
            System.out.println("Average per house on the left: N/A");
        }
        if (rightHouses > 0) {
            double rightAverage = (double) rightResidents / rightHouses;
            System.out.println("Average per house on the right: " + rightAverage);
        } else {
            System.out.println("Average per house on the right: N/A");
        }

        input.close();
    }
}
