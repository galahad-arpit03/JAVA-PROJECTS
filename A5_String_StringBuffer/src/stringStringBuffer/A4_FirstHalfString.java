package stringStringBuffer;

// Question 4: Write a java program that will return the first half of the string, 
// if the length of the string is even. It should return null for odd length string.

import java.util.Scanner;

public class A4_FirstHalfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        if (input.length() % 2 == 0) {
            String result = input.substring(0, input.length() / 2);
            System.out.println("First half: " + result);
        } else {
            System.out.println("Result: null");
        }

        scanner.close();
    }
}
