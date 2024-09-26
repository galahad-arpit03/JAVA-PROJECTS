package test;
import java.util.Scanner;

public class MarksCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] studentNames = new String[2];
        int[][] marks = new int[2][3];

        for (int i = 0; i < 2; i++) {
            try {
                System.out.println("Enter the name of student " + (i + 1));
                studentNames[i] = scanner.nextLine();

                System.out.println("Enter marks in 3 subjects for " + studentNames[i]);
                for (int j = 0; j < 3; j++) {
                    int mark = Integer.parseInt(scanner.nextLine());
                    if (mark < 0) {
                        throw new NegativeMarksException("Marks cannot be negative");
                    }
                    if (mark < 0 || mark > 100) {
                        throw new NumberFormatException("Marks should be in the range 0-100");
                    }
                    marks[i][j] = mark;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NegativeMarksException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Calculate average marks
        for (int i = 0; i < 2; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += marks[i][j];
            }
            double average = sum / 3.0;
            System.out.println("Average marks of " + studentNames[i] + ": " + average);
        }

        scanner.close();
    }
}
