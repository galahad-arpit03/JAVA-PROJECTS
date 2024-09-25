package stringStringBuffer;

// Question 2: Write a java program that will concatenate 7 strings and return the result.
// The result should be in lowercase. If the concatenation creates a double-char, 
// then one of the characters needs to be omitted.

import java.util.Scanner;

public class A2_StringConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            String input = scanner.next().toLowerCase();
            if (result.length() > 0 && result.charAt(result.length() - 1) == input.charAt(0)) {
                result.append(input.substring(1));
            } else {
                result.append(input);
            }
        }
        
        System.out.println("Concatenated Result: " + result.toString());
        scanner.close();
    }
}
