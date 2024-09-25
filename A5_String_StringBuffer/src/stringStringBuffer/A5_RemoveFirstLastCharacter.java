package stringStringBuffer;

// Question 1: Write a java program that accepts a string and returns a new string 
// without the first and last character of the input string.

import java.util.Scanner;

public class A5_RemoveFirstLastCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String result = input.length() > 1 ? input.substring(1, input.length() - 1) : "";
        System.out.println("Result: " + result);
        scanner.close();
    }
}
