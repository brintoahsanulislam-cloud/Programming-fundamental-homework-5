
package task3;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number of subjects: ");
    int subjects = input.nextInt();

    System.out.print("Enter number of students: ");
    int students = input.nextInt();

    int[][] grades = new int[students][subjects];
    double[] averages = new double[students];

    System.out.println("Enter the grades of each student:");

        int i = 0;
        while (i < students) {
            int j = 0;

            while (j < subjects) {
                grades[i][j] = input.nextInt();
                j++;
            }

            i++;
        }

        double totalGrades = 0;
        double highestAverage = -1;

        System.out.println("Student averages:");

        i = 0;
        while (i < students) {

            int sum = 0;
            int j = 0;

            while (j < subjects) {
                sum += grades[i][j];
                totalGrades += grades[i][j];
                j++;
            }

            averages[i] = (double) sum / subjects;

            System.out.println(averages[i]);

            if (averages[i] > highestAverage) {
                highestAverage = averages[i];
            }

            i++;
        }

        double groupAverage = totalGrades / (students * subjects);

        System.out.println();
        System.out.println("Group average:");
        System.out.println(groupAverage);

        System.out.println();
        System.out.println("Highest-performing student:");

        i = 0;
        while (i < students) {
            if (averages[i] == highestAverage) {
                System.out.println(i + 1);
            }
            i++;
        }

        System.out.println();
        System.out.println("Students with at least one grade below 5:");

        boolean found = false;

            i = 0;
            while (i < students) {

            int j = 0;
            boolean hasLowGrade = false;

            while (j < subjects) {
                if (grades[i][j] < 5) {
                    hasLowGrade = true;
                }
                j++;
            }

            if (hasLowGrade) {
                System.out.println(i + 1);
                found = true;
            }

            i++;
        }

        if (!found) {
            System.out.println("None");
        }

        input.close();
    }
}
