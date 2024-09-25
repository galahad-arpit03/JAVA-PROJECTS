package stringStringBuffer;

// Question 3: Given a string, if the first or last chars are 'x', return the string 
// without those "x" chars, otherwise return the string unchanged.

import java.util.Scanner;

public class A7_RemoveXCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (input.startsWith("x")) {
            input = input.substring(1);
        }
        if (input.endsWith("x")) {
            input = input.substring(0, input.length() - 1);
        }
        System.out.println("Result: " + input);
        scanner.close();
    }
}
