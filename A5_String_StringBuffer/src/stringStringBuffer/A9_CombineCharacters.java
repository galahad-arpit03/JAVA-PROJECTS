package stringStringBuffer;

// Question 5: Given two strings, a and b, print a new string which is made of 
// the following combination: first character of a, the first character of b, 
// second character of a, second character of b, and so on. Any characters left will go to the end of the result.

import java.util.Scanner;

public class A9_CombineCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String a = scanner.nextLine();
        System.out.print("Enter second string: ");
        String b = scanner.nextLine();

        StringBuilder result = new StringBuilder();
        int length = Math.max(a.length(), b.length());

        for (int i = 0; i < length; i++) {
            if (i < a.length()) {
                result.append(a.charAt(i));
            }
            if (i < b.length()) {
                result.append(b.charAt(i));
            }
        }

        System.out.println("Result: " + result.toString());
        scanner.close();
    }
}
